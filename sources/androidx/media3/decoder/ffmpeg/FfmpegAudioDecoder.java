package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.s;
import e2.d;
import e2.d0;
import e2.v;
import h2.f;
import h2.h;
import h2.j;
import h2.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public FfmpegAudioDecoder(int i10, s sVar, boolean z10) {
        super(new h[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        int i11;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        sVar.r.getClass();
        String str2 = sVar.r;
        String a2 = FfmpegLibrary.a(str2);
        a2.getClass();
        this.o = a2;
        List list = sVar.u;
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1003765268:
                if (str2.equals("audio/vorbis")) {
                    c10 = 0;
                    break;
                }
                break;
            case -53558318:
                if (str2.equals(MediaController.AUDIO_MIME_TYPE)) {
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
                bArr6[1] = (byte) (bArr4.length & 255);
                System.arraycopy(bArr4, 0, bArr6, 2, bArr4.length);
                bArr6[bArr4.length + 2] = 0;
                bArr6[bArr4.length + 3] = 0;
                bArr6[bArr4.length + 4] = (byte) (bArr5.length >> 8);
                bArr6[bArr4.length + 5] = (byte) (bArr5.length & 255);
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
                for (int i12 = 0; i12 < list.size(); i12++) {
                    byte[] bArr8 = (byte[]) list.get(i12);
                    if (bArr8.length >= 4) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            if (bArr8[i13] == w[i13]) {
                            }
                        }
                        i11 = 4;
                        if (bArr8.length - i11 != 34) {
                            bArr2 = new byte[34];
                            System.arraycopy(bArr8, i11, bArr2, 0, 34);
                        } else {
                            int i14 = i11 + 4;
                            if (bArr8.length >= i14) {
                                int i15 = bArr8[i11] & Byte.MAX_VALUE;
                                int i16 = ((bArr8[i11 + 1] & 255) << 16) | ((bArr8[i11 + 2] & 255) << 8) | (bArr8[i11 + 3] & 255);
                                if (i15 == 0 && i16 == 34 && bArr8.length >= i11 + 38) {
                                    bArr2 = new byte[34];
                                    System.arraycopy(bArr8, i14, bArr2, 0, 34);
                                }
                            }
                            bArr2 = null;
                        }
                        if (bArr2 == null) {
                            bArr = bArr2;
                            break;
                        }
                    }
                    i11 = 0;
                    if (bArr8.length - i11 != 34) {
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
        long ffmpegInitialize = ffmpegInitialize(this.o, bArr, z10, sVar.K, sVar.J);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        o(i10);
    }

    private native int ffmpegDecode(long j3, ByteBuffer byteBuffer, int i10, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i11);

    private native int ffmpegGetChannelCount(long j3);

    private native int ffmpegGetSampleRate(long j3);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z10, int i10, int i11);

    private native void ffmpegRelease(long j3);

    private native long ffmpegReset(long j3, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i10) {
        this.r = i10;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.b;
        byteBuffer.getClass();
        d.b(i10 >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i10);
        simpleDecoderOutputBuffer.b = order;
        return order;
    }

    @Override // h2.l
    public final h f() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // h2.l
    public final j g() {
        return new SimpleDecoderOutputBuffer(new a(this, 1));
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
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) jVar;
        if (z10) {
            long ffmpegReset = ffmpegReset(this.s, this.p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = hVar.c;
        String str = d0.a;
        int limit = byteBuffer.limit();
        long j3 = hVar.e;
        int i10 = this.r;
        simpleDecoderOutputBuffer.timeUs = j3;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.b;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i10) {
            simpleDecoderOutputBuffer.b = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.b.position(0);
        simpleDecoderOutputBuffer.b.limit(i10);
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
                v vVar = new v(this.p);
                vVar.J(this.p.length - 4);
                this.v = vVar.B();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.b;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    @Override // h2.l, h2.e
    public final void release() {
        super.release();
        ffmpegRelease(this.s);
        this.s = 0L;
    }
}
