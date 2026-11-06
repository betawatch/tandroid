package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b1 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final l0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = h2.m0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public b1(Object obj, int i7, l0 l0Var, Object obj2, int i10, long j3, long j10, int i11, int i12) {
        ia.f(i7 >= 0);
        ia.f(i10 >= 0);
        this.a = obj;
        this.b = i7;
        this.c = l0Var;
        this.d = obj2;
        this.e = i10;
        this.f = j3;
        this.g = j10;
        this.h = i11;
        this.i = i12;
    }

    public final boolean a(b1 b1Var) {
        return this.b == b1Var.b && this.e == b1Var.e && this.f == b1Var.f && this.g == b1Var.g && this.h == b1Var.h && this.i == b1Var.i && Objects.equals(this.c, b1Var.c);
    }

    public final b1 b(boolean z9, boolean z10) {
        if (z9 && z10) {
            return this;
        }
        return new b1(this.a, z10 ? this.b : 0, z9 ? this.c : null, this.d, z10 ? this.e : 0, z9 ? this.f : 0L, z9 ? this.g : 0L, z9 ? this.h : -1, z9 ? this.i : -1);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(j, i10);
        }
        l0 l0Var = this.c;
        if (l0Var != null) {
            bundle.putBundle(k, l0Var.c(i7, false));
        }
        int i11 = this.e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(l, i11);
        }
        long j3 = this.f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(m, j3);
        }
        long j10 = this.g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(n, j10);
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
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.a, b1Var.a) && Objects.equals(this.d, b1Var.d)) {
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
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder j3 = rf.b.j(str, ", contentPos=");
        j3.append(this.g);
        j3.append(", adGroup=");
        j3.append(i7);
        j3.append(", ad=");
        j3.append(this.i);
        return j3.toString();
    }
}
