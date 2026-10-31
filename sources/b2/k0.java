package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k0 {
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
    public final h0 c;
    public final c0 d;
    public final List e;
    public final String f;
    public final e9.n0 g;
    public final long h;

    static {
        String str = e2.l0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public k0(Uri uri, String str, h0 h0Var, c0 c0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.a = uri;
        this.b = v0.n(str);
        this.c = h0Var;
        this.d = c0Var;
        this.e = list;
        this.f = str2;
        this.g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            o0 o0Var = (o0) n0Var.get(i10);
            n0 n0Var2 = new n0();
            n0Var2.c = o0Var.a;
            n0Var2.d = o0Var.b;
            n0Var2.e = o0Var.c;
            n0Var2.a = o0Var.d;
            n0Var2.b = o0Var.e;
            n0Var2.f = o0Var.f;
            n0Var2.g = o0Var.g;
            t10.c(new m0(n0Var2));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a.equals(k0Var.a) && Objects.equals(this.b, k0Var.b) && Objects.equals(this.c, k0Var.c) && Objects.equals(this.d, k0Var.d) && this.e.equals(k0Var.e) && Objects.equals(this.f, k0Var.f) && this.g.equals(k0Var.g) && this.h == k0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.c;
        int hashCode3 = (hashCode2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        c0 c0Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
