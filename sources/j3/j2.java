package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j2 extends f2 {
    public static final String e;
    public static final String f;
    public static final q0 h;
    public final int c;
    public final float d;

    static {
        int i10 = h5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new q0(11);
    }

    public j2(int i10) {
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        this.c = i10;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.c == j2Var.c && this.d == j2Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    public j2(int i10, float f10) {
        boolean z4 = false;
        h5.a.e("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z4 = true;
        }
        h5.a.e("starRating is out of range [0, maxStars]", z4);
        this.c = i10;
        this.d = f10;
    }
}
