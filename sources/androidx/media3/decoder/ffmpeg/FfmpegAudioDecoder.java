package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.s;
import e2.d;
import e2.d0;
import e2.v;
import h2.e;
import h2.g;
import h2.h;
import h2.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends j {
    public final String o;
    public final byte[] p;
    public final int q;
    public int r;
    public long s;
    public boolean t;
    public volatile int u;
    public volatile int v;

    public FfmpegAudioDecoder(int i10, s sVar, boolean z10) {
        super(new g[16], new SimpleDecoderOutputBuffer[16]);
        List list;
        byte[] bArr;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        sVar.r.getClass();
        String str2 = sVar.r;
        String a2 = FfmpegLibrary.a(str2);
        a2.getClass();
        this.o = a2;
        list = sVar.u;
        switch (str2) {
            case "audio/vorbis":
                byte[] bArr3 = (byte[]) list.get(0);
                byte[] bArr4 = (byte[]) list.get(1);
                byte[] bArr5 = new byte[bArr3.length + bArr4.length + 6];
                bArr5[0] = (byte) (bArr3.length >> 8);
                bArr5[1] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr5, 2, bArr3.length);
                bArr5[bArr3.length + 2] = 0;
                bArr5[bArr3.length + 3] = 0;
                bArr5[bArr3.length + 4] = (byte) (bArr4.length >> 8);
                bArr5[bArr3.length + 5] = (byte) (bArr4.length & 255);
                System.arraycopy(bArr4, 0, bArr5, bArr3.length + 6, bArr4.length);
                bArr = bArr5;
                break;
            case "audio/mp4a-latm":
            case "audio/opus":
                bArr2 = (byte[]) list.get(0);
                bArr = bArr2;
                break;
            case "audio/alac":
                byte[] bArr6 = (byte[]) list.get(0);
                int length = bArr6.length + 12;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.putInt(length);
                allocate.putInt(1634492771);
                allocate.putInt(0);
                allocate.put(bArr6, 0, bArr6.length);
                bArr2 = allocate.array();
                bArr = bArr2;
                break;
            default:
                bArr2 = null;
                bArr = bArr2;
                break;
        }
        this.p = bArr;
        this.q = z10 ? 4 : 2;
        this.r = z10 ? 131070 : 65535;
        long ffmpegInitialize = ffmpegInitialize(a2, bArr, z10, sVar.K, sVar.J);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new c("Initialization failed.");
        }
        int i11 = this.g;
        g[] gVarArr = this.e;
        d.g(i11 == gVarArr.length);
        for (g gVar : gVarArr) {
            gVar.l(i10);
        }
    }

    private native int ffmpegDecode(long j3, ByteBuffer byteBuffer, int i10, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i11);

    private native int ffmpegGetChannelCount(long j3);

    private native int ffmpegGetSampleRate(long j3);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z10, int i10, int i11);

    private native void ffmpegRelease(long j3);

    private native long ffmpegReset(long j3, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i10) {
        this.r = i10;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.h;
        byteBuffer.getClass();
        d.b(i10 >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i10);
        simpleDecoderOutputBuffer.h = order;
        return order;
    }

    @Override // h2.j
    public final g f() {
        return new g(2, FfmpegLibrary.b());
    }

    @Override // h2.j
    public final h g() {
        return new SimpleDecoderOutputBuffer(new a(this));
    }

    @Override // h2.j
    public final e h(Throwable th2) {
        return new c("Unexpected decode error", th2);
    }

    @Override // h2.j
    public final e i(g gVar, h hVar, boolean z10) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) hVar;
        if (z10) {
            long ffmpegReset = ffmpegReset(this.s, this.p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new c("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = gVar.e;
        String str = d0.a;
        int limit = byteBuffer.limit();
        long j3 = gVar.h;
        int i10 = this.r;
        simpleDecoderOutputBuffer.c = j3;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.h;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i10) {
            simpleDecoderOutputBuffer.h = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.h.position(0);
        simpleDecoderOutputBuffer.h.limit(i10);
        int ffmpegDecode = ffmpegDecode(this.s, byteBuffer, limit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.h, this.r);
        if (ffmpegDecode == -2) {
            return new c("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.e = true;
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.e = true;
            return null;
        }
        if (!this.t) {
            this.u = ffmpegGetChannelCount(this.s);
            this.v = ffmpegGetSampleRate(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                this.p.getClass();
                v vVar = new v(this.p);
                vVar.J(this.p.length - 4);
                this.v = vVar.B();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.h;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    public final String o() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }

    @Override // h2.j, h2.d
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
