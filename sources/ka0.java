// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ka0 extends ym9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ka0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            p3d.h("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            p3d.h("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            p3d.h("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ym9)) {
            return false;
        }
        ka0 ka0Var = (ka0) ((ym9) obj);
        return this.b.equals(ka0Var.b) && this.c.equals(ka0Var.c) && this.d.equals(ka0Var.d) && this.e.equals(ka0Var.e) && this.f == ka0Var.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return qu6.p(sb, this.f, "}");
    }
}
