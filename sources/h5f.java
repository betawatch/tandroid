// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class h5f {
    public static final s5f a;

    static {
        a = (a5f.e && a5f.d && !aje.a()) ? new s5f((byte) 1) : new s5f((byte) 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new q5f(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(int i, int i2, byte[] bArr) {
        int i3;
        int i4 = bArr[i - 1];
        int i5 = i2 - i;
        if (i5 == 0) {
            if (i4 > -12) {
                return -1;
            }
            return i4;
        }
        if (i5 == 1) {
            int i6 = bArr[i];
            if (i4 > -12 || i6 > -65) {
                return -1;
            }
            i3 = i6 << 8;
        } else {
            if (i5 != 2) {
                lq5.f();
                return 0;
            }
            int i7 = bArr[i];
            int i8 = bArr[i + 1];
            if (i4 > -12 || i7 > -65 || i8 > -65) {
                return -1;
            }
            i4 ^= i7 << 8;
            i3 = i8 << 16;
        }
        return i4 ^ i3;
    }
}
