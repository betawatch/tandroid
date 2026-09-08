package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = e2.d0.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.b = false;
        this.c = false;
    }

    @Override // b2.c1
    public final boolean b() {
        return this.b;
    }

    @Override // b2.c1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.c == f1Var.c && this.b == f1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public f1(boolean z10) {
        this.b = true;
        this.c = z10;
    }
}
