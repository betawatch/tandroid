package ki;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class k implements p {
    public int A;
    public int B;
    public long C;
    public long D;
    public int E;
    public volatile long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final t a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final l f;
    public final a g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList i = new ArrayList();
    public final AudioTimestamp j = new AudioTimestamp();
    public final long[] k = new long[256];
    public final long[] l = new long[256];
    public MediaCodec m;
    public MediaCodec n;
    public AudioRecord o;
    public Surface p;
    public Thread q;
    public Thread r;
    public volatile boolean s;
    public volatile long t;
    public boolean u;
    public boolean v;
    public long w;
    public long x;
    public long y;
    public int z;

    public k(t tVar, long j3, int i10, int i11, int i12, l lVar, a aVar) {
        this.a = tVar;
        this.b = j3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = lVar;
        this.g = aVar;
    }

    public static String f(long j3, long j10) {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.n.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (dequeueOutputBuffer >= 0) {
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                long j10 = this.F;
                if (j10 == Long.MIN_VALUE) {
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
                        this.i.add(new j(allocateDirect, bufferInfo2));
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                } else {
                    ArrayList arrayList = this.i;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        j jVar = (j) arrayList.get(i10);
                        MediaCodec.BufferInfo bufferInfo3 = jVar.b;
                        long j11 = j10;
                        if (bufferInfo3.presentationTimeUs + 21333 > j11) {
                            ByteBuffer byteBuffer = jVar.a;
                            this.A++;
                            this.y += bufferInfo3.size;
                            h(false, bufferInfo3);
                            p(false, byteBuffer, bufferInfo3);
                        } else {
                            this.Q++;
                        }
                        i10++;
                        j10 = j11;
                    }
                    long j12 = j10;
                    arrayList.clear();
                    if (bufferInfo.presentationTimeUs + 21333 > j12) {
                        this.A++;
                        this.y += bufferInfo.size;
                        h(false, bufferInfo);
                        p(false, outputBuffer, bufferInfo);
                    } else {
                        this.Q++;
                    }
                    z10 |= (bufferInfo.flags & 4) == 0;
                    this.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.n.dequeueOutputBuffer(bufferInfo, 0L);
                }
            }
            z10 |= (bufferInfo.flags & 4) == 0;
            this.n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            m(this.n.getOutputFormat(), false);
        }
        return z10;
    }

    public final boolean d() {
        return (this.F == Long.MIN_VALUE || this.G == Long.MIN_VALUE || this.H == Long.MIN_VALUE || this.I == Long.MIN_VALUE) ? false : true;
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

    public final void g(long j3) {
        int i10;
        long j10 = this.t;
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
        this.B++;
        this.C += nanoTime;
        this.D = Math.max(this.D, nanoTime);
        if (this.B % 30 == 0) {
            this.f.b("codec latency: average=" + ((this.C / this.B) / 1000000.0f) + " ms, max=" + (this.D / 1000000.0f) + " ms");
        }
    }

    public final void h(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (!z10) {
            if (this.H == Long.MIN_VALUE) {
                this.H = j3;
            }
            long j10 = this.I;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.N++;
            }
            this.I = Math.max(j10, j3);
            return;
        }
        if (this.F == Long.MIN_VALUE) {
            this.F = j3;
        }
        long j11 = this.G;
        if (j11 != Long.MIN_VALUE && j3 < j11) {
            this.M++;
        }
        this.G = Math.max(j11, j3);
        if ((bufferInfo.flags & 1) != 0) {
            this.L++;
            long j12 = this.J;
            if (j12 != Long.MIN_VALUE) {
                this.K = Math.max(this.K, j3 - j12);
            }
            this.J = j3;
        }
    }

    public final void i() {
        this.u = false;
        this.v = false;
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

    public final void j(RuntimeException runtimeException) {
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
            ((r0) uVar.b).h.post(new n(2, uVar, runtimeException));
        }
    }

    public final void k() {
        this.s = false;
        this.w = 0L;
        this.y = 0L;
        this.x = 0L;
        this.A = 0;
        this.z = 0;
        this.t = 0L;
        this.B = 0;
        this.D = 0L;
        this.C = 0L;
        this.G = Long.MIN_VALUE;
        this.F = Long.MIN_VALUE;
        this.I = Long.MIN_VALUE;
        this.H = Long.MIN_VALUE;
        this.J = Long.MIN_VALUE;
        this.K = 0L;
        this.L = 0;
        this.N = 0;
        this.M = 0;
        this.P = 0;
        this.O = 0;
        this.Q = 0;
        this.i.clear();
    }

    public final long l(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioRecord audioRecord = this.o;
            AudioTimestamp audioTimestamp = this.j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                return Math.max(0L, ((audioTimestamp.nanoTime - this.w) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
            }
        }
        return Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.w) / 1000) - ((i10 * 1000000) / 48000));
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
                    this.E = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.a.k(mediaFormat, z10);
        l lVar = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        lVar.b(sb2.toString());
    }

    public final synchronized void n() {
        if (this.v) {
            return;
        }
        if (!this.u) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.w = SystemClock.elapsedRealtimeNanos();
            this.n.start();
            this.o.startRecording();
            if (this.o.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.v = true;
            this.f.b("audio and video recording started: timeOriginNs=" + this.w + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.o.getAudioSessionId());
            final int i10 = 0;
            this.q = new Thread(new Runnable(this) { // from class: ki.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i11 = i10;
                    k kVar = this.b;
                    kVar.getClass();
                    switch (i11) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = kVar.m.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        kVar.m(kVar.m.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            kVar.z++;
                                            kVar.x += i12;
                                            kVar.h(true, bufferInfo);
                                            kVar.g(bufferInfo.presentationTimeUs);
                                            kVar.p(true, kVar.m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        kVar.m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (kVar.s) {
                                        kVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        kVar.j(e);
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z12 = false;
                            long j13 = 0;
                            while (!z11) {
                                try {
                                    z11 = kVar.c(bufferInfo2, z12 ? 10000L : 0L);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = kVar.n.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (kVar.s) {
                                                kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = kVar.n.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    j3 = j11;
                                                    int read = kVar.o.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            int i13 = kVar.O + 1;
                                                            kVar.O = i13;
                                                            if (read == -6 || i13 >= 3) {
                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                            }
                                                        } else {
                                                            kVar.P++;
                                                        }
                                                        kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                    } else {
                                                        int i14 = read / 2;
                                                        if (j12 == j3) {
                                                            long l4 = kVar.l(i14);
                                                            l lVar = kVar.f;
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("first audio input: basePtsUs=");
                                                            sb2.append(l4);
                                                            sb2.append(", frames=");
                                                            sb2.append(i14);
                                                            sb2.append(", timestampSource=");
                                                            j10 = 48000;
                                                            sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                            lVar.b(sb2.toString());
                                                            j12 = l4;
                                                        } else {
                                                            j10 = 48000;
                                                        }
                                                        kVar.n.queueInputBuffer(dequeueInputBuffer, 0, i14 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                        j13 += i14;
                                                    }
                                                    j11 = j3;
                                                }
                                            }
                                        }
                                        j3 = j11;
                                        j11 = j3;
                                    }
                                } catch (RuntimeException e7) {
                                    if (kVar.s) {
                                        kVar.f.a("audio capture failed while stopping", e7);
                                    } else {
                                        kVar.j(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoVideoEncoder");
            final int i11 = 1;
            this.r = new Thread(new Runnable(this) { // from class: ki.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i112 = i11;
                    k kVar = this.b;
                    kVar.getClass();
                    switch (i112) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z10 = false;
                            while (!z10) {
                                try {
                                    int dequeueOutputBuffer = kVar.m.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        kVar.m(kVar.m.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        int i12 = bufferInfo.size;
                                        if (i12 > 0 && (bufferInfo.flags & 2) == 0) {
                                            kVar.z++;
                                            kVar.x += i12;
                                            kVar.h(true, bufferInfo);
                                            kVar.g(bufferInfo.presentationTimeUs);
                                            kVar.p(true, kVar.m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                        }
                                        z10 = (bufferInfo.flags & 4) != 0;
                                        kVar.m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (RuntimeException e) {
                                    if (kVar.s) {
                                        kVar.f.a("video drain failed while stopping", e);
                                        return;
                                    } else {
                                        kVar.j(e);
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z12 = false;
                            long j13 = 0;
                            while (!z11) {
                                try {
                                    z11 = kVar.c(bufferInfo2, z12 ? 10000L : 0L);
                                    if (z11) {
                                        break;
                                    } else {
                                        int dequeueInputBuffer = kVar.n.dequeueInputBuffer(10000L);
                                        if (dequeueInputBuffer >= 0) {
                                            if (kVar.s) {
                                                kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                                z12 = true;
                                            } else {
                                                ByteBuffer inputBuffer = kVar.n.getInputBuffer(dequeueInputBuffer);
                                                if (inputBuffer == null) {
                                                    kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                } else {
                                                    inputBuffer.clear();
                                                    j3 = j11;
                                                    int read = kVar.o.read(inputBuffer, inputBuffer.remaining());
                                                    if (read <= 0) {
                                                        if (read < 0) {
                                                            int i13 = kVar.O + 1;
                                                            kVar.O = i13;
                                                            if (read == -6 || i13 >= 3) {
                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                            }
                                                        } else {
                                                            kVar.P++;
                                                        }
                                                        kVar.n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                    } else {
                                                        int i14 = read / 2;
                                                        if (j12 == j3) {
                                                            long l4 = kVar.l(i14);
                                                            l lVar = kVar.f;
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("first audio input: basePtsUs=");
                                                            sb2.append(l4);
                                                            sb2.append(", frames=");
                                                            sb2.append(i14);
                                                            sb2.append(", timestampSource=");
                                                            j10 = 48000;
                                                            sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                            lVar.b(sb2.toString());
                                                            j12 = l4;
                                                        } else {
                                                            j10 = 48000;
                                                        }
                                                        kVar.n.queueInputBuffer(dequeueInputBuffer, 0, i14 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                        j13 += i14;
                                                    }
                                                    j11 = j3;
                                                }
                                            }
                                        }
                                        j3 = j11;
                                        j11 = j3;
                                    }
                                } catch (RuntimeException e7) {
                                    if (kVar.s) {
                                        kVar.f.a("audio capture failed while stopping", e7);
                                    } else {
                                        kVar.j(e7);
                                        return;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.q.start();
            this.r.start();
        } catch (RuntimeException e) {
            i();
            throw e;
        }
    }

    public final void o() {
        synchronized (this) {
            try {
                if (this.u && !this.s) {
                    if (!this.v) {
                        i();
                        return;
                    }
                    this.s = true;
                    try {
                        this.o.stop();
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        this.m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f.a("video encoder EOS failed", e);
                    }
                    e(this.q);
                    e(this.r);
                    long j3 = d() ? this.H - this.F : Long.MIN_VALUE;
                    long j10 = d() ? this.I - this.G : Long.MIN_VALUE;
                    long j11 = this.F;
                    long j12 = this.G;
                    long j13 = (j11 == Long.MIN_VALUE || j12 <= j11) ? 0L : j12 - j11;
                    long j14 = this.H;
                    long j15 = this.I;
                    long j16 = (j14 == Long.MIN_VALUE || j15 <= j14) ? 0L : j15 - j14;
                    l lVar = this.f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.z);
                    sb2.append(", videoBytes=");
                    sb2.append(this.x);
                    sb2.append(", videoPts=");
                    sb2.append(f(this.F, this.G));
                    sb2.append(", actualVideoBitrate=");
                    sb2.append(j13 <= 0 ? "n/a" : String.valueOf((this.x * 8000000) / j13));
                    sb2.append(", keyframes=");
                    sb2.append(this.L);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.K);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.M);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.A);
                    sb2.append(", audioBytes=");
                    sb2.append(this.y);
                    sb2.append(", audioPts=");
                    sb2.append(f(this.H, this.I));
                    sb2.append(", actualAudioBitrate=");
                    sb2.append(j16 <= 0 ? "n/a" : String.valueOf((this.y * 8000000) / j16));
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.N);
                    sb2.append(", avStartDeltaUs=");
                    sb2.append(j3 == Long.MIN_VALUE ? "n/a" : String.valueOf(j3));
                    sb2.append(", avEndDeltaUs=");
                    sb2.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.O);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.P);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Q);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.B;
                    sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.C / i10) / 1000000.0f));
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(this.D / 1000000.0f);
                    lVar.b(sb2.toString());
                    i();
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
                int i11 = this.E;
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
