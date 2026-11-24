// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ga0 extends m03 {
    public final ha0 a;
    public final String b;
    public final String c;
    public final long d;

    public ga0(ha0 ha0Var, String str, String str2, long j) {
        this.a = ha0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m03)) {
            return false;
        }
        ga0 ga0Var = (ga0) ((m03) obj);
        return this.a.equals(ga0Var.a) && this.b.equals(ga0Var.b) && this.c.equals(ga0Var.c) && this.d == ga0Var.d;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return kt6.q(sb, this.d, "}");
    }
}
