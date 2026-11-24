// default package

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
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dk9 implements ik9 {
    public boolean A;
    public volatile long C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public long L;
    public long M;
    public int N;
    public volatile long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final nk9 a;
    public int a0;
    public final long b;
    public int b0;
    public final short c;
    public boolean c0;
    public final int d;
    public long d0;
    public final byte e;
    public final ek9 f;
    public final rj9 g;
    public final rj9 h;
    public MediaCodec n;
    public MediaCodec o;
    public AudioRecord p;
    public Surface q;
    public Thread r;
    public Thread s;
    public sj9 t;
    public sj9 u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public boolean y;
    public int z;
    public final AtomicBoolean i = new AtomicBoolean();
    public final ArrayList j = new ArrayList();
    public final AudioTimestamp k = new AudioTimestamp();
    public final long[] l = new long[256];
    public final long[] m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    /* JADX WARN: Multi-variable type inference failed */
    public dk9(nk9 nk9Var, long j, int i, int i2, int i3, ek9 ek9Var, rj9 rj9Var, rj9 rj9Var2) {
        this.a = nk9Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = ek9Var;
        this.g = rj9Var;
        this.h = rj9Var2;
    }

    public static MediaFormat c(int i, int i2, int i3) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i2);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        if (!mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") || mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") != 1) {
            return 0;
        }
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
        return (byteBuffer == null ? 0 : byteBuffer.remaining()) + (byteBuffer2 != null ? byteBuffer2.remaining() : 0);
    }

    public static String k(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return "n/a";
        }
        return j + ".." + j2;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize <= 0) {
            sc8.j("Unsupported audio recording configuration");
            return;
        }
        int max = Math.max(minBufferSize << 2, TLObject.FLAG_14);
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 64000);
        createAudioFormat.setInteger("max-input-size", max);
        this.o = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f.b("audio encoder configure: codec=" + this.o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
        this.o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
        this.p = audioRecord;
        if (audioRecord.getState() == 1) {
            return;
        }
        sc8.j("Unable to initialize AudioRecord");
    }

    public final void b() {
        short s = this.c;
        int i = this.d;
        byte b = this.e;
        MediaFormat c = c(s, i, b);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (!videoCapabilities.isSizeSupported(s, s) || !videoCapabilities.areSizeAndRateSupported(s, s, b)) {
            k93.f(de9.l(ir2.p("Video encoder does not support ", s, "x", s, " at "), b, " fps"));
            return;
        }
        this.f.b("video encoder configure: codec=" + this.n.getName() + ", format=" + c);
        this.n.configure(c, (Surface) null, (MediaCrypto) null, 1);
        this.q = this.n.createInputSurface();
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, j);
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.a0++;
                } else if (this.c0) {
                    this.J++;
                    this.H += bufferInfo.size;
                    m(false, bufferInfo);
                    v(false, outputBuffer, bufferInfo);
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
                        this.j.add(new ck9(allocateDirect, bufferInfo2));
                        long j2 = this.O;
                        if (j2 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j2) {
                            e(j2, false);
                        }
                    } catch (Throwable th) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z2 = false;
            }
            z |= z2;
            this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.o.getOutputFormat(), false);
        }
        if (z && !this.c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z;
    }

    public final void e(long j, boolean z) {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (((ck9) arrayList.get(i)).b.presentationTimeUs >= j) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            if (!z) {
                return;
            } else {
                i = arrayList.size() - 1;
            }
        } else if (i > 0 && j - ((ck9) arrayList.get(i - 1)).b.presentationTimeUs <= ((ck9) arrayList.get(i)).b.presentationTimeUs - j) {
            i--;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.Z++;
        }
        ck9 ck9Var = (ck9) arrayList.get(i);
        this.d0 = ck9Var.b.presentationTimeUs - j;
        while (i < arrayList.size()) {
            ck9 ck9Var2 = (ck9) arrayList.get(i);
            ByteBuffer byteBuffer = ck9Var2.a;
            MediaCodec.BufferInfo bufferInfo = ck9Var2.b;
            this.J++;
            this.H += bufferInfo.size;
            m(false, bufferInfo);
            v(false, byteBuffer, bufferInfo);
            i++;
        }
        arrayList.clear();
        this.c0 = true;
        StringBuilder o = ug8.o(j, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
        o.append(ck9Var.b.presentationTimeUs);
        o.append(", deltaUs=");
        o.append(this.d0);
        this.f.b(o.toString());
    }

    public final boolean g() {
        return (this.O == Long.MIN_VALUE || this.P == Long.MIN_VALUE || this.Q == Long.MIN_VALUE || this.R == Long.MIN_VALUE) ? false : true;
    }

    public final void h(Thread thread, long j) {
        if (thread != null) {
            try {
                thread.join(j);
                if (thread.isAlive()) {
                    this.f.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.t == null || this.v) {
                return;
            }
            sj9 sj9Var = this.t;
            this.t = null;
            this.f.b("audio capture ready; waiting for common A/V start frame");
            sj9Var.run();
        }
    }

    public final void j() {
        boolean z;
        synchronized (this) {
            int i = this.z - 1;
            this.z = i;
            z = this.A && i == 0;
            if (z) {
                this.A = false;
            }
        }
        if (z) {
            this.f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j) {
        int i;
        long j2 = this.C;
        long max = Math.max(0L, j2 - 256);
        do {
            j2--;
            if (j2 < max) {
                return;
            } else {
                i = (int) (j2 % 256);
            }
        } while (this.l[i] != j);
        long nanoTime = System.nanoTime() - this.m[i];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f.b("codec latency: average=" + ((this.L / this.K) / 1000000.0f) + " ms, max=" + (this.M / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        if (!z) {
            if (this.Q == Long.MIN_VALUE) {
                this.Q = j;
            }
            long j2 = this.R;
            if (j2 != Long.MIN_VALUE && j < j2) {
                this.W++;
            }
            this.R = Math.max(j2, j);
            return;
        }
        if (this.O == Long.MIN_VALUE) {
            this.O = j;
        }
        long j3 = this.P;
        if (j3 != Long.MIN_VALUE && j < j3) {
            this.V++;
        }
        this.P = Math.max(j3, j);
        if ((bufferInfo.flags & 1) != 0) {
            this.U++;
            long j4 = this.S;
            if (j4 != Long.MIN_VALUE) {
                this.T = Math.max(this.T, j - j4);
            }
            this.S = j;
        }
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.t = null;
        this.u = null;
        AudioRecord audioRecord = this.p;
        if (audioRecord != null) {
            audioRecord.release();
            this.p = null;
        }
        Surface surface = this.q;
        if (surface != null) {
            surface.release();
            this.q = null;
        }
        MediaCodec mediaCodec = this.n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.o = null;
        this.n = null;
        this.s = null;
        this.r = null;
    }

    public final void o(RuntimeException runtimeException) {
        String str;
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        this.f.a("codec error".concat(str), runtimeException);
        if (this.i.compareAndSet(false, true)) {
            this.g.a(runtimeException);
        }
    }

    public final long p() {
        synchronized (this) {
            if (!this.D || !this.E) {
                return Long.MAX_VALUE;
            }
            if (this.v) {
                return this.B;
            }
            this.v = true;
            long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.F) / 1000);
            this.B = max;
            AudioRecord audioRecord = this.p;
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
    }

    public final void q() {
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = 0;
        this.A = false;
        this.B = Long.MAX_VALUE;
        this.F = 0L;
        this.H = 0L;
        this.G = 0L;
        this.J = 0;
        this.I = 0;
        this.C = 0L;
        this.K = 0;
        this.M = 0L;
        this.L = 0L;
        this.P = Long.MIN_VALUE;
        this.O = Long.MIN_VALUE;
        this.R = Long.MIN_VALUE;
        this.Q = Long.MIN_VALUE;
        this.S = Long.MIN_VALUE;
        this.T = 0L;
        this.U = 0;
        this.W = 0;
        this.V = 0;
        this.Y = 0;
        this.X = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = Long.MIN_VALUE;
        this.t = null;
        this.u = null;
        this.j.clear();
    }

    public final long r(int i) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i * 1000000) / 48000));
        int i2 = Build.VERSION.SDK_INT;
        ek9 ek9Var = this.f;
        if (i2 >= 24) {
            AudioRecord audioRecord = this.p;
            AudioTimestamp audioTimestamp = this.k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                ek9Var.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        ek9Var.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z) {
        if (z) {
            try {
                this.N = f(mediaFormat);
                nk9 nk9Var = this.a;
                byte b = this.e;
                synchronized (nk9Var) {
                    try {
                        nk9Var.s = b;
                    } finally {
                    }
                }
            } catch (kk9 e) {
                if (this.x) {
                    return;
                }
                this.x = true;
                this.f.a("recording segment rejected; earlier segments are kept", e);
                this.h.a(e);
                return;
            } catch (IOException e2) {
                ho9.n(e2);
                return;
            }
        }
        ek9 ek9Var = this.f;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb.append(" output format: ");
        sb.append(mediaFormat);
        ek9Var.b(sb.toString());
        this.a.n(mediaFormat, z);
    }

    public final synchronized void t(sj9 sj9Var, sj9 sj9Var2) {
        if (this.E) {
            return;
        }
        if (!this.D) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.o.start();
            this.p.startRecording();
            if (this.p.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.F = SystemClock.elapsedRealtimeNanos();
            this.t = sj9Var;
            this.u = sj9Var2;
            final byte b = 1;
            this.E = true;
            this.f.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.p.getAudioSessionId());
            final byte b2 = 0;
            this.r = new Thread(new Runnable(this) { // from class: bk9
                public final /* synthetic */ dk9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dk9 dk9Var;
                    long j;
                    boolean z = false;
                    switch (b2) {
                        case 0:
                            dk9Var = this.b;
                            dk9Var.getClass();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z2 = false;
                            while (!z2) {
                                try {
                                    try {
                                    } catch (RuntimeException e) {
                                        if (dk9Var.v) {
                                            dk9Var.f.a("video drain failed while stopping", e);
                                        } else {
                                            dk9Var.o(e);
                                        }
                                    }
                                    if (dk9Var.w) {
                                        return;
                                    }
                                    int dequeueOutputBuffer = dk9Var.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        dk9Var.s(dk9Var.n.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < dk9Var.B) {
                                                dk9Var.I++;
                                                dk9Var.G += bufferInfo.size;
                                                dk9Var.m(true, bufferInfo);
                                                dk9Var.l(bufferInfo.presentationTimeUs);
                                                dk9Var.v(true, dk9Var.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                dk9Var.b0++;
                                            }
                                        }
                                        z2 = (bufferInfo.flags & 4) != 0;
                                        dk9Var.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        default:
                            dk9Var = this.b;
                            dk9Var.getClass();
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j2 = Long.MIN_VALUE;
                            boolean z3 = false;
                            long j3 = Long.MIN_VALUE;
                            long j4 = 0;
                            while (!z) {
                                try {
                                    try {
                                        if (!dk9Var.w) {
                                            z = dk9Var.d(bufferInfo2, z3 ? 10000L : 0L);
                                            if (!z) {
                                                int dequeueInputBuffer = dk9Var.o.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (dk9Var.v) {
                                                        dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3 == j2 ? 0L : j3 + ((1000000 * j4) / 48000), 4);
                                                        z3 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = dk9Var.o.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j = j2;
                                                            int read = dk9Var.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i = dk9Var.X + 1;
                                                                    dk9Var.X = i;
                                                                    if (read == -6 || i >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    dk9Var.Y++;
                                                                }
                                                                dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3 == j ? 0L : j3 + ((1000000 * j4) / 48000), 0);
                                                            } else {
                                                                int i2 = read / 2;
                                                                if (j3 == j) {
                                                                    long r = dk9Var.r(i2);
                                                                    ek9 ek9Var = dk9Var.f;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append("first audio input: basePtsUs=");
                                                                    sb.append(r);
                                                                    sb.append(", frames=");
                                                                    sb.append(i2);
                                                                    sb.append(", timestampSource=");
                                                                    sb.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                                    ek9Var.b(sb.toString());
                                                                    j3 = r;
                                                                }
                                                                dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, i2 << 1, j3 + ((1000000 * j4) / 48000), 0);
                                                                j4 += i2;
                                                                dk9Var.i();
                                                            }
                                                            j2 = j;
                                                        }
                                                    }
                                                }
                                                j = j2;
                                                j2 = j;
                                            }
                                        }
                                    } catch (RuntimeException e2) {
                                        if (dk9Var.v) {
                                            dk9Var.f.a("audio capture failed while stopping", e2);
                                        } else {
                                            dk9Var.o(e2);
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                            return;
                    }
                }
            }, "RoundVideoVideoEncoder");
            this.s = new Thread(new Runnable(this) { // from class: bk9
                public final /* synthetic */ dk9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dk9 dk9Var;
                    long j;
                    boolean z = false;
                    switch (b) {
                        case 0:
                            dk9Var = this.b;
                            dk9Var.getClass();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z2 = false;
                            while (!z2) {
                                try {
                                    try {
                                    } catch (RuntimeException e) {
                                        if (dk9Var.v) {
                                            dk9Var.f.a("video drain failed while stopping", e);
                                        } else {
                                            dk9Var.o(e);
                                        }
                                    }
                                    if (dk9Var.w) {
                                        return;
                                    }
                                    int dequeueOutputBuffer = dk9Var.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        dk9Var.s(dk9Var.n.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < dk9Var.B) {
                                                dk9Var.I++;
                                                dk9Var.G += bufferInfo.size;
                                                dk9Var.m(true, bufferInfo);
                                                dk9Var.l(bufferInfo.presentationTimeUs);
                                                dk9Var.v(true, dk9Var.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                dk9Var.b0++;
                                            }
                                        }
                                        z2 = (bufferInfo.flags & 4) != 0;
                                        dk9Var.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        default:
                            dk9Var = this.b;
                            dk9Var.getClass();
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j2 = Long.MIN_VALUE;
                            boolean z3 = false;
                            long j3 = Long.MIN_VALUE;
                            long j4 = 0;
                            while (!z) {
                                try {
                                    try {
                                        if (!dk9Var.w) {
                                            z = dk9Var.d(bufferInfo2, z3 ? 10000L : 0L);
                                            if (!z) {
                                                int dequeueInputBuffer = dk9Var.o.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (dk9Var.v) {
                                                        dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3 == j2 ? 0L : j3 + ((1000000 * j4) / 48000), 4);
                                                        z3 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = dk9Var.o.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j = j2;
                                                            int read = dk9Var.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i = dk9Var.X + 1;
                                                                    dk9Var.X = i;
                                                                    if (read == -6 || i >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    dk9Var.Y++;
                                                                }
                                                                dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j3 == j ? 0L : j3 + ((1000000 * j4) / 48000), 0);
                                                            } else {
                                                                int i2 = read / 2;
                                                                if (j3 == j) {
                                                                    long r = dk9Var.r(i2);
                                                                    ek9 ek9Var = dk9Var.f;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append("first audio input: basePtsUs=");
                                                                    sb.append(r);
                                                                    sb.append(", frames=");
                                                                    sb.append(i2);
                                                                    sb.append(", timestampSource=");
                                                                    sb.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                                    ek9Var.b(sb.toString());
                                                                    j3 = r;
                                                                }
                                                                dk9Var.o.queueInputBuffer(dequeueInputBuffer, 0, i2 << 1, j3 + ((1000000 * j4) / 48000), 0);
                                                                j4 += i2;
                                                                dk9Var.i();
                                                            }
                                                            j2 = j;
                                                        }
                                                    }
                                                }
                                                j = j2;
                                                j2 = j;
                                            }
                                        }
                                    } catch (RuntimeException e2) {
                                        if (dk9Var.v) {
                                            dk9Var.f.a("audio capture failed while stopping", e2);
                                        } else {
                                            dk9Var.o(e2);
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                            return;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.z = 2;
            this.r.start();
            this.s.start();
        } catch (RuntimeException e) {
            n();
            throw e;
        }
    }

    public final void u() {
        p();
        synchronized (this) {
            if (!this.D || this.y) {
                return;
            }
            if (!this.E) {
                n();
                return;
            }
            this.y = true;
            try {
                this.n.signalEndOfInputStream();
            } catch (IllegalStateException e) {
                this.f.a("video encoder EOS failed", e);
            }
            h(this.r, 5000L);
            h(this.s, 5000L);
            long j = g() ? this.Q - this.O : Long.MIN_VALUE;
            long j2 = g() ? this.R - this.P : Long.MIN_VALUE;
            long j3 = this.O;
            long j4 = this.P;
            long j5 = (j3 == Long.MIN_VALUE || j4 <= j3) ? 0L : j4 - j3;
            long j6 = this.Q;
            long j7 = this.R;
            long j8 = (j6 == Long.MIN_VALUE || j7 <= j6) ? 0L : j7 - j6;
            ek9 ek9Var = this.f;
            StringBuilder sb = new StringBuilder("codec summary: videoBuffers=");
            sb.append(this.I);
            sb.append(", videoBytes=");
            sb.append(this.G);
            sb.append(", videoPts=");
            long j9 = j5;
            sb.append(k(this.O, this.P));
            sb.append(", actualVideoBitrate=");
            sb.append(j9 <= 0 ? "n/a" : String.valueOf((this.G * 8000000) / j9));
            sb.append(", keyframes=");
            sb.append(this.U);
            sb.append(", maxKeyframeIntervalUs=");
            sb.append(this.T);
            sb.append(", nonMonotonicVideoPts=");
            sb.append(this.V);
            sb.append(", audioBuffers=");
            sb.append(this.J);
            sb.append(", audioBytes=");
            sb.append(this.H);
            sb.append(", audioPts=");
            sb.append(k(this.Q, this.R));
            sb.append(", actualAudioBitrate=");
            sb.append(j8 <= 0 ? "n/a" : String.valueOf((this.H * 8000000) / j8));
            sb.append(", nonMonotonicAudioPts=");
            sb.append(this.W);
            sb.append(", avStartDeltaUs=");
            sb.append(j == Long.MIN_VALUE ? "n/a" : String.valueOf(j));
            sb.append(", avEndDeltaUs=");
            sb.append(j2 == Long.MIN_VALUE ? "n/a" : String.valueOf(j2));
            sb.append(", audioReadErrors=");
            sb.append(this.X);
            sb.append(", emptyAudioReads=");
            sb.append(this.Y);
            sb.append(", droppedAudioBuffers=");
            sb.append(this.Z);
            sb.append(", droppedAudioAfterStop=");
            sb.append(this.a0);
            sb.append(", droppedVideoAfterStop=");
            sb.append(this.b0);
            sb.append(", stopPresentationTimeUs=");
            sb.append(this.B == Long.MAX_VALUE ? "n/a" : Long.valueOf(this.B));
            sb.append(", alignedAudioStartDeltaUs=");
            long j10 = this.d0;
            sb.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
            sb.append(", codecLatencyAvgMs=");
            int i = this.K;
            sb.append(i != 0 ? Float.valueOf((this.L / i) / 1000000.0f) : "n/a");
            sb.append(", codecLatencyMaxMs=");
            sb.append(this.M / 1000000.0f);
            ek9Var.b(sb.toString());
            synchronized (this) {
                if (this.z > 0) {
                    this.w = true;
                }
            }
            if (this.w) {
                h(this.r, 1000L);
                h(this.s, 1000L);
            }
            synchronized (this) {
                if (this.z <= 0) {
                    n();
                    return;
                }
                this.A = true;
                this.f.b("codec release deferred until encoder threads exit: running=" + this.z);
            }
        }
    }

    public final void v(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        if (byteBuffer == null || this.x) {
            return;
        }
        if (z) {
            try {
                int i2 = this.N;
                if (i2 > 0 && (bufferInfo.flags & 1) != 0 && (i = bufferInfo.size) > i2) {
                    bufferInfo.offset += i2;
                    bufferInfo.size = i - i2;
                }
            } catch (IOException e) {
                ho9.n(e);
                return;
            }
        }
        this.a.q(z, byteBuffer, bufferInfo, this.b);
    }
}
