package d2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i0 {
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
    public final f0 c;
    public final a0 d;
    public final List e;
    public final String f;
    public final g9.i0 g;
    public final long h;

    static {
        String str = g2.n0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public i0(Uri uri, String str, f0 f0Var, a0 a0Var, List list, String str2, g9.i0 i0Var, long j10) {
        this.a = uri;
        this.b = u0.n(str);
        this.c = f0Var;
        this.d = a0Var;
        this.e = list;
        this.f = str2;
        this.g = i0Var;
        g9.f0 p10 = g9.i0.p();
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            m0 m0Var = (m0) i0Var.get(i3);
            l0 l0Var = new l0();
            l0Var.c = m0Var.a;
            l0Var.d = m0Var.b;
            l0Var.e = m0Var.c;
            l0Var.a = m0Var.d;
            l0Var.b = m0Var.e;
            l0Var.f = m0Var.f;
            l0Var.g = m0Var.g;
            p10.c(new k0(l0Var));
        }
        p10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a.equals(i0Var.a) && Objects.equals(this.b, i0Var.b) && Objects.equals(this.c, i0Var.c) && Objects.equals(this.d, i0Var.d) && this.e.equals(i0Var.e) && Objects.equals(this.f, i0Var.f) && this.g.equals(i0Var.g) && this.h == i0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        f0 f0Var = this.c;
        int hashCode3 = (hashCode2 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        a0 a0Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
