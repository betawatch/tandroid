package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f0 {
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
    public final c0 c;
    public final x d;
    public final List e;
    public final String f;
    public final e9.i0 g;
    public final long h;

    static {
        String str = e2.d0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.a = uri;
        this.b = r0.n(str);
        this.c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f = str2;
        this.g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            i0 i0Var2 = new i0();
            i0Var2.c = j0Var.a;
            i0Var2.d = j0Var.b;
            i0Var2.e = j0Var.c;
            i0Var2.a = j0Var.d;
            i0Var2.b = j0Var.e;
            i0Var2.f = j0Var.f;
            i0Var2.g = j0Var.g;
            u10.b(new h0(i0Var2));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a.equals(f0Var.a) && Objects.equals(this.b, f0Var.b) && Objects.equals(this.c, f0Var.c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f, f0Var.f) && this.g.equals(f0Var.g) && this.h == f0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c0 c0Var = this.c;
        int hashCode3 = (hashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        x xVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
