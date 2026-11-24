// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m90 extends zz2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public m90(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zz2) {
            m90 m90Var = (m90) ((zz2) obj);
            if (this.a.equals(m90Var.a) && this.b.equals(m90Var.b)) {
                String str = m90Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = m90Var.d;
                    String str4 = this.d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = m90Var.e;
                        String str6 = this.e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = m90Var.f;
                            String str8 = this.f;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return b10.j(sb, this.f, "}");
    }
}
