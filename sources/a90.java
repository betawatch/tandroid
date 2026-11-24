// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a90 extends s03 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final l90 k;
    public final g90 l;
    public final d90 m;

    public a90(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, l90 l90Var, g90 g90Var, d90 d90Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = l90Var;
        this.l = g90Var;
        this.m = d90Var;
    }

    public final z80 a() {
        z80 z80Var = new z80();
        z80Var.a = this.b;
        z80Var.b = this.c;
        z80Var.c = this.d;
        z80Var.d = this.e;
        z80Var.e = this.f;
        z80Var.f = this.g;
        z80Var.g = this.h;
        z80Var.h = this.i;
        z80Var.i = this.j;
        z80Var.j = this.k;
        z80Var.k = this.l;
        z80Var.l = this.m;
        z80Var.m = (byte) 1;
        return z80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s03)) {
            return false;
        }
        a90 a90Var = (a90) ((s03) obj);
        if (!this.b.equals(a90Var.b) || !this.c.equals(a90Var.c) || this.d != a90Var.d || !this.e.equals(a90Var.e)) {
            return false;
        }
        String str = a90Var.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = a90Var.g;
        String str4 = this.g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = a90Var.h;
        String str6 = this.h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.i.equals(a90Var.i) || !this.j.equals(a90Var.j)) {
            return false;
        }
        l90 l90Var = a90Var.k;
        l90 l90Var2 = this.k;
        if (l90Var2 == null) {
            if (l90Var != null) {
                return false;
            }
        } else if (!l90Var2.equals(l90Var)) {
            return false;
        }
        g90 g90Var = a90Var.l;
        g90 g90Var2 = this.l;
        if (g90Var2 == null) {
            if (g90Var != null) {
                return false;
            }
        } else if (!g90Var2.equals(g90Var)) {
            return false;
        }
        d90 d90Var = a90Var.m;
        d90 d90Var2 = this.m;
        return d90Var2 == null ? d90Var == null : d90Var2.equals(d90Var);
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        l90 l90Var = this.k;
        int hashCode5 = (hashCode4 ^ (l90Var == null ? 0 : l90Var.hashCode())) * 1000003;
        g90 g90Var = this.l;
        int hashCode6 = (hashCode5 ^ (g90Var == null ? 0 : g90Var.hashCode())) * 1000003;
        d90 d90Var = this.m;
        return hashCode6 ^ (d90Var != null ? d90Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
