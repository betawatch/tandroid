// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ile {
    public static void a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & kk7.d4));
    }

    public static void b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & kk7.d4));
    }

    public static void c(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    public static void d(int i, ByteBuffer byteBuffer) {
        f((65535 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & kk7.d4));
    }

    public static void e(int i, ByteBuffer byteBuffer) {
        d((16777215 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & kk7.d4));
    }

    public static void f(int i, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i & kk7.d4));
    }
}
