package g5;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(byte b10) {
        return b10 < 0 ? b10 + ConnectionsManager.USE_IPV4_ONLY : b10;
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static String c(int i3, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i3 > 0 ? length / i3 : 0)];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i3 > 0 && i11 % i3 == 0 && i10 > 0) {
                cArr[i10] = '-';
                i10++;
            }
            int i12 = i10 + 1;
            byte b10 = bArr[i11];
            char[] cArr2 = a;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 += 2;
            cArr[i12] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static double e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 65536.0d;
    }

    public static float g(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & 65280)) | (r0[1] & 255))) / 256.0f;
    }

    public static int h(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static long i(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static long j(ByteBuffer byteBuffer) {
        long i3 = i(byteBuffer) << 32;
        if (i3 >= 0) {
            return i(byteBuffer) + i3;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int k(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }

    public static int l(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static void m(ByteBuffer byteBuffer, double d) {
        int i3 = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i3) >> 24));
        byteBuffer.put((byte) ((16711680 & i3) >> 16));
        byteBuffer.put((byte) ((65280 & i3) >> 8));
        byteBuffer.put((byte) (i3 & hs.e4));
    }

    public static void n(ByteBuffer byteBuffer, double d) {
        int i3 = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i3) >> 24));
        byteBuffer.put((byte) ((16711680 & i3) >> 16));
        byteBuffer.put((byte) ((65280 & i3) >> 8));
        byteBuffer.put((byte) (i3 & hs.e4));
    }

    public static void o(ByteBuffer byteBuffer, double d) {
        short s6 = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s6) >> 8));
        byteBuffer.put((byte) (s6 & 255));
    }

    public static void p(int i3, ByteBuffer byteBuffer) {
        r((65535 & i3) >> 8, byteBuffer);
        byteBuffer.put((byte) (i3 & hs.e4));
    }

    public static void q(int i3, ByteBuffer byteBuffer) {
        p((16777215 & i3) >> 8, byteBuffer);
        byteBuffer.put((byte) (i3 & hs.e4));
    }

    public static void r(int i3, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i3 & hs.e4));
    }
}
