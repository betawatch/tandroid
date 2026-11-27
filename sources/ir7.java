// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ir7 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a;
    public int b;
    public int c;

    public ir7(ByteBuffer byteBuffer, byte b) {
        switch (b) {
            case 2:
                this.c = 0;
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
            default:
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
        }
    }

    public static void d(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(a2f.a(i2));
    }

    public final int a(int i) {
        int a;
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b;
        int i3 = byteBuffer.get((this.c / 8) + i2);
        if (i3 < 0) {
            i3 += 256;
        }
        int i4 = this.c;
        int i5 = 8 - (i4 % 8);
        if (i <= i5) {
            a = ((i3 << (i4 % 8)) & jn7.d4) >> ((i5 - i) + (i4 % 8));
            this.c = i4 + i;
        } else {
            int i6 = i - i5;
            a = (a(i5) << i6) + a(i6);
        }
        byteBuffer.position(i2 + ((int) Math.ceil(this.c / 8.0d)));
        return a;
    }

    public final boolean b() {
        return a(1) == 1;
    }

    public final void c(int i, int i2) {
        int i3 = this.b;
        ByteBuffer byteBuffer = this.a;
        int i4 = this.c;
        int i5 = 8 - (i4 % 8);
        if (i2 <= i5) {
            int i6 = byteBuffer.get((i4 / 8) + i3);
            if (i6 < 0) {
                i6 += 256;
            }
            int i7 = i6 + (i << (i5 - i2));
            int i8 = (this.c / 8) + i3;
            if (i7 > 127) {
                i7 -= 256;
            }
            byteBuffer.put(i8, (byte) i7);
            this.c += i2;
        } else {
            int i9 = i2 - i5;
            c(i >> i9, i5);
            c(i & ((1 << i9) - 1), i9);
        }
        int i10 = this.c;
        byteBuffer.position((i10 / 8) + i3 + (i10 % 8 <= 0 ? 0 : 1));
    }
}
