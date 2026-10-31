package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e1 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final p0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = e2.l0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public e1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        t6.f(i10 >= 0);
        t6.f(i11 >= 0);
        this.a = obj;
        this.b = i10;
        this.c = p0Var;
        this.d = obj2;
        this.e = i11;
        this.f = j10;
        this.g = j11;
        this.h = i12;
        this.i = i13;
    }

    public final boolean a(e1 e1Var) {
        return this.b == e1Var.b && this.e == e1Var.e && this.f == e1Var.f && this.g == e1Var.g && this.h == e1Var.h && this.i == e1Var.i && Objects.equals(this.c, e1Var.c);
    }

    public final e1 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new e1(this.a, z11 ? this.b : 0, z10 ? this.c : null, this.d, z11 ? this.e : 0, z10 ? this.f : 0L, z10 ? this.g : 0L, z10 ? this.h : -1, z10 ? this.i : -1);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(j, i11);
        }
        p0 p0Var = this.c;
        if (p0Var != null) {
            bundle.putBundle(k, p0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(l, i12);
        }
        long j10 = this.f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(m, j10);
        }
        long j11 = this.g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(o, i13);
        }
        int i14 = this.i;
        if (i14 != -1) {
            bundle.putInt(p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.a, e1Var.a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = sc.e.i(str, ", contentPos=");
        i11.append(this.g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.i);
        return i11.toString();
    }
}
