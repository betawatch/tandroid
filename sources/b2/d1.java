package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d1 extends c1 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = e2.d0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public d1(int i10) {
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        this.b = i10;
        this.c = -1.0f;
    }

    @Override // b2.c1
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // b2.c1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.b == d1Var.b && this.c == d1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public d1(int i10, float f7) {
        boolean z10 = false;
        e2.d.a("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        e2.d.a("starRating is out of range [0, maxStars]", z10);
        this.b = i10;
        this.c = f7;
    }
}
