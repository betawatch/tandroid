// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class at6 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = hac.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
    }

    public at6(q95 q95Var) {
        this.a = (Uri) q95Var.c;
        this.b = (String) q95Var.d;
        this.c = (String) q95Var.e;
        this.d = q95Var.a;
        this.e = q95Var.b;
        this.f = (String) q95Var.f;
        this.g = (String) q95Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at6)) {
            return false;
        }
        at6 at6Var = (at6) obj;
        return this.a.equals(at6Var.a) && Objects.equals(this.b, at6Var.b) && Objects.equals(this.c, at6Var.c) && this.d == at6Var.d && this.e == at6Var.e && Objects.equals(this.f, at6Var.f) && Objects.equals(this.g, at6Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
