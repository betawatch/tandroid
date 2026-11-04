package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d1 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final n0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = g2.n0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public d1(Object obj, int i3, n0 n0Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        zb.f(i3 >= 0);
        zb.f(i10 >= 0);
        this.a = obj;
        this.b = i3;
        this.c = n0Var;
        this.d = obj2;
        this.e = i10;
        this.f = j10;
        this.g = j11;
        this.h = i11;
        this.i = i12;
    }

    public final boolean a(d1 d1Var) {
        return this.b == d1Var.b && this.e == d1Var.e && this.f == d1Var.f && this.g == d1Var.g && this.h == d1Var.h && this.i == d1Var.i && Objects.equals(this.c, d1Var.c);
    }

    public final d1 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new d1(this.a, z11 ? this.b : 0, z10 ? this.c : null, this.d, z11 ? this.e : 0, z10 ? this.f : 0L, z10 ? this.g : 0L, z10 ? this.h : -1, z10 ? this.i : -1);
    }

    public final Bundle c(int i3) {
        Bundle bundle = new Bundle();
        int i10 = this.b;
        if (i3 < 3 || i10 != 0) {
            bundle.putInt(j, i10);
        }
        n0 n0Var = this.c;
        if (n0Var != null) {
            bundle.putBundle(k, n0Var.c(i3, false));
        }
        int i11 = this.e;
        if (i3 < 3 || i11 != 0) {
            bundle.putInt(l, i11);
        }
        long j10 = this.f;
        if (i3 < 3 || j10 != 0) {
            bundle.putLong(m, j10);
        }
        long j11 = this.g;
        if (i3 < 3 || j11 != 0) {
            bundle.putLong(n, j11);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(o, i12);
        }
        int i13 = this.i;
        if (i13 != -1) {
            bundle.putInt(p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (a(d1Var) && Objects.equals(this.a, d1Var.a) && Objects.equals(this.d, d1Var.d)) {
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
        int i3 = this.h;
        if (i3 == -1) {
            return str;
        }
        StringBuilder h = t4.c.h(str, ", contentPos=");
        h.append(this.g);
        h.append(", adGroup=");
        h.append(i3);
        h.append(", ad=");
        h.append(this.i);
        return h.toString();
    }
}
