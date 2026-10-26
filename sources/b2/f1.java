package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f1 {
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
        String str = e2.n0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public f1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        yb.g(i10 >= 0);
        yb.g(i11 >= 0);
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

    public final boolean a(f1 f1Var) {
        return this.b == f1Var.b && this.e == f1Var.e && this.f == f1Var.f && this.g == f1Var.g && this.h == f1Var.h && this.i == f1Var.i && Objects.equals(this.c, f1Var.c);
    }

    public final f1 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new f1(this.a, z11 ? this.b : 0, z10 ? this.c : null, this.d, z11 ? this.e : 0, z10 ? this.f : 0L, z10 ? this.g : 0L, z10 ? this.h : -1, z10 ? this.i : -1);
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
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (a(f1Var) && Objects.equals(this.a, f1Var.a) && Objects.equals(this.d, f1Var.d)) {
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
        StringBuilder l4 = b10.l(str, ", contentPos=");
        l4.append(this.g);
        l4.append(", adGroup=");
        l4.append(i10);
        l4.append(", ad=");
        l4.append(this.i);
        return l4.toString();
    }
}
