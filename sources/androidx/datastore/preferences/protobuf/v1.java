package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v1 {
    public static final s0 a;

    static {
        a = (s1.f && s1.e && !c.a()) ? new t1(1) : new t1(0);
    }

    public static int a(int i9, int i10, byte[] bArr) {
        byte b10 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            return c(b10, bArr[i9]);
        }
        if (i11 == 2) {
            return d(b10, bArr[i9], bArr[i9 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new u1(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int c(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    public static int d(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
