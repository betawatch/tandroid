package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d0 extends u2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final t2 k;
    public final x1 l;
    public final u1 m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.b = str;
        this.c = str2;
        this.d = i7;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = t2Var;
        this.l = x1Var;
        this.m = u1Var;
    }

    public final c0 a() {
        c0 c0Var = new c0();
        c0Var.a = this.b;
        c0Var.b = this.c;
        c0Var.c = this.d;
        c0Var.d = this.e;
        c0Var.e = this.f;
        c0Var.f = this.g;
        c0Var.g = this.h;
        c0Var.h = this.i;
        c0Var.i = this.j;
        c0Var.j = this.k;
        c0Var.k = this.l;
        c0Var.l = this.m;
        c0Var.m = (byte) 1;
        return c0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        t2 t2Var;
        x1 x1Var;
        u1 u1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            d0 d0Var = (d0) ((u2) obj);
            u1 u1Var2 = d0Var.m;
            x1 x1Var2 = d0Var.l;
            t2 t2Var2 = d0Var.k;
            String str4 = d0Var.h;
            String str5 = d0Var.g;
            String str6 = d0Var.f;
            if (this.b.equals(d0Var.b) && this.c.equals(d0Var.c) && this.d == d0Var.d && this.e.equals(d0Var.e) && ((str = this.f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.i.equals(d0Var.i) && this.j.equals(d0Var.j) && ((t2Var = this.k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        t2 t2Var = this.k;
        int hashCode5 = (hashCode4 ^ (t2Var == null ? 0 : t2Var.hashCode())) * 1000003;
        x1 x1Var = this.l;
        int hashCode6 = (hashCode5 ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        u1 u1Var = this.m;
        return hashCode6 ^ (u1Var != null ? u1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
