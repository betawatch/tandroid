package h3;

import fh.y5;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l2 extends g2 {
    public static final String e;
    public static final String f;
    public static final y5 h;
    public final int c;
    public final float d;

    static {
        int i9 = d5.f0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new y5(23);
    }

    public l2(int i9) {
        d5.a.e("maxStars must be a positive integer", i9 > 0);
        this.c = i9;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.c == l2Var.c && this.d == l2Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    public l2(int i9, float f10) {
        boolean z10 = false;
        d5.a.e("maxStars must be a positive integer", i9 > 0);
        if (f10 >= 0.0f && f10 <= i9) {
            z10 = true;
        }
        d5.a.e("starRating is out of range [0, maxStars]", z10);
        this.c = i9;
        this.d = f10;
    }
}
