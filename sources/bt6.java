// default package

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bt6 {
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
    public final ys6 c;
    public final ss6 d;
    public final List e;
    public final String f;
    public final po5 g;
    public final long h;

    static {
        String str = gcc.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public bt6(Uri uri, String str, ys6 ys6Var, ss6 ss6Var, List list, String str2, po5 po5Var, long j2) {
        this.a = uri;
        this.b = dg7.n(str);
        this.c = ys6Var;
        this.d = ss6Var;
        this.e = list;
        this.f = str2;
        this.g = po5Var;
        mo5 p2 = po5.p();
        for (int i2 = 0; i2 < po5Var.size(); i2++) {
            et6 et6Var = (et6) po5Var.get(i2);
            t95 t95Var = new t95();
            t95Var.c = et6Var.a;
            t95Var.d = et6Var.b;
            t95Var.e = et6Var.c;
            t95Var.a = et6Var.d;
            t95Var.b = et6Var.e;
            t95Var.f = et6Var.f;
            t95Var.g = et6Var.g;
            p2.c(new dt6(t95Var));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt6)) {
            return false;
        }
        bt6 bt6Var = (bt6) obj;
        return this.a.equals(bt6Var.a) && Objects.equals(this.b, bt6Var.b) && Objects.equals(this.c, bt6Var.c) && Objects.equals(this.d, bt6Var.d) && this.e.equals(bt6Var.e) && Objects.equals(this.f, bt6Var.f) && this.g.equals(bt6Var.g) && this.h == bt6Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ys6 ys6Var = this.c;
        int hashCode3 = (hashCode2 + (ys6Var == null ? 0 : ys6Var.hashCode())) * 31;
        ss6 ss6Var = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (ss6Var == null ? 0 : ss6Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
