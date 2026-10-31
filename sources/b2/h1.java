package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h1 extends g1 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = e2.l0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public h1(int i10) {
        t6.e("maxStars must be a positive integer", i10 > 0);
        this.b = i10;
        this.c = -1.0f;
    }

    @Override // b2.g1
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // b2.g1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.b == h1Var.b && this.c == h1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public h1(int i10, float f7) {
        boolean z10 = false;
        t6.e("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        t6.e("starRating is out of range [0, maxStars]", z10);
        this.b = i10;
        this.c = f7;
    }
}
