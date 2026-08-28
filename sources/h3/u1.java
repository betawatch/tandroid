package h3;

import fh.y5;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u1 extends g2 {
    public static final String d;
    public static final y5 e;
    public final float c;

    static {
        int i9 = d5.f0.a;
        d = Integer.toString(1, 36);
        e = new y5(21);
    }

    public u1() {
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            return this.c == ((u1) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public u1(float f10) {
        d5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.c = f10;
    }
}
