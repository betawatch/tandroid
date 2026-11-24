// default package

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class hle {
    public static int a(byte b) {
        return b < 0 ? b + ConnectionsManager.USE_IPV4_ONLY : b;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            sdb.b(e);
            return null;
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & 65280)) | (r0[1] & 255))) / 256.0f;
    }

    public static int f(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static long g(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long h(ByteBuffer byteBuffer) {
        long g = g(byteBuffer) << 32;
        if (g >= 0) {
            return g(byteBuffer) + g;
        }
        wn4.j("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    public static int i(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
