// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a80 extends hz2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final l80 k;
    public final g80 l;
    public final d80 m;

    public a80(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, l80 l80Var, g80 g80Var, d80 d80Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = l80Var;
        this.l = g80Var;
        this.m = d80Var;
    }

    public final z70 a() {
        z70 z70Var = new z70();
        z70Var.a = this.b;
        z70Var.b = this.c;
        z70Var.c = this.d;
        z70Var.d = this.e;
        z70Var.e = this.f;
        z70Var.f = this.g;
        z70Var.g = this.h;
        z70Var.h = this.i;
        z70Var.i = this.j;
        z70Var.j = this.k;
        z70Var.k = this.l;
        z70Var.l = this.m;
        z70Var.m = (byte) 1;
        return z70Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz2)) {
            return false;
        }
        a80 a80Var = (a80) ((hz2) obj);
        if (!this.b.equals(a80Var.b) || !this.c.equals(a80Var.c) || this.d != a80Var.d || !this.e.equals(a80Var.e)) {
            return false;
        }
        String str = a80Var.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = a80Var.g;
        String str4 = this.g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = a80Var.h;
        String str6 = this.h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.i.equals(a80Var.i) || !this.j.equals(a80Var.j)) {
            return false;
        }
        l80 l80Var = a80Var.k;
        l80 l80Var2 = this.k;
        if (l80Var2 == null) {
            if (l80Var != null) {
                return false;
            }
        } else if (!l80Var2.equals(l80Var)) {
            return false;
        }
        g80 g80Var = a80Var.l;
        g80 g80Var2 = this.l;
        if (g80Var2 == null) {
            if (g80Var != null) {
                return false;
            }
        } else if (!g80Var2.equals(g80Var)) {
            return false;
        }
        d80 d80Var = a80Var.m;
        d80 d80Var2 = this.m;
        return d80Var2 == null ? d80Var == null : d80Var2.equals(d80Var);
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        l80 l80Var = this.k;
        int hashCode5 = (hashCode4 ^ (l80Var == null ? 0 : l80Var.hashCode())) * 1000003;
        g80 g80Var = this.l;
        int hashCode6 = (hashCode5 ^ (g80Var == null ? 0 : g80Var.hashCode())) * 1000003;
        d80 d80Var = this.m;
        return hashCode6 ^ (d80Var != null ? d80Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
