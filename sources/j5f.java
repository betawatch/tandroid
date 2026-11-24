// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class j5f {
    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!d(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw ire.c();
    }

    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw ire.c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || d(b2)) {
            throw ire.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean d(byte b) {
        return b > -65;
    }
}
