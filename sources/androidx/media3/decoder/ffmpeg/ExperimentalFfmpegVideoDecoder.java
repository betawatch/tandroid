package androidx.media3.decoder.ffmpeg;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class ExperimentalFfmpegVideoDecoder extends dia {
    public final String r;
    public long s;
    public volatile int t;
    public final ArrayDeque u;

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    private static final class PendingInput {
        public final ByteBuffer a;
        public final long b;

        public PendingInput(ByteBuffer byteBuffer, long j) {
            this.a = byteBuffer;
            this.b = j;
        }
    }

    public ExperimentalFfmpegVideoDecoder(int i, int i2, int i3, int i4, fm4 fm4Var) {
        super(new z83[i], new VideoDecoderOutputBuffer[i2]);
        byte[] bArr;
        this.u = new ArrayDeque();
        String str = FfmpegLibrary.a;
        String a = FfmpegLibrary.a(fm4Var.t);
        a.getClass();
        this.r = a;
        List list = fm4Var.w;
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += ((byte[]) list.get(i6)).length;
        }
        if (i5 > 0) {
            bArr = new byte[i5];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i7 = 0; i7 < list.size(); i7++) {
                wrap.put((byte[]) list.get(i7));
            }
        } else {
            bArr = null;
        }
        long ffmpegInitialize = ffmpegInitialize(this.r, bArr, i4, fm4Var.G, fm4Var.A, fm4Var.B);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Failed to initialize decoder.");
        }
        q(i3);
    }

    private native long ffmpegInitialize(String str, byte[] bArr, int i, int i2, int i3, int i4);

    private native int ffmpegReceiveFrame(long j, int i, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z);

    private native void ffmpegRelease(long j);

    private native int ffmpegRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer, int i, int i2);

    private native long ffmpegReset(long j);

    private native int ffmpegSendPacket(long j, ByteBuffer byteBuffer, int i, long j2);

    @Override // dia
    public final z83 f() {
        return new z83(2, FfmpegLibrary.b());
    }

    @Override // dia
    public final b93 g() {
        return new VideoDecoderOutputBuffer(new a93() { // from class: androidx.media3.decoder.ffmpeg.a
            @Override // a93
            public final void a(b93 b93Var) {
                ExperimentalFfmpegVideoDecoder.this.o((VideoDecoderOutputBuffer) b93Var);
            }
        });
    }

    @Override // u83
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.r;
    }

    @Override // dia
    public final x83 h(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }

    @Override // dia
    public final x83 i(z83 z83Var, b93 b93Var, boolean z) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) b93Var;
        if (z) {
            long ffmpegReset = ffmpegReset(this.s);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
            this.u.clear();
        }
        ByteBuffer byteBuffer = z83Var.c;
        String str = g8c.a;
        boolean l = l(z83Var.e);
        boolean z2 = !l;
        while (!this.u.isEmpty()) {
            PendingInput pendingInput = (PendingInput) this.u.peek();
            long j = this.s;
            ByteBuffer byteBuffer2 = pendingInput.a;
            int ffmpegSendPacket = ffmpegSendPacket(j, byteBuffer2, byteBuffer2.limit(), pendingInput.b);
            if (ffmpegSendPacket == -3) {
                break;
            }
            this.u.removeFirst();
            if (ffmpegSendPacket == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
        }
        int ffmpegSendPacket2 = ffmpegSendPacket(this.s, byteBuffer, byteBuffer.limit(), z83Var.e);
        if (ffmpegSendPacket2 == -3) {
            ArrayDeque arrayDeque = this.u;
            long j2 = z83Var.e;
            byteBuffer.position(0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer);
            allocateDirect.flip();
            arrayDeque.addLast(new PendingInput(allocateDirect, j2));
            if (l) {
                videoDecoderOutputBuffer.init(z83Var.e, this.t, null);
            }
            int ffmpegReceiveFrame = ffmpegReceiveFrame(this.s, this.t, videoDecoderOutputBuffer, z2);
            if (ffmpegReceiveFrame == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
                return null;
            }
            if (l) {
                videoDecoderOutputBuffer.format = z83Var.a;
                return null;
            }
        } else {
            if (ffmpegSendPacket2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
                return null;
            }
            if (ffmpegSendPacket2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (l) {
                videoDecoderOutputBuffer.init(z83Var.e, this.t, null);
            }
            int ffmpegReceiveFrame2 = ffmpegReceiveFrame(this.s, this.t, videoDecoderOutputBuffer, z2);
            if (ffmpegReceiveFrame2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            }
            if (l) {
                videoDecoderOutputBuffer.format = z83Var.a;
            }
        }
        return null;
    }

    public final void r(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new FfmpegDecoderException("Invalid output mode.");
        }
        int ffmpegRenderFrame = ffmpegRenderFrame(this.s, surface, videoDecoderOutputBuffer, videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (ffmpegRenderFrame == -2 || ffmpegRenderFrame == -4) {
            throw new FfmpegDecoderException(de9.k(ffmpegRenderFrame, "Buffer render error: "));
        }
    }

    @Override // dia, u83
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
