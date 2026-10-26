package aa;

import a8.ff;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a0 extends g2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final f2 j;
    public final l1 k;
    public final i1 l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, f2 f2Var, l1 l1Var, i1 i1Var) {
        this.b = str;
        this.c = str2;
        this.d = i10;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = f2Var;
        this.k = l1Var;
        this.l = i1Var;
    }

    public final ff a() {
        ff ffVar = new ff();
        ffVar.a = this.b;
        ffVar.b = this.c;
        ffVar.c = Integer.valueOf(this.d);
        ffVar.d = this.e;
        ffVar.e = this.f;
        ffVar.f = this.g;
        ffVar.g = this.h;
        ffVar.h = this.i;
        ffVar.i = this.j;
        ffVar.j = this.k;
        ffVar.k = this.l;
        return ffVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        f2 f2Var;
        l1 l1Var;
        i1 i1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            a0 a0Var = (a0) ((g2) obj);
            i1 i1Var2 = a0Var.l;
            l1 l1Var2 = a0Var.k;
            f2 f2Var2 = a0Var.j;
            String str3 = a0Var.g;
            String str4 = a0Var.f;
            if (this.b.equals(a0Var.b) && this.c.equals(a0Var.c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.i.equals(a0Var.i) && ((f2Var = this.j) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((l1Var = this.k) != null ? l1Var.equals(l1Var2) : l1Var2 == null) && ((i1Var = this.l) != null ? i1Var.equals(i1Var2) : i1Var2 == null)) {
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
        f2 f2Var = this.j;
        int hashCode4 = (hashCode3 ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        l1 l1Var = this.k;
        int hashCode5 = (hashCode4 ^ (l1Var == null ? 0 : l1Var.hashCode())) * 1000003;
        i1 i1Var = this.l;
        return hashCode5 ^ (i1Var != null ? i1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }
}
