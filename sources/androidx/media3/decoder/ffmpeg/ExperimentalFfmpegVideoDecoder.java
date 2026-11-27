package androidx.media3.decoder.ffmpeg;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class ExperimentalFfmpegVideoDecoder extends yla {
    public final String r;
    public long s;
    public volatile int t;
    public final ArrayDeque u;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    private static final class PendingInput {
        public final ByteBuffer a;
        public final long b;

        public PendingInput(ByteBuffer byteBuffer, long j) {
            this.a = byteBuffer;
            this.b = j;
        }
    }

    public ExperimentalFfmpegVideoDecoder(int i, int i2, int i3, int i4, ko4 ko4Var) {
        super(new s93[i], new VideoDecoderOutputBuffer[i2]);
        byte[] bArr;
        this.u = new ArrayDeque();
        String str = FfmpegLibrary.a;
        String a = FfmpegLibrary.a(ko4Var.t);
        a.getClass();
        this.r = a;
        List list = ko4Var.w;
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
        long ffmpegInitialize = ffmpegInitialize(this.r, bArr, i4, ko4Var.G, ko4Var.A, ko4Var.B);
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

    @Override // yla
    public final s93 f() {
        return new s93(2, FfmpegLibrary.b());
    }

    @Override // yla
    public final u93 g() {
        return new VideoDecoderOutputBuffer(new t93() { // from class: androidx.media3.decoder.ffmpeg.a
            @Override // t93
            public final void b(u93 u93Var) {
                ExperimentalFfmpegVideoDecoder.this.o((VideoDecoderOutputBuffer) u93Var);
            }
        });
    }

    @Override // n93
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.r;
    }

    @Override // yla
    public final q93 h(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }

    @Override // yla
    public final q93 i(s93 s93Var, u93 u93Var, boolean z) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) u93Var;
        if (z) {
            long ffmpegReset = ffmpegReset(this.s);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
            this.u.clear();
        }
        ByteBuffer byteBuffer = s93Var.c;
        String str = gcc.a;
        boolean l = l(s93Var.e);
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
        int ffmpegSendPacket2 = ffmpegSendPacket(this.s, byteBuffer, byteBuffer.limit(), s93Var.e);
        if (ffmpegSendPacket2 == -3) {
            ArrayDeque arrayDeque = this.u;
            long j2 = s93Var.e;
            byteBuffer.position(0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer);
            allocateDirect.flip();
            arrayDeque.addLast(new PendingInput(allocateDirect, j2));
            if (l) {
                videoDecoderOutputBuffer.init(s93Var.e, this.t, null);
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
                videoDecoderOutputBuffer.format = s93Var.a;
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
                videoDecoderOutputBuffer.init(s93Var.e, this.t, null);
            }
            int ffmpegReceiveFrame2 = ffmpegReceiveFrame(this.s, this.t, videoDecoderOutputBuffer, z2);
            if (ffmpegReceiveFrame2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            }
            if (l) {
                videoDecoderOutputBuffer.format = s93Var.a;
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
            throw new FfmpegDecoderException(uh9.k(ffmpegRenderFrame, "Buffer render error: "));
        }
    }

    @Override // yla, n93
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
