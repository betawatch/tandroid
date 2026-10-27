package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i1 extends h1 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = e2.n0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public i1(int i10) {
        yb.f("maxStars must be a positive integer", i10 > 0);
        this.b = i10;
        this.c = -1.0f;
    }

    @Override // b2.h1
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // b2.h1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.b == i1Var.b && this.c == i1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public i1(int i10, float f7) {
        boolean z10 = false;
        yb.f("maxStars must be a positive integer", i10 > 0);
        if (f7 >= 0.0f && f7 <= i10) {
            z10 = true;
        }
        yb.f("starRating is out of range [0, maxStars]", z10);
        this.b = i10;
        this.c = f7;
    }
}
