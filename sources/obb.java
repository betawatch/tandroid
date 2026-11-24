// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class obb extends nbb {
    public static Integer b(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (rr5.b(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = TLObject.FLAG_31;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }
}
