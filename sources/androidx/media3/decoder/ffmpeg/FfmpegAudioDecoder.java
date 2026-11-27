package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends yla {
    public static final byte[] z = {102, 76, 97, 67};
    public final String r;
    public final byte[] s;
    public final byte t;
    public int u;
    public long v;
    public boolean w;
    public volatile int x;
    public volatile int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[LOOP:0: B:21:0x0067->B:37:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FfmpegAudioDecoder(int i, ko4 ko4Var, boolean z2) {
        super(new s93[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        int i2;
        byte[] bArr2;
        String str = FfmpegLibrary.a;
        ko4Var.t.getClass();
        String str2 = ko4Var.t;
        String a = FfmpegLibrary.a(str2);
        a.getClass();
        this.r = a;
        List list = ko4Var.w;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1003765268:
                if (str2.equals("audio/vorbis")) {
                    c = 0;
                    break;
                }
                break;
            case -53558318:
                if (str2.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                break;
            case 1504470054:
                if (str2.equals("audio/alac")) {
                    c = 2;
                    break;
                }
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c = 3;
                    break;
                }
                break;
            case 1504891608:
                if (str2.equals("audio/opus")) {
                    c = 4;
                    break;
                }
                break;
        }
        byte[] bArr3 = null;
        switch (c) {
            case 0:
                byte[] bArr4 = (byte[]) list.get(0);
                byte[] bArr5 = (byte[]) list.get(1);
                byte[] bArr6 = new byte[bArr4.length + bArr5.length + 6];
                bArr6[0] = (byte) (bArr4.length >> 8);
                bArr6[1] = (byte) (bArr4.length & jn7.d4);
                System.arraycopy(bArr4, 0, bArr6, 2, bArr4.length);
                bArr6[bArr4.length + 2] = 0;
                bArr6[bArr4.length + 3] = 0;
                bArr6[bArr4.length + 4] = (byte) (bArr5.length >> 8);
                bArr6[bArr4.length + 5] = (byte) (bArr5.length & jn7.d4);
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
                for (int i3 = 0; i3 < list.size(); i3++) {
                    byte[] bArr8 = (byte[]) list.get(i3);
                    if (bArr8.length >= 4) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            if (bArr8[i4] == z[i4]) {
                            }
                        }
                        i2 = 4;
                        if (bArr8.length - i2 != 34) {
                            bArr2 = new byte[34];
                            System.arraycopy(bArr8, i2, bArr2, 0, 34);
                        } else {
                            int i5 = i2 + 4;
                            if (bArr8.length >= i5) {
                                int i6 = bArr8[i2] & Byte.MAX_VALUE;
                                int i7 = ((bArr8[i2 + 1] & 255) << 16) | ((bArr8[i2 + 2] & 255) << 8) | (bArr8[i2 + 3] & 255);
                                if (i6 == 0 && i7 == 34 && bArr8.length >= i2 + 38) {
                                    bArr2 = new byte[34];
                                    System.arraycopy(bArr8, i5, bArr2, 0, 34);
                                }
                            }
                            bArr2 = null;
                        }
                        if (bArr2 == null) {
                            bArr = bArr2;
                            break;
                        }
                    }
                    i2 = 0;
                    if (bArr8.length - i2 != 34) {
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
        this.s = bArr;
        this.t = z2 ? (byte) 4 : (byte) 2;
        this.u = z2 ? 131070 : 65535;
        long ffmpegInitialize = ffmpegInitialize(this.r, bArr, z2, ko4Var.P, ko4Var.N);
        this.v = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        q(i);
    }

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z2, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.u = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.b;
        byteBuffer.getClass();
        yve.f(i >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i);
        simpleDecoderOutputBuffer.b = order;
        return order;
    }

    @Override // yla
    public final s93 f() {
        return new s93(2, FfmpegLibrary.b());
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
    public final q93 i(s93 s93Var, u93 u93Var, boolean z2) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) u93Var;
        if (z2) {
            long ffmpegReset = ffmpegReset(this.v, this.s);
            this.v = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = s93Var.c;
        String str = gcc.a;
        int limit = byteBuffer.limit();
        long j = s93Var.e;
        int i = this.u;
        simpleDecoderOutputBuffer.timeUs = j;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.b;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i) {
            simpleDecoderOutputBuffer.b = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.b.position(0);
        simpleDecoderOutputBuffer.b.limit(i);
        int ffmpegDecode = ffmpegDecode(this.v, byteBuffer, limit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.b, this.u);
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
        if (!this.w) {
            this.x = ffmpegGetChannelCount(this.v);
            this.y = ffmpegGetSampleRate(this.v);
            if (this.y == 0 && "alac".equals(this.r)) {
                this.s.getClass();
                ey7 ey7Var = new ey7(this.s);
                ey7Var.N(this.s.length - 4);
                this.y = ey7Var.E();
            }
            this.w = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.b;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    @Override // yla, n93
    public final void release() {
        super.release();
        ffmpegRelease(this.v);
        this.v = 0L;
    }
}
