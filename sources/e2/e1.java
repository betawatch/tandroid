package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e1 extends d1 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = h2.l0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public e1(int i7) {
        la.e("maxStars must be a positive integer", i7 > 0);
        this.b = i7;
        this.c = -1.0f;
    }

    @Override // e2.d1
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // e2.d1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.b == e1Var.b && this.c == e1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public e1(int i7, float f10) {
        boolean z10 = false;
        la.e("maxStars must be a positive integer", i7 > 0);
        if (f10 >= 0.0f && f10 <= i7) {
            z10 = true;
        }
        la.e("starRating is out of range [0, maxStars]", z10);
        this.b = i7;
        this.c = f10;
    }
}
