package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l2 extends g2 {
    public static final String e;
    public static final String f;
    public static final d0 h;
    public final int c;
    public final float d;

    static {
        int i10 = f5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new d0(10);
    }

    public l2(int i10) {
        f5.a.e("maxStars must be a positive integer", i10 > 0);
        this.c = i10;
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

    public l2(int i10, float f9) {
        boolean z10 = false;
        f5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f9 >= 0.0f && f9 <= i10) {
            z10 = true;
        }
        f5.a.e("starRating is out of range [0, maxStars]", z10);
        this.c = i10;
        this.d = f9;
    }
}
