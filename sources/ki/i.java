package ki;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class i {
    public long A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final o a;
    public final long b;
    public final int c;
    public final int d;
    public final j e;
    public final b f;
    public final AtomicBoolean g = new AtomicBoolean();
    public final long[] h = new long[256];
    public final long[] i = new long[256];
    public MediaCodec j;
    public MediaCodec k;
    public AudioRecord l;
    public Surface m;
    public Thread n;
    public Thread o;
    public volatile boolean p;
    public volatile long q;
    public boolean r;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public long z;

    public i(o oVar, long j3, int i10, int i11, j jVar, b bVar) {
        this.a = oVar;
        this.b = j3;
        this.c = i10;
        this.d = i11;
        this.e = jVar;
        this.f = bVar;
    }

    public static String g(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j3 + ".." + j10;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize <= 0) {
            throw new IllegalStateException("Unsupported audio recording configuration");
        }
        int max = Math.max(minBufferSize * 2, 4096);
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MediaController.AUDIO_MIME_TYPE, 48000, 1);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 64000);
        createAudioFormat.setInteger("max-input-size", max);
        this.k = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
        this.e.b("audio encoder configure: codec=" + this.k.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
        this.k.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
        this.l = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
    }

    public final void b() {
        int i10 = this.c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        this.j = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
        this.e.b("video encoder configure: codec=" + this.j.getName() + ", format=" + createVideoFormat);
        this.j.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.m = this.j.createInputSurface();
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        int dequeueOutputBuffer = this.k.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (dequeueOutputBuffer >= 0) {
            int i10 = bufferInfo.size;
            boolean z11 = true;
            if (i10 > 0 && (bufferInfo.flags & 2) == 0) {
                this.x++;
                this.v += i10;
                i(false, bufferInfo);
                p(false, this.k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.k.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.k.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            m(this.k.getOutputFormat(), false);
        }
        return z10;
    }

    public final boolean d() {
        return (this.C == Long.MIN_VALUE || this.D == Long.MIN_VALUE || this.E == Long.MIN_VALUE || this.F == Long.MIN_VALUE) ? false : true;
    }

    public final void e(Thread thread) {
        if (thread == null) {
            return;
        }
        try {
            thread.join(5000L);
            if (thread.isAlive()) {
                this.e.b("encoder thread did not stop: " + thread.getName());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized Surface f() {
        if (this.r) {
            return this.m;
        }
        l();
        long nanoTime = System.nanoTime();
        try {
            b();
            a();
            this.j.start();
            this.r = true;
            this.e.b("codecs prepared: video=" + this.j.getName() + ", audio=" + this.k.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            return this.m;
        } catch (IOException | RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.q;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 < max) {
                return;
            } else {
                i10 = (int) (j10 % 256);
            }
        } while (this.h[i10] != j3);
        long nanoTime = System.nanoTime() - this.i[i10];
        this.y++;
        this.z += nanoTime;
        this.A = Math.max(this.A, nanoTime);
        if (this.y % 30 == 0) {
            this.e.b("codec latency: average=" + ((this.z / this.y) / 1000000.0f) + " ms, max=" + (this.A / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (!z10) {
            if (this.E == Long.MIN_VALUE) {
                this.E = j3;
            }
            long j10 = this.F;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.K++;
            }
            this.F = Math.max(j10, j3);
            return;
        }
        if (this.C == Long.MIN_VALUE) {
            this.C = j3;
        }
        long j11 = this.D;
        if (j11 != Long.MIN_VALUE && j3 < j11) {
            this.J++;
        }
        this.D = Math.max(j11, j3);
        if ((bufferInfo.flags & 1) != 0) {
            this.I++;
            long j12 = this.G;
            if (j12 != Long.MIN_VALUE) {
                this.H = Math.max(this.H, j3 - j12);
            }
            this.G = j3;
        }
    }

    public final void j() {
        this.r = false;
        this.s = false;
        AudioRecord audioRecord = this.l;
        if (audioRecord != null) {
            audioRecord.release();
            this.l = null;
        }
        Surface surface = this.m;
        if (surface != null) {
            surface.release();
            this.m = null;
        }
        MediaCodec mediaCodec = this.j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.k;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.k = null;
        this.j = null;
        this.o = null;
        this.n = null;
    }

    public final void k(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.e.a(sb2.toString(), runtimeException);
        if (this.g.compareAndSet(false, true)) {
            k2.u uVar = this.f.a;
            ((h0) uVar.b).h.post(new c0(0, uVar, runtimeException));
        }
    }

    public final void l() {
        this.p = false;
        this.t = 0L;
        this.v = 0L;
        this.u = 0L;
        this.x = 0;
        this.w = 0;
        this.q = 0L;
        this.y = 0;
        this.A = 0L;
        this.z = 0L;
        this.D = Long.MIN_VALUE;
        this.C = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.E = Long.MIN_VALUE;
        this.G = Long.MIN_VALUE;
        this.H = 0L;
        this.I = 0;
        this.K = 0;
        this.J = 0;
        this.M = 0;
        this.L = 0;
    }

    public final void m(MediaFormat mediaFormat, boolean z10) {
        if (z10) {
            try {
                if (mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") && mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    int i10 = 0;
                    int remaining = byteBuffer == null ? 0 : byteBuffer.remaining();
                    if (byteBuffer2 != null) {
                        i10 = byteBuffer2.remaining();
                    }
                    this.B = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.f(mediaFormat, z10);
        j jVar = this.e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        jVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.s) {
            return;
        }
        if (!this.r) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.t = System.nanoTime();
            this.k.start();
            this.l.startRecording();
            if (this.l.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.s = true;
            this.e.b("audio and video recording started: timeOriginNs=" + this.t + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.l.getAudioSessionId());
            final int i10 = 0;
            this.n = new Thread(new Runnable(this) { // from class: ki.h
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    i iVar = this.b;
                    iVar.getClass();
                    switch (i11) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = iVar.j.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        iVar.m(iVar.j.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            iVar.w++;
                                            iVar.u += i12;
                                            iVar.i(true, bufferInfo);
                                            iVar.h(bufferInfo.presentationTimeUs);
                                            iVar.p(true, iVar.j.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        iVar.j.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (iVar.p) {
                                        iVar.e.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        iVar.k(e);
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j3 = 0;
                            boolean z11 = false;
                            long j10 = 0;
                            boolean z12 = false;
                            long j11 = Long.MIN_VALUE;
                            while (!z11) {
                                try {
                                    z11 = iVar.c(bufferInfo2, z12 ? 10000L : j3);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = iVar.k.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (iVar.p) {
                                                iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, j11 == Long.MIN_VALUE ? j3 : j11 + ((1000000 * j10) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = iVar.k.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    int read = iVar.l.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            iVar.L++;
                                                        } else {
                                                            iVar.M++;
                                                        }
                                                        iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                    } else {
                                                        int i13 = read / 2;
                                                        if (j11 == Long.MIN_VALUE) {
                                                            long nanoTime = (System.nanoTime() - iVar.t) / 1000;
                                                            long max = Math.max(j3, nanoTime - ((i13 * 1000000) / 48000));
                                                            iVar.e.b("first audio input: basePtsUs=" + max + ", frames=" + i13 + ", bufferEndUs=" + nanoTime);
                                                            j11 = max;
                                                        }
                                                        iVar.k.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j11 + ((1000000 * j10) / 48000), 0);
                                                        j10 += i13;
                                                        j3 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (RuntimeException e7) {
                                    if (iVar.p) {
                                        iVar.e.a("audio capture failed while stopping", e7);
                                    } else {
                                        iVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoVideoEncoder");
            final int i11 = 1;
            this.o = new Thread(new Runnable(this) { // from class: ki.h
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    i iVar = this.b;
                    iVar.getClass();
                    switch (i112) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = iVar.j.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        iVar.m(iVar.j.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            iVar.w++;
                                            iVar.u += i12;
                                            iVar.i(true, bufferInfo);
                                            iVar.h(bufferInfo.presentationTimeUs);
                                            iVar.p(true, iVar.j.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        iVar.j.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (iVar.p) {
                                        iVar.e.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        iVar.k(e);
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j3 = 0;
                            boolean z11 = false;
                            long j10 = 0;
                            boolean z12 = false;
                            long j11 = Long.MIN_VALUE;
                            while (!z11) {
                                try {
                                    z11 = iVar.c(bufferInfo2, z12 ? 10000L : j3);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = iVar.k.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (iVar.p) {
                                                iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, j11 == Long.MIN_VALUE ? j3 : j11 + ((1000000 * j10) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = iVar.k.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    int read = iVar.l.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            iVar.L++;
                                                        } else {
                                                            iVar.M++;
                                                        }
                                                        iVar.k.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                    } else {
                                                        int i13 = read / 2;
                                                        if (j11 == Long.MIN_VALUE) {
                                                            long nanoTime = (System.nanoTime() - iVar.t) / 1000;
                                                            long max = Math.max(j3, nanoTime - ((i13 * 1000000) / 48000));
                                                            iVar.e.b("first audio input: basePtsUs=" + max + ", frames=" + i13 + ", bufferEndUs=" + nanoTime);
                                                            j11 = max;
                                                        }
                                                        iVar.k.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j11 + ((1000000 * j10) / 48000), 0);
                                                        j10 += i13;
                                                        j3 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (RuntimeException e7) {
                                    if (iVar.p) {
                                        iVar.e.a("audio capture failed while stopping", e7);
                                    } else {
                                        iVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.n.start();
            this.o.start();
        } catch (RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void o() {
        synchronized (this) {
            try {
                if (this.r && !this.p) {
                    if (!this.s) {
                        j();
                        return;
                    }
                    this.p = true;
                    try {
                        this.l.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.j.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.e.a("video encoder EOS failed", e);
                    }
                    e(this.n);
                    e(this.o);
                    long j3 = d() ? this.E - this.C : Long.MIN_VALUE;
                    long j10 = d() ? this.F - this.D : Long.MIN_VALUE;
                    long j11 = this.C;
                    long j12 = this.D;
                    long j13 = (j11 == Long.MIN_VALUE || j12 <= j11) ? 0L : j12 - j11;
                    long j14 = this.E;
                    long j15 = this.F;
                    long j16 = (j14 == Long.MIN_VALUE || j15 <= j14) ? 0L : j15 - j14;
                    j jVar = this.e;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.w);
                    sb2.append(", videoBytes=");
                    sb2.append(this.u);
                    sb2.append(", videoPts=");
                    sb2.append(g(this.C, this.D));
                    sb2.append(", actualVideoBitrate=");
                    sb2.append(j13 <= 0 ? "n/a" : String.valueOf((this.u * 8000000) / j13));
                    sb2.append(", keyframes=");
                    sb2.append(this.I);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.H);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.J);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.x);
                    sb2.append(", audioBytes=");
                    sb2.append(this.v);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.E, this.F));
                    sb2.append(", actualAudioBitrate=");
                    sb2.append(j16 <= 0 ? "n/a" : String.valueOf((this.v * 8000000) / j16));
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.K);
                    sb2.append(", avStartDeltaUs=");
                    sb2.append(j3 == Long.MIN_VALUE ? "n/a" : String.valueOf(j3));
                    sb2.append(", avEndDeltaUs=");
                    sb2.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.L);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.M);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.y;
                    sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.z / i10) / 1000000.0f));
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(this.A / 1000000.0f);
                    jVar.b(sb2.toString());
                    j();
                }
            } finally {
            }
        }
    }

    public final void p(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer == null) {
            return;
        }
        if (z10) {
            try {
                int i11 = this.B;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.g(z10, byteBuffer, bufferInfo, this.b);
    }
}
