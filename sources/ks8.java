// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ks8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ks8(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks8)) {
            return false;
        }
        ks8 ks8Var = (ks8) obj;
        return Objects.equals(this.a, ks8Var.a) && Objects.equals(this.b, ks8Var.b) && Objects.equals(this.c, ks8Var.c) && Objects.equals(this.d, ks8Var.d) && Objects.equals(this.e, ks8Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
