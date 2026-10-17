package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class j0 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final g0 c;
    public final b0 d;
    public final List e;
    public final String f;
    public final e9.n0 g;
    public final long h;

    static {
        String str = e2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public j0(Uri uri, String str, g0 g0Var, b0 b0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.a = uri;
        this.b = v0.n(str);
        this.c = g0Var;
        this.d = b0Var;
        this.e = list;
        this.f = str2;
        this.g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            n0 n0Var2 = (n0) n0Var.get(i10);
            m0 m0Var = new m0();
            m0Var.c = n0Var2.a;
            m0Var.d = n0Var2.b;
            m0Var.e = n0Var2.c;
            m0Var.a = n0Var2.d;
            m0Var.b = n0Var2.e;
            m0Var.f = n0Var2.f;
            m0Var.g = n0Var2.g;
            t10.c(new l0(m0Var));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.a.equals(j0Var.a) && Objects.equals(this.b, j0Var.b) && Objects.equals(this.c, j0Var.c) && Objects.equals(this.d, j0Var.d) && this.e.equals(j0Var.e) && Objects.equals(this.f, j0Var.f) && this.g.equals(j0Var.g) && this.h == j0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        g0 g0Var = this.c;
        int hashCode3 = (hashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        b0 b0Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
