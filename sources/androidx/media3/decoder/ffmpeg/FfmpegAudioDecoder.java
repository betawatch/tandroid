package androidx.media3.decoder.ffmpeg;

import a8.ia;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import e2.u;
import h2.m0;
import h2.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import k2.f;
import k2.h;
import k2.j;
import k2.l;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public FfmpegAudioDecoder(int i7, u uVar, boolean z9) {
        super(new h[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        int i10;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        uVar.s.getClass();
        String str2 = uVar.s;
        String a10 = FfmpegLibrary.a(str2);
        a10.getClass();
        this.o = a10;
        List list = uVar.v;
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1003765268:
                if (str2.equals("audio/vorbis")) {
                    c10 = 0;
                    break;
                }
                break;
            case -53558318:
                if (str2.equals("audio/mp4a-latm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1504470054:
                if (str2.equals("audio/alac")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1504891608:
                if (str2.equals("audio/opus")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        byte[] bArr3 = null;
        switch (c10) {
            case 0:
                byte[] bArr4 = (byte[]) list.get(0);
                byte[] bArr5 = (byte[]) list.get(1);
                byte[] bArr6 = new byte[bArr4.length + bArr5.length + 6];
                bArr6[0] = (byte) (bArr4.length >> 8);
                bArr6[1] = (byte) (bArr4.length & qs.e4);
                System.arraycopy(bArr4, 0, bArr6, 2, bArr4.length);
                bArr6[bArr4.length + 2] = 0;
                bArr6[bArr4.length + 3] = 0;
                bArr6[bArr4.length + 4] = (byte) (bArr5.length >> 8);
                bArr6[bArr4.length + 5] = (byte) (bArr5.length & qs.e4);
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
        this.q = z9 ? 4 : 2;
        this.r = z9 ? 131070 : 65535;
        long ffmpegInitialize = ffmpegInitialize(this.o, bArr, z9, uVar.L, uVar.K);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        o(i7);
    }

    private native int ffmpegDecode(long j3, ByteBuffer byteBuffer, int i7, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i10);

    private native int ffmpegGetChannelCount(long j3);

    private native int ffmpegGetSampleRate(long j3);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z9, int i7, int i10);

    private native void ffmpegRelease(long j3);

    private native long ffmpegReset(long j3, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i7) {
        this.r = i7;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.b;
        byteBuffer.getClass();
        ia.f(i7 >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i7);
        simpleDecoderOutputBuffer.b = order;
        return order;
    }

    @Override // k2.l
    public final h f() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // k2.l
    public final j g() {
        return new SimpleDecoderOutputBuffer(new a(this, 1));
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
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) jVar;
        if (z9) {
            long ffmpegReset = ffmpegReset(this.s, this.p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = hVar.c;
        String str = m0.a;
        int limit = byteBuffer.limit();
        long j3 = hVar.e;
        int i7 = this.r;
        simpleDecoderOutputBuffer.timeUs = j3;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.b;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i7) {
            simpleDecoderOutputBuffer.b = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.b.position(0);
        simpleDecoderOutputBuffer.b.limit(i7);
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
                x xVar = new x(this.p);
                xVar.N(this.p.length - 4);
                this.v = xVar.E();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.b;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    @Override // k2.l, k2.e
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
