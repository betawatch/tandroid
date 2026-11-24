// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ib0 extends ml9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ib0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            gxc.d("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            gxc.d("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            gxc.d("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ml9)) {
            return false;
        }
        ib0 ib0Var = (ib0) ((ml9) obj);
        return this.b.equals(ib0Var.b) && this.c.equals(ib0Var.c) && this.d.equals(ib0Var.d) && this.e.equals(ib0Var.e) && this.f == ib0Var.f;
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
        return kt6.q(sb, this.f, "}");
    }
}
