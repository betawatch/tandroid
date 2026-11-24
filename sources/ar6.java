// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ar6 {
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
        String str = g8c.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
    }

    public ar6(r75 r75Var) {
        this.a = (Uri) r75Var.c;
        this.b = (String) r75Var.d;
        this.c = (String) r75Var.e;
        this.d = r75Var.a;
        this.e = r75Var.b;
        this.f = (String) r75Var.f;
        this.g = (String) r75Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar6)) {
            return false;
        }
        ar6 ar6Var = (ar6) obj;
        return this.a.equals(ar6Var.a) && Objects.equals(this.b, ar6Var.b) && Objects.equals(this.c, ar6Var.c) && this.d == ar6Var.d && this.e == ar6Var.e && Objects.equals(this.f, ar6Var.f) && Objects.equals(this.g, ar6Var.g);
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
