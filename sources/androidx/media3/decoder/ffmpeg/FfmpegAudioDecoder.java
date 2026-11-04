package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b8.zb;
import d2.v;
import g2.n0;
import g2.y;
import j2.f;
import j2.h;
import j2.j;
import j2.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends l {
    public static final byte[] w = {102, 76, 97, 67};
    public final String o;
    public final byte[] p;
    public final int q;
    public int r;
    public long s;
    public boolean t;
    public volatile int u;
    public volatile int v;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[LOOP:0: B:36:0x006d->B:52:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FfmpegAudioDecoder(int i3, v vVar, boolean z10) {
        super(new h[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        int i10;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        vVar.s.getClass();
        String str2 = vVar.s;
        String a10 = FfmpegLibrary.a(str2);
        a10.getClass();
        this.o = a10;
        List list = vVar.v;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1003765268:
                if (str2.equals("audio/vorbis")) {
                    c2 = 0;
                    break;
                }
                break;
            case -53558318:
                if (str2.equals("audio/mp4a-latm")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1504470054:
                if (str2.equals("audio/alac")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1504891608:
                if (str2.equals("audio/opus")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        byte[] bArr3 = null;
        switch (c2) {
            case 0:
                byte[] bArr4 = (byte[]) list.get(0);
                byte[] bArr5 = (byte[]) list.get(1);
                byte[] bArr6 = new byte[bArr4.length + bArr5.length + 6];
                bArr6[0] = (byte) (bArr4.length >> 8);
                bArr6[1] = (byte) (bArr4.length & hs.e4);
                System.arraycopy(bArr4, 0, bArr6, 2, bArr4.length);
                bArr6[bArr4.length + 2] = 0;
                bArr6[bArr4.length + 3] = 0;
                bArr6[bArr4.length + 4] = (byte) (bArr5.length >> 8);
                bArr6[bArr4.length + 5] = (byte) (bArr5.length & hs.e4);
                System.arraycopy(bArr5, 0, bArr6, bArr4.length + 6, bArr5.length);
                bArr = bArr6;
                break;
            case 1:
            case 4:
                bArr3 = (byte[]) list.get(0);
                bArr = bArr3;
                break;
            case 2:
                byte[] bArr7 = (byte[]) list.get(0);
                int length = bArr7.length + 12;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.putInt(length);
                allocate.putInt(1634492771);
                allocate.putInt(0);
                allocate.put(bArr7, 0, bArr7.length);
                bArr3 = allocate.array();
                bArr = bArr3;
                break;
            case 3:
                for (int i11 = 0; i11 < list.size(); i11++) {
                    byte[] bArr8 = (byte[]) list.get(i11);
                    if (bArr8.length >= 4) {
                        for (int i12 = 0; i12 < 4; i12++) {
                            if (bArr8[i12] == w[i12]) {
                            }
                        }
                        i10 = 4;
                        if (bArr8.length - i10 != 34) {
                            bArr2 = new byte[34];
                            System.arraycopy(bArr8, i10, bArr2, 0, 34);
                        } else {
                            int i13 = i10 + 4;
                            if (bArr8.length >= i13) {
                                int i14 = bArr8[i10] & Byte.MAX_VALUE;
                                int i15 = ((bArr8[i10 + 1] & 255) << 16) | ((bArr8[i10 + 2] & 255) << 8) | (bArr8[i10 + 3] & 255);
                                if (i14 == 0 && i15 == 34 && bArr8.length >= i10 + 38) {
                                    bArr2 = new byte[34];
                                    System.arraycopy(bArr8, i13, bArr2, 0, 34);
                                }
                            }
                            bArr2 = null;
                        }
                        if (bArr2 == null) {
                            bArr = bArr2;
                            break;
                        }
                    }
                    i10 = 0;
                    if (bArr8.length - i10 != 34) {
                    }
                    if (bArr2 == null) {
                    }
                }
                bArr = bArr3;
                break;
            default:
                bArr = bArr3;
                break;
        }
        this.p = bArr;
        this.q = z10 ? 4 : 2;
        this.r = z10 ? 131070 : 65535;
        long ffmpegInitialize = ffmpegInitialize(this.o, bArr, z10, vVar.L, vVar.K);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        o(i3);
    }

    private native int ffmpegDecode(long j10, ByteBuffer byteBuffer, int i3, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i10);

    private native int ffmpegGetChannelCount(long j10);

    private native int ffmpegGetSampleRate(long j10);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z10, int i3, int i10);

    private native void ffmpegRelease(long j10);

    private native long ffmpegReset(long j10, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i3) {
        this.r = i3;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.b;
        byteBuffer.getClass();
        zb.f(i3 >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i3);
        simpleDecoderOutputBuffer.b = order;
        return order;
    }

    @Override // j2.l
    public final h f() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // j2.l
    public final j g() {
        return new SimpleDecoderOutputBuffer(new a(this, 1));
    }

    @Override // j2.e
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }

    @Override // j2.l
    public final f h(Throwable th2) {
        return new FfmpegDecoderException("Unexpected decode error", th2);
    }

    @Override // j2.l
    public final f i(h hVar, j jVar, boolean z10) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) jVar;
        if (z10) {
            long ffmpegReset = ffmpegReset(this.s, this.p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = hVar.c;
        String str = n0.a;
        int limit = byteBuffer.limit();
        long j10 = hVar.e;
        int i3 = this.r;
        simpleDecoderOutputBuffer.timeUs = j10;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.b;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i3) {
            simpleDecoderOutputBuffer.b = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.b.position(0);
        simpleDecoderOutputBuffer.b.limit(i3);
        int ffmpegDecode = ffmpegDecode(this.s, byteBuffer, limit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.b, this.r);
        if (ffmpegDecode == -2) {
            return new FfmpegDecoderException("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.shouldBeSkipped = true;
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.shouldBeSkipped = true;
            return null;
        }
        if (!this.t) {
            this.u = ffmpegGetChannelCount(this.s);
            this.v = ffmpegGetSampleRate(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                this.p.getClass();
                y yVar = new y(this.p);
                yVar.N(this.p.length - 4);
                this.v = yVar.E();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.b;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    @Override // j2.l, j2.e
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
