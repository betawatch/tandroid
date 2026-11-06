package androidx.media3.decoder.ffmpeg;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import e2.u;
import h2.m0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import jg.g;
import k2.f;
import k2.h;
import k2.j;
import k2.l;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class ExperimentalFfmpegVideoDecoder extends l {
    public final String o;
    public long p;
    public volatile int q;
    public final ArrayDeque r;

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public static final class PendingInput {
        public final ByteBuffer a;
        public final long b;

        public PendingInput(ByteBuffer byteBuffer, long j3) {
            this.a = byteBuffer;
            this.b = j3;
        }
    }

    public ExperimentalFfmpegVideoDecoder(int i7, int i10, int i11, int i12, u uVar) {
        super(new h[i7], new VideoDecoderOutputBuffer[i10]);
        byte[] bArr;
        this.r = new ArrayDeque();
        String str = FfmpegLibrary.a;
        String a10 = FfmpegLibrary.a(uVar.s);
        a10.getClass();
        this.o = a10;
        List list = uVar.v;
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            i13 += ((byte[]) list.get(i14)).length;
        }
        if (i13 > 0) {
            bArr = new byte[i13];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i15 = 0; i15 < list.size(); i15++) {
                wrap.put((byte[]) list.get(i15));
            }
        } else {
            bArr = null;
        }
        long ffmpegInitialize = ffmpegInitialize(this.o, bArr, i12, uVar.E, uVar.z, uVar.A);
        this.p = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Failed to initialize decoder.");
        }
        o(i11);
    }

    private native long ffmpegInitialize(String str, byte[] bArr, int i7, int i10, int i11, int i12);

    private native int ffmpegReceiveFrame(long j3, int i7, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z9);

    private native void ffmpegRelease(long j3);

    private native int ffmpegRenderFrame(long j3, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer, int i7, int i10);

    private native long ffmpegReset(long j3);

    private native int ffmpegSendPacket(long j3, ByteBuffer byteBuffer, int i7, long j10);

    @Override // k2.l
    public final h f() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // k2.l
    public final j g() {
        return new VideoDecoderOutputBuffer(new a(this, 0));
    }

    @Override // k2.e
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }

    @Override // k2.l
    public final f h(Throwable th2) {
        return new FfmpegDecoderException("Unexpected decode error", th2);
    }

    @Override // k2.l
    public final f i(h hVar, j jVar, boolean z9) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) jVar;
        if (z9) {
            long ffmpegReset = ffmpegReset(this.p);
            this.p = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
            this.r.clear();
        }
        ByteBuffer byteBuffer = hVar.c;
        String str = m0.a;
        boolean l10 = l(hVar.e);
        boolean z10 = !l10;
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
            if (l10) {
                videoDecoderOutputBuffer.init(hVar.e, this.q, null);
            }
            int ffmpegReceiveFrame = ffmpegReceiveFrame(this.p, this.q, videoDecoderOutputBuffer, z10);
            if (ffmpegReceiveFrame == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
                return null;
            }
            if (l10) {
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
            if (l10) {
                videoDecoderOutputBuffer.init(hVar.e, this.q, null);
            }
            int ffmpegReceiveFrame2 = ffmpegReceiveFrame(this.p, this.q, videoDecoderOutputBuffer, z10);
            if (ffmpegReceiveFrame2 == -2) {
                return new FfmpegDecoderException("ffmpegDecode error: (see logcat)");
            }
            if (ffmpegReceiveFrame2 == -1) {
                videoDecoderOutputBuffer.shouldBeSkipped = true;
            }
            if (l10) {
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
            throw new FfmpegDecoderException(g.j(ffmpegRenderFrame, "Buffer render error: "));
        }
    }

    @Override // k2.l, k2.e
    public final void release() {
        super.release();
        ffmpegRelease(this.p);
        this.p = 0L;
    }
}
