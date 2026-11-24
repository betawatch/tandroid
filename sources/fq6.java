// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fq6 {
    public final boolean a;
    public final String b;
    public final String c;

    public fq6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fq6.class != obj.getClass()) {
            return false;
        }
        fq6 fq6Var = (fq6) obj;
        return this.a == fq6Var.a && Objects.equals(this.b, fq6Var.b) && Objects.equals(this.c, fq6Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
