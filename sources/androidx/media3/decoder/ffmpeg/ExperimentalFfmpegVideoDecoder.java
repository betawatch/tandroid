package androidx.media3.decoder.ffmpeg;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.s;
import e2.d0;
import h2.f;
import h2.h;
import h2.j;
import h2.l;
import hc.b;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class ExperimentalFfmpegVideoDecoder extends l {
    public final String o;
    public long p;
    public volatile int q;
    public final ArrayDeque r;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static final class PendingInput {
        public final ByteBuffer a;
        public final long b;

        public PendingInput(ByteBuffer byteBuffer, long j3) {
            this.a = byteBuffer;
            this.b = j3;
        }
    }

    public ExperimentalFfmpegVideoDecoder(int i10, int i11, int i12, int i13, s sVar) {
        super(new h[i10], new VideoDecoderOutputBuffer[i11]);
        byte[] bArr;
        this.r = new ArrayDeque();
        String str = FfmpegLibrary.a;
        String a2 = FfmpegLibrary.a(sVar.r);
        a2.getClass();
        this.o = a2;
        List list = sVar.u;
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            i14 += ((byte[]) list.get(i15)).length;
        }
        if (i14 > 0) {
            bArr = new byte[i14];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i16 = 0; i16 < list.size(); i16++) {
                wrap.put((byte[]) list.get(i16));
            }
        } else {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        long ffmpegInitialize = ffmpegInitialize(this.o, bArr2, i13, sVar.D, sVar.y, sVar.z);
        this.p = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Failed to initialize decoder.");
        }
        o(i12);
    }

    private native long ffmpegInitialize(String str, byte[] bArr, int i10, int i11, int i12, int i13);

    private native int ffmpegReceiveFrame(long j3, int i10, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z10);

    private native void ffmpegRelease(long j3);

    private native int ffmpegRenderFrame(long j3, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer, int i10, int i11);

    private native long ffmpegReset(long j3);

    private native int ffmpegSendPacket(long j3, ByteBuffer byteBuffer, int i10, long j10);

    @Override // h2.l
    public final h f() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // h2.l
    public final j g() {
        return new VideoDecoderOutputBuffer(new a(this, 0));
    }

    @Override // h2.e
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }

    @Override // h2.l
    public final f h(Throwable th2) {
        return new FfmpegDecoderException("Unexpected decode error", th2);
    }

    @Override // h2.l
    public final f i(h hVar, j jVar, boolean z10) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) jVar;
        if (z10) {
            long ffmpegReset = ffmpegReset(this.p);
            this.p = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
            this.r.clear();
        }
        ByteBuffer byteBuffer = hVar.c;
        String str = d0.a;
        boolean l4 = l(hVar.e);
        boolean z11 = !l4;
        while (!this.r.isEmpty()) {
            PendingInput pendingInput = (PendingInput) this.r.peek();
            long j3 = this.p;
            ByteBuffer byteBuffer2 = pendingInput.a;
            int ffmpegSendPacket = ffmpegSendPacket(j3, byteBuffer2, byteBuffer2.limit(), pendingInput.b);
            if (ffmpegSendPacket == -3) {
                break;
            }
            this.r.removeFirst();
            if (ffmpegSendPacket == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
        }
        int ffmpegSendPacket2 = ffmpegSendPacket(this.p, byteBuffer, byteBuffer.limit(), hVar.e);
        if (ffmpegSendPacket2 == -3) {
            ArrayDeque arrayDeque = this.r;
            long j10 = hVar.e;
            byteBuffer.position(0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer);
            allocateDirect.flip();
            arrayDeque.addLast(new PendingInput(allocateDirect, j10));
            if (l4) {
                videoDecoderOutputBuffer.init(hVar.e, this.q, null);
            }
            int ffmpegReceiveFrame = ffmpegReceiveFrame(this.p, this.q, videoDecoderOutputBuffer, z11);
            if (ffmpegReceiveFrame == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
                return null;
            }
            if (l4) {
                videoDecoderOutputBuffer.format = hVar.a;
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
            if (l4) {
                videoDecoderOutputBuffer.init(hVar.e, this.q, null);
            }
            int ffmpegReceiveFrame2 = ffmpegReceiveFrame(this.p, this.q, videoDecoderOutputBuffer, z11);
            if (ffmpegReceiveFrame2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            }
            if (l4) {
                videoDecoderOutputBuffer.format = hVar.a;
            }
        }
        return null;
    }

    public final void p(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new FfmpegDecoderException("Invalid output mode.");
        }
        int ffmpegRenderFrame = ffmpegRenderFrame(this.p, surface, videoDecoderOutputBuffer, videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (ffmpegRenderFrame == -2 || ffmpegRenderFrame == -4) {
            throw new FfmpegDecoderException(b.j(ffmpegRenderFrame, "Buffer render error: "));
        }
    }

    @Override // h2.l, h2.e
    public final void release() {
        super.release();
        ffmpegRelease(this.p);
        this.p = 0L;
    }
}
