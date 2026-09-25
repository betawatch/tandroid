package ki;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class l implements p {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;
    public long H;
    public int I;
    public volatile long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public long Y;
    public final t a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final m f;
    public final b g;
    public MediaCodec m;
    public MediaCodec n;
    public AudioRecord o;
    public Surface p;
    public Thread q;
    public Thread r;
    public c s;
    public c t;
    public volatile boolean u;
    public boolean v;
    public volatile long x;
    public boolean y;
    public boolean z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList i = new ArrayList();
    public final AudioTimestamp j = new AudioTimestamp();
    public final long[] k = new long[256];
    public final long[] l = new long[256];
    public volatile long w = Long.MAX_VALUE;

    public l(t tVar, long j3, int i10, int i11, int i12, m mVar, b bVar) {
        this.a = tVar;
        this.b = j3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = mVar;
        this.g = bVar;
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
        int max = Math.max(minBufferSize * 4, 16384);
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MediaController.AUDIO_MIME_TYPE, 48000, 1);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 64000);
        createAudioFormat.setInteger("max-input-size", max);
        this.n = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
        this.f.b("audio encoder configure: codec=" + this.n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
        this.n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
        this.o = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
    }

    public final void b() {
        int i10 = this.c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
        this.m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType(MediaController.VIDEO_MIME_TYPE).getVideoCapabilities();
        if (!videoCapabilities.isSizeSupported(i10, i10) || !videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            throw new IOException(a4.a.o(i11, " fps", hg.c.k("Video encoder does not support ", i10, "x", i10, " at ")));
        }
        this.f.b("video encoder configure: codec=" + this.m.getName() + ", format=" + createVideoFormat);
        this.m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.p = this.m.createInputSurface();
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.n.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.w) {
                    this.U++;
                    this.V++;
                } else if (this.X) {
                    this.E++;
                    this.C += bufferInfo.size;
                    i(false, bufferInfo);
                    r(false, outputBuffer, bufferInfo);
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    int position = outputBuffer.position();
                    int limit = outputBuffer.limit();
                    try {
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(outputBuffer).flip();
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                        this.i.add(new k(allocateDirect, bufferInfo2));
                        long j10 = this.J;
                        if (j10 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j10) {
                            d(j10, false);
                        }
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j3, boolean z10) {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (((k) arrayList.get(i10)).b.presentationTimeUs >= j3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            if (!z10) {
                return;
            } else {
                i10 = arrayList.size() - 1;
            }
        } else if (i10 > 0 && j3 - ((k) arrayList.get(i10 - 1)).b.presentationTimeUs <= ((k) arrayList.get(i10)).b.presentationTimeUs - j3) {
            i10--;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.U++;
        }
        k kVar = (k) arrayList.get(i10);
        this.Y = kVar.b.presentationTimeUs - j3;
        while (i10 < arrayList.size()) {
            k kVar2 = (k) arrayList.get(i10);
            ByteBuffer byteBuffer = kVar2.a;
            MediaCodec.BufferInfo bufferInfo = kVar2.b;
            this.E++;
            this.C += bufferInfo.size;
            i(false, bufferInfo);
            r(false, byteBuffer, bufferInfo);
            i10++;
        }
        arrayList.clear();
        this.X = true;
        StringBuilder u10 = a4.a.u(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
        u10.append(kVar.b.presentationTimeUs);
        u10.append(", deltaUs=");
        u10.append(this.Y);
        this.f.b(u10.toString());
    }

    public final boolean e() {
        return (this.J == Long.MIN_VALUE || this.K == Long.MIN_VALUE || this.L == Long.MIN_VALUE || this.M == Long.MIN_VALUE) ? false : true;
    }

    public final void f(Thread thread) {
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

    public final void h(long j3) {
        int i10;
        long j10 = this.x;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 < max) {
                return;
            } else {
                i10 = (int) (j10 % 256);
            }
        } while (this.k[i10] != j3);
        long nanoTime = System.nanoTime() - this.l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f.b("codec latency: average=" + ((this.G / this.F) / 1000000.0f) + " ms, max=" + (this.H / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (!z10) {
            if (this.L == Long.MIN_VALUE) {
                this.L = j3;
            }
            long j10 = this.M;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.R++;
            }
            this.M = Math.max(j10, j3);
            return;
        }
        if (this.J == Long.MIN_VALUE) {
            this.J = j3;
        }
        long j11 = this.K;
        if (j11 != Long.MIN_VALUE && j3 < j11) {
            this.Q++;
        }
        this.K = Math.max(j11, j3);
        if ((bufferInfo.flags & 1) != 0) {
            this.P++;
            long j12 = this.N;
            if (j12 != Long.MIN_VALUE) {
                this.O = Math.max(this.O, j3 - j12);
            }
            this.N = j3;
        }
    }

    public final void j() {
        this.y = false;
        this.z = false;
        this.s = null;
        this.t = null;
        AudioRecord audioRecord = this.o;
        if (audioRecord != null) {
            audioRecord.release();
            this.o = null;
        }
        Surface surface = this.p;
        if (surface != null) {
            surface.release();
            this.p = null;
        }
        MediaCodec mediaCodec = this.m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.n = null;
        this.m = null;
        this.r = null;
        this.q = null;
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
            ((s0) uVar.b).h.post(new h0(1, uVar, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.y && this.z) {
                    if (this.u) {
                        return this.w;
                    }
                    this.u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.w = max;
                    AudioRecord audioRecord = this.o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f.a("AudioRecord stop failed", e);
                        }
                    }
                    this.f.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.u = false;
        this.v = false;
        this.w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.x = 0L;
        this.F = 0;
        this.H = 0L;
        this.G = 0L;
        this.K = Long.MIN_VALUE;
        this.J = Long.MIN_VALUE;
        this.M = Long.MIN_VALUE;
        this.L = Long.MIN_VALUE;
        this.N = Long.MIN_VALUE;
        this.O = 0L;
        this.P = 0;
        this.R = 0;
        this.Q = 0;
        this.T = 0;
        this.S = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = Long.MIN_VALUE;
        this.s = null;
        this.t = null;
        this.i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        m mVar = this.f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.o;
            AudioTimestamp audioTimestamp = this.j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                mVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        mVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void o(MediaFormat mediaFormat, boolean z10) {
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
                    this.I = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.k(mediaFormat, z10);
        m mVar = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        mVar.b(sb2.toString());
    }

    public final synchronized void p(c cVar, c cVar2) {
        if (this.z) {
            return;
        }
        if (!this.y) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.n.start();
            this.o.startRecording();
            if (this.o.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.A = SystemClock.elapsedRealtimeNanos();
            this.s = cVar;
            this.t = cVar2;
            this.z = true;
            this.f.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.o.getAudioSessionId());
            final int i10 = 0;
            this.q = new Thread(new Runnable(this) { // from class: ki.j
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i11 = i10;
                    l lVar = this.b;
                    lVar.getClass();
                    switch (i11) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = lVar.m.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        lVar.o(lVar.m.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < lVar.w) {
                                                lVar.D++;
                                                lVar.B += bufferInfo.size;
                                                lVar.i(true, bufferInfo);
                                                lVar.h(bufferInfo.presentationTimeUs);
                                                lVar.r(true, lVar.m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                lVar.W++;
                                            }
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        lVar.m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (lVar.u) {
                                        lVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        lVar.k(e);
                                        return;
                                    }
                                }
                            }
                            return;
                        default:
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z12 = false;
                            long j13 = 0;
                            while (!z11) {
                                try {
                                    z11 = lVar.c(bufferInfo2, z12 ? 10000L : 0L);
                                    if (z11) {
                                        return;
                                    }
                                    int dequeueInputBuffer = lVar.n.dequeueInputBuffer(10000L);
                                    if (dequeueInputBuffer >= 0) {
                                        if (lVar.u) {
                                            lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                            z12 = true;
                                        } else {
                                            ByteBuffer inputBuffer = lVar.n.getInputBuffer(dequeueInputBuffer);
                                            if (inputBuffer == null) {
                                                lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                            } else {
                                                inputBuffer.clear();
                                                j3 = j11;
                                                int read = lVar.o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                if (read <= 0) {
                                                    if (read < 0) {
                                                        int i12 = lVar.S + 1;
                                                        lVar.S = i12;
                                                        if (read == -6 || i12 >= 3) {
                                                            throw new IllegalStateException("AudioRecord read failed: " + read);
                                                        }
                                                    } else {
                                                        lVar.T++;
                                                    }
                                                    lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                } else {
                                                    int i13 = read / 2;
                                                    if (j12 == j3) {
                                                        long n10 = lVar.n(i13);
                                                        m mVar = lVar.f;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("first audio input: basePtsUs=");
                                                        sb2.append(n10);
                                                        sb2.append(", frames=");
                                                        sb2.append(i13);
                                                        sb2.append(", timestampSource=");
                                                        j10 = 48000;
                                                        sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                        mVar.b(sb2.toString());
                                                        j12 = n10;
                                                    } else {
                                                        j10 = 48000;
                                                    }
                                                    lVar.n.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                    j13 += i13;
                                                    synchronized (lVar) {
                                                        if (lVar.s != null && !lVar.u) {
                                                            c cVar3 = lVar.s;
                                                            lVar.s = null;
                                                            lVar.f.b("audio capture ready; waiting for common A/V start frame");
                                                            cVar3.run();
                                                        }
                                                    }
                                                }
                                                j11 = j3;
                                            }
                                        }
                                    }
                                    j3 = j11;
                                    j11 = j3;
                                } catch (RuntimeException e7) {
                                    if (lVar.u) {
                                        lVar.f.a("audio capture failed while stopping", e7);
                                        return;
                                    } else {
                                        lVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            return;
                    }
                }
            }, "RoundVideoVideoEncoder");
            final int i11 = 1;
            this.r = new Thread(new Runnable(this) { // from class: ki.j
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i112 = i11;
                    l lVar = this.b;
                    lVar.getClass();
                    switch (i112) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = lVar.m.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        lVar.o(lVar.m.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < lVar.w) {
                                                lVar.D++;
                                                lVar.B += bufferInfo.size;
                                                lVar.i(true, bufferInfo);
                                                lVar.h(bufferInfo.presentationTimeUs);
                                                lVar.r(true, lVar.m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                lVar.W++;
                                            }
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        lVar.m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (lVar.u) {
                                        lVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        lVar.k(e);
                                        return;
                                    }
                                }
                            }
                            return;
                        default:
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z12 = false;
                            long j13 = 0;
                            while (!z11) {
                                try {
                                    z11 = lVar.c(bufferInfo2, z12 ? 10000L : 0L);
                                    if (z11) {
                                        return;
                                    }
                                    int dequeueInputBuffer = lVar.n.dequeueInputBuffer(10000L);
                                    if (dequeueInputBuffer >= 0) {
                                        if (lVar.u) {
                                            lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                            z12 = true;
                                        } else {
                                            ByteBuffer inputBuffer = lVar.n.getInputBuffer(dequeueInputBuffer);
                                            if (inputBuffer == null) {
                                                lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                            } else {
                                                inputBuffer.clear();
                                                j3 = j11;
                                                int read = lVar.o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                if (read <= 0) {
                                                    if (read < 0) {
                                                        int i12 = lVar.S + 1;
                                                        lVar.S = i12;
                                                        if (read == -6 || i12 >= 3) {
                                                            throw new IllegalStateException("AudioRecord read failed: " + read);
                                                        }
                                                    } else {
                                                        lVar.T++;
                                                    }
                                                    lVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                } else {
                                                    int i13 = read / 2;
                                                    if (j12 == j3) {
                                                        long n10 = lVar.n(i13);
                                                        m mVar = lVar.f;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("first audio input: basePtsUs=");
                                                        sb2.append(n10);
                                                        sb2.append(", frames=");
                                                        sb2.append(i13);
                                                        sb2.append(", timestampSource=");
                                                        j10 = 48000;
                                                        sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                        mVar.b(sb2.toString());
                                                        j12 = n10;
                                                    } else {
                                                        j10 = 48000;
                                                    }
                                                    lVar.n.queueInputBuffer(dequeueInputBuffer, 0, i13 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                    j13 += i13;
                                                    synchronized (lVar) {
                                                        if (lVar.s != null && !lVar.u) {
                                                            c cVar3 = lVar.s;
                                                            lVar.s = null;
                                                            lVar.f.b("audio capture ready; waiting for common A/V start frame");
                                                            cVar3.run();
                                                        }
                                                    }
                                                }
                                                j11 = j3;
                                            }
                                        }
                                    }
                                    j3 = j11;
                                    j11 = j3;
                                } catch (RuntimeException e7) {
                                    if (lVar.u) {
                                        lVar.f.a("audio capture failed while stopping", e7);
                                        return;
                                    } else {
                                        lVar.k(e7);
                                        return;
                                    }
                                }
                            }
                            return;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.q.start();
            this.r.start();
        } catch (RuntimeException e) {
            j();
            throw e;
        }
    }

    public final void q() {
        l();
        synchronized (this) {
            try {
                if (this.y && !this.v) {
                    if (!this.z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f.a("video encoder EOS failed", e);
                    }
                    f(this.q);
                    f(this.r);
                    long j3 = e() ? this.L - this.J : Long.MIN_VALUE;
                    long j10 = e() ? this.M - this.K : Long.MIN_VALUE;
                    long j11 = this.J;
                    long j12 = this.K;
                    long j13 = (j11 == Long.MIN_VALUE || j12 <= j11) ? 0L : j12 - j11;
                    long j14 = this.L;
                    long j15 = this.M;
                    long j16 = (j14 == Long.MIN_VALUE || j15 <= j14) ? 0L : j15 - j14;
                    m mVar = this.f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.D);
                    sb2.append(", videoBytes=");
                    sb2.append(this.B);
                    sb2.append(", videoPts=");
                    long j17 = j16;
                    sb2.append(g(this.J, this.K));
                    sb2.append(", actualVideoBitrate=");
                    sb2.append(j13 <= 0 ? "n/a" : String.valueOf((this.B * 8000000) / j13));
                    sb2.append(", keyframes=");
                    sb2.append(this.P);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.O);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.Q);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.E);
                    sb2.append(", audioBytes=");
                    sb2.append(this.C);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.L, this.M));
                    sb2.append(", actualAudioBitrate=");
                    sb2.append(j17 <= 0 ? "n/a" : String.valueOf((this.C * 8000000) / j17));
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.R);
                    sb2.append(", avStartDeltaUs=");
                    sb2.append(j3 == Long.MIN_VALUE ? "n/a" : String.valueOf(j3));
                    sb2.append(", avEndDeltaUs=");
                    sb2.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.S);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.T);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.U);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.V);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.W);
                    sb2.append(", stopPresentationTimeUs=");
                    sb2.append(this.w == Long.MAX_VALUE ? "n/a" : Long.valueOf(this.w));
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j18 = this.Y;
                    sb2.append(j18 == Long.MIN_VALUE ? "n/a" : String.valueOf(j18));
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.F;
                    sb2.append(i10 != 0 ? Float.valueOf((this.G / i10) / 1000000.0f) : "n/a");
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(this.H / 1000000.0f);
                    mVar.b(sb2.toString());
                    j();
                }
            } finally {
            }
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer == null) {
            return;
        }
        if (z10) {
            try {
                int i11 = this.I;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.m(z10, byteBuffer, bufferInfo, this.b);
    }
}
