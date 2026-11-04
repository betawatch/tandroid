package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g1 extends f1 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = g2.n0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public g1(int i3) {
        zb.e("maxStars must be a positive integer", i3 > 0);
        this.b = i3;
        this.c = -1.0f;
    }

    @Override // d2.f1
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // d2.f1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.b == g1Var.b && this.c == g1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public g1(int i3, float f10) {
        boolean z10 = false;
        zb.e("maxStars must be a positive integer", i3 > 0);
        if (f10 >= 0.0f && f10 <= i3) {
            z10 = true;
        }
        zb.e("starRating is out of range [0, maxStars]", z10);
        this.b = i3;
        this.c = f10;
    }
}
