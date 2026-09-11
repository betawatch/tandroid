package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a1 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final k0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = e2.d0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.a = obj;
        this.b = i10;
        this.c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f = j3;
        this.g = j10;
        this.h = i12;
        this.i = i13;
    }

    public final boolean a(a1 a1Var) {
        return this.b == a1Var.b && this.e == a1Var.e && this.f == a1Var.f && this.g == a1Var.g && this.h == a1Var.h && this.i == a1Var.i && Objects.equals(this.c, a1Var.c);
    }

    public final a1 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new a1(this.a, z11 ? this.b : 0, z10 ? this.c : null, this.d, z11 ? this.e : 0, z10 ? this.f : 0L, z10 ? this.g : 0L, z10 ? this.h : -1, z10 ? this.i : -1);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(j, i11);
        }
        k0 k0Var = this.c;
        if (k0Var != null) {
            bundle.putBundle(k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(l, i12);
        }
        long j3 = this.f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(m, j3);
        }
        long j10 = this.g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(n, j10);
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
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.a, a1Var.a) && Objects.equals(this.d, a1Var.d)) {
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
        StringBuilder g10 = w.f.g(str, ", contentPos=");
        g10.append(this.g);
        g10.append(", adGroup=");
        g10.append(i10);
        g10.append(", ad=");
        g10.append(this.i);
        return g10.toString();
    }
}
