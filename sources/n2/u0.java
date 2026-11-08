package n2;

import c8.g1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u0 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a;
    public int b;
    public int c;

    public static void a(ByteBuffer byteBuffer, long j3, int i7, int i10, boolean z9) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z9 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j3);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(g1.a(i10));
    }
}
