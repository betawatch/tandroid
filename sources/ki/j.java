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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class j {
    public long A;
    public long B;
    public int C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final q a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final k f;
    public final a g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final long[] i = new long[256];
    public final long[] j = new long[256];
    public MediaCodec k;
    public MediaCodec l;
    public AudioRecord m;
    public Surface n;
    public Thread o;
    public Thread p;
    public volatile boolean q;
    public volatile long r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;

    public j(q qVar, long j3, int i10, int i11, int i12, k kVar, a aVar) {
        this.a = qVar;
        this.b = j3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = kVar;
        this.g = aVar;
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
        this.l = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
        this.f.b("audio encoder configure: codec=" + this.l.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
        this.l.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
        this.m = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
    }

    public final void b() {
        int i10 = this.c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        createVideoFormat.setInteger("frame-rate", this.e);
        createVideoFormat.setInteger("i-frame-interval", 1);
        this.k = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
        this.f.b("video encoder configure: codec=" + this.k.getName() + ", format=" + createVideoFormat);
        this.k.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.n = this.k.createInputSurface();
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        int dequeueOutputBuffer = this.l.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (dequeueOutputBuffer >= 0) {
            int i10 = bufferInfo.size;
            boolean z11 = true;
            if (i10 > 0 && (bufferInfo.flags & 2) == 0) {
                this.y++;
                this.w += i10;
                i(false, bufferInfo);
                p(false, this.l.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.l.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.l.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            m(this.l.getOutputFormat(), false);
        }
        return z10;
    }

    public final boolean d() {
        return (this.D == Long.MIN_VALUE || this.E == Long.MIN_VALUE || this.F == Long.MIN_VALUE || this.G == Long.MIN_VALUE) ? false : true;
    }

    public final void e(Thread thread) {
        if (thread == null) {
            return;
        }
        try {
            thread.join(5000L);
            if (thread.isAlive()) {
                this.f.b("encoder thread did not stop: " + thread.getName());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized Surface f() {
        if (this.s) {
            return this.n;
        }
        l();
        long nanoTime = System.nanoTime();
        try {
            b();
            a();
            this.k.start();
            this.s = true;
            this.f.b("codecs prepared: video=" + this.k.getName() + ", audio=" + this.l.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            return this.n;
        } catch (IOException | RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.r;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 < max) {
                return;
            } else {
                i10 = (int) (j10 % 256);
            }
        } while (this.i[i10] != j3);
        long nanoTime = System.nanoTime() - this.j[i10];
        this.z++;
        this.A += nanoTime;
        this.B = Math.max(this.B, nanoTime);
        if (this.z % 30 == 0) {
            this.f.b("codec latency: average=" + ((this.A / this.z) / 1000000.0f) + " ms, max=" + (this.B / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (!z10) {
            if (this.F == Long.MIN_VALUE) {
                this.F = j3;
            }
            long j10 = this.G;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.L++;
            }
            this.G = Math.max(j10, j3);
            return;
        }
        if (this.D == Long.MIN_VALUE) {
            this.D = j3;
        }
        long j11 = this.E;
        if (j11 != Long.MIN_VALUE && j3 < j11) {
            this.K++;
        }
        this.E = Math.max(j11, j3);
        if ((bufferInfo.flags & 1) != 0) {
            this.J++;
            long j12 = this.H;
            if (j12 != Long.MIN_VALUE) {
                this.I = Math.max(this.I, j3 - j12);
            }
            this.H = j3;
        }
    }

    public final void j() {
        this.s = false;
        this.t = false;
        AudioRecord audioRecord = this.m;
        if (audioRecord != null) {
            audioRecord.release();
            this.m = null;
        }
        Surface surface = this.n;
        if (surface != null) {
            surface.release();
            this.n = null;
        }
        MediaCodec mediaCodec = this.k;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.l;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.l = null;
        this.k = null;
        this.p = null;
        this.o = null;
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
        this.f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            k2.u uVar = this.g.a;
            ((o0) uVar.b).h.post(new l(2, uVar, runtimeException));
        }
    }

    public final void l() {
        this.q = false;
        this.u = 0L;
        this.w = 0L;
        this.v = 0L;
        this.y = 0;
        this.x = 0;
        this.r = 0L;
        this.z = 0;
        this.B = 0L;
        this.A = 0L;
        this.E = Long.MIN_VALUE;
        this.D = Long.MIN_VALUE;
        this.G = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.H = Long.MIN_VALUE;
        this.I = 0L;
        this.J = 0;
        this.L = 0;
        this.K = 0;
        this.N = 0;
        this.M = 0;
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
                    this.C = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.f(mediaFormat, z10);
        k kVar = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        kVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.t) {
            return;
        }
        if (!this.s) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.u = System.nanoTime();
            this.l.start();
            this.m.startRecording();
            if (this.m.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.t = true;
            this.f.b("audio and video recording started: timeOriginNs=" + this.u + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.m.getAudioSessionId());
            final int i10 = 0;
            this.o = new Thread(new Runnable(this) { // from class: ki.i
                public final /* synthetic */ j b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    j jVar = this.b;
                    jVar.getClass();
                    switch (i11) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = jVar.k.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        jVar.m(jVar.k.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            jVar.x++;
                                            jVar.v += i12;
                                            jVar.i(true, bufferInfo);
                                            jVar.h(bufferInfo.presentationTimeUs);
                                            jVar.p(true, jVar.k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        jVar.k.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (jVar.q) {
                                        jVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        jVar.k(e);
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
                                    z11 = jVar.c(bufferInfo2, z12 ? 10000L : j3);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = jVar.l.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (jVar.q) {
                                                jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, j11 == Long.MIN_VALUE ? j3 : j11 + ((1000000 * j10) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = jVar.l.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    int read = jVar.m.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            jVar.M++;
                                                        } else {
                                                            jVar.N++;
                                                        }
                                                        jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                    } else {
                                                        int i13 = read / 2;
                                                        if (j11 == Long.MIN_VALUE) {
                                                            long nanoTime = (System.nanoTime() - jVar.u) / 1000;
                                                            long max = Math.max(j3, nanoTime - ((i13 * 1000000) / 48000));
                                                            jVar.f.b("first audio input: basePtsUs=" + max + ", frames=" + i13 + ", bufferEndUs=" + nanoTime);
                                                            j11 = max;
                                                        }
                                                        jVar.l.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j11 + ((1000000 * j10) / 48000), 0);
                                                        j10 += i13;
                                                        j3 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (RuntimeException e7) {
                                    if (jVar.q) {
                                        jVar.f.a("audio capture failed while stopping", e7);
                                    } else {
                                        jVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoVideoEncoder");
            final int i11 = 1;
            this.p = new Thread(new Runnable(this) { // from class: ki.i
                public final /* synthetic */ j b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    j jVar = this.b;
                    jVar.getClass();
                    switch (i112) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = jVar.k.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        jVar.m(jVar.k.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            jVar.x++;
                                            jVar.v += i12;
                                            jVar.i(true, bufferInfo);
                                            jVar.h(bufferInfo.presentationTimeUs);
                                            jVar.p(true, jVar.k.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        jVar.k.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (jVar.q) {
                                        jVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        jVar.k(e);
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
                                    z11 = jVar.c(bufferInfo2, z12 ? 10000L : j3);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = jVar.l.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (jVar.q) {
                                                jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, j11 == Long.MIN_VALUE ? j3 : j11 + ((1000000 * j10) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = jVar.l.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    int read = jVar.m.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            jVar.M++;
                                                        } else {
                                                            jVar.N++;
                                                        }
                                                        jVar.l.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                    } else {
                                                        int i13 = read / 2;
                                                        if (j11 == Long.MIN_VALUE) {
                                                            long nanoTime = (System.nanoTime() - jVar.u) / 1000;
                                                            long max = Math.max(j3, nanoTime - ((i13 * 1000000) / 48000));
                                                            jVar.f.b("first audio input: basePtsUs=" + max + ", frames=" + i13 + ", bufferEndUs=" + nanoTime);
                                                            j11 = max;
                                                        }
                                                        jVar.l.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j11 + ((1000000 * j10) / 48000), 0);
                                                        j10 += i13;
                                                        j3 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (RuntimeException e7) {
                                    if (jVar.q) {
                                        jVar.f.a("audio capture failed while stopping", e7);
                                    } else {
                                        jVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.o.start();
            this.p.start();
        } catch (RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void o() {
        synchronized (this) {
            try {
                if (this.s && !this.q) {
                    if (!this.t) {
                        j();
                        return;
                    }
                    this.q = true;
                    try {
                        this.m.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.k.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f.a("video encoder EOS failed", e);
                    }
                    e(this.o);
                    e(this.p);
                    long j3 = d() ? this.F - this.D : Long.MIN_VALUE;
                    long j10 = d() ? this.G - this.E : Long.MIN_VALUE;
                    long j11 = this.D;
                    long j12 = this.E;
                    long j13 = (j11 == Long.MIN_VALUE || j12 <= j11) ? 0L : j12 - j11;
                    long j14 = this.F;
                    long j15 = this.G;
                    long j16 = (j14 == Long.MIN_VALUE || j15 <= j14) ? 0L : j15 - j14;
                    k kVar = this.f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.x);
                    sb2.append(", videoBytes=");
                    sb2.append(this.v);
                    sb2.append(", videoPts=");
                    sb2.append(g(this.D, this.E));
                    sb2.append(", actualVideoBitrate=");
                    sb2.append(j13 <= 0 ? "n/a" : String.valueOf((this.v * 8000000) / j13));
                    sb2.append(", keyframes=");
                    sb2.append(this.J);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.I);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.K);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.y);
                    sb2.append(", audioBytes=");
                    sb2.append(this.w);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.F, this.G));
                    sb2.append(", actualAudioBitrate=");
                    sb2.append(j16 <= 0 ? "n/a" : String.valueOf((this.w * 8000000) / j16));
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.L);
                    sb2.append(", avStartDeltaUs=");
                    sb2.append(j3 == Long.MIN_VALUE ? "n/a" : String.valueOf(j3));
                    sb2.append(", avEndDeltaUs=");
                    sb2.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.M);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.N);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.z;
                    sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.A / i10) / 1000000.0f));
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(this.B / 1000000.0f);
                    kVar.b(sb2.toString());
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
                int i11 = this.C;
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
