package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g0 {
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
    public final d0 c;
    public final y d;
    public final List e;
    public final String f;
    public final h9.i0 g;
    public final long h;

    static {
        String str = h2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.a = uri;
        this.b = s0.n(str);
        this.c = d0Var;
        this.d = yVar;
        this.e = list;
        this.f = str2;
        this.g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            j0 j0Var = new j0();
            j0Var.c = k0Var.a;
            j0Var.d = k0Var.b;
            j0Var.e = k0Var.c;
            j0Var.a = k0Var.d;
            j0Var.b = k0Var.e;
            j0Var.f = k0Var.f;
            j0Var.g = k0Var.g;
            p10.c(new i0(j0Var));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a.equals(g0Var.a) && Objects.equals(this.b, g0Var.b) && Objects.equals(this.c, g0Var.c) && Objects.equals(this.d, g0Var.d) && this.e.equals(g0Var.e) && Objects.equals(this.f, g0Var.f) && this.g.equals(g0Var.g) && this.h == g0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        d0 d0Var = this.c;
        int hashCode3 = (hashCode2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        y yVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
