package androidx.media3.decoder.ffmpeg;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class ExperimentalFfmpegVideoDecoder extends fka {
    public final String r;
    public long s;
    public volatile int t;
    public final ArrayDeque u;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static final class PendingInput {
        public final ByteBuffer a;
        public final long b;

        public PendingInput(ByteBuffer byteBuffer, long j) {
            this.a = byteBuffer;
            this.b = j;
        }
    }

    public ExperimentalFfmpegVideoDecoder(int i, int i2, int i3, int i4, go4 go4Var) {
        super(new la3[i], new VideoDecoderOutputBuffer[i2]);
        byte[] bArr;
        this.u = new ArrayDeque();
        String str = FfmpegLibrary.a;
        String a = FfmpegLibrary.a(go4Var.t);
        a.getClass();
        this.r = a;
        List list = go4Var.w;
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
        long ffmpegInitialize = ffmpegInitialize(this.r, bArr, i4, go4Var.G, go4Var.A, go4Var.B);
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

    @Override // fka
    public final la3 f() {
        return new la3(2, FfmpegLibrary.b());
    }

    @Override // fka
    public final na3 g() {
        return new VideoDecoderOutputBuffer(new ma3() { // from class: androidx.media3.decoder.ffmpeg.a
            @Override // ma3
            public final void b(na3 na3Var) {
                ExperimentalFfmpegVideoDecoder.this.o((VideoDecoderOutputBuffer) na3Var);
            }
        });
    }

    @Override // ga3
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.r;
    }

    @Override // fka
    public final ja3 h(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }

    @Override // fka
    public final ja3 i(la3 la3Var, na3 na3Var, boolean z) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) na3Var;
        if (z) {
            long ffmpegReset = ffmpegReset(this.s);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
            this.u.clear();
        }
        ByteBuffer byteBuffer = la3Var.c;
        String str = hac.a;
        boolean l = l(la3Var.e);
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
        int ffmpegSendPacket2 = ffmpegSendPacket(this.s, byteBuffer, byteBuffer.limit(), la3Var.e);
        if (ffmpegSendPacket2 == -3) {
            ArrayDeque arrayDeque = this.u;
            long j2 = la3Var.e;
            byteBuffer.position(0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer);
            allocateDirect.flip();
            arrayDeque.addLast(new PendingInput(allocateDirect, j2));
            if (l) {
                videoDecoderOutputBuffer.init(la3Var.e, this.t, null);
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
                videoDecoderOutputBuffer.format = la3Var.a;
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
                videoDecoderOutputBuffer.init(la3Var.e, this.t, null);
            }
            int ffmpegReceiveFrame2 = ffmpegReceiveFrame(this.s, this.t, videoDecoderOutputBuffer, z2);
            if (ffmpegReceiveFrame2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            }
            if (l) {
                videoDecoderOutputBuffer.format = la3Var.a;
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
            throw new FfmpegDecoderException(hg9.j(ffmpegRenderFrame, "Buffer render error: "));
        }
    }

    @Override // fka, ga3
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
