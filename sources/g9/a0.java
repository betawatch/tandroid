package g9;

import f7.f8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends e2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final d2 j;
    public final j1 k;
    public final g1 l;

    public a0(String str, String str2, int i9, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.b = str;
        this.c = str2;
        this.d = i9;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = d2Var;
        this.k = j1Var;
        this.l = g1Var;
    }

    public final f8 a() {
        f8 f8Var = new f8();
        f8Var.a = this.b;
        f8Var.b = this.c;
        f8Var.i = Integer.valueOf(this.d);
        f8Var.c = this.e;
        f8Var.d = this.f;
        f8Var.e = this.g;
        f8Var.k = this.h;
        f8Var.f = this.i;
        f8Var.g = this.j;
        f8Var.h = this.k;
        f8Var.j = this.l;
        return f8Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        d2 d2Var;
        j1 j1Var;
        g1 g1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            a0 a0Var = (a0) ((e2) obj);
            g1 g1Var2 = a0Var.l;
            j1 j1Var2 = a0Var.k;
            d2 d2Var2 = a0Var.j;
            String str3 = a0Var.g;
            String str4 = a0Var.f;
            if (this.b.equals(a0Var.b) && this.c.equals(a0Var.c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.i.equals(a0Var.i) && ((d2Var = this.j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        d2 d2Var = this.j;
        int hashCode4 = (hashCode3 ^ (d2Var == null ? 0 : d2Var.hashCode())) * 1000003;
        j1 j1Var = this.k;
        int hashCode5 = (hashCode4 ^ (j1Var == null ? 0 : j1Var.hashCode())) * 1000003;
        g1 g1Var = this.l;
        return hashCode5 ^ (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }
}
