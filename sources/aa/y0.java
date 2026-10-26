package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class y0 extends a2 {
    public final z1 a;
    public final String b;
    public final String c;
    public final long d;

    public y0(z0 z0Var, String str, String str2, long j10) {
        this.a = z0Var;
        this.b = str;
        this.c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            y0 y0Var = (y0) ((a2) obj);
            if (this.a.equals(y0Var.a) && this.b.equals(y0Var.b) && this.c.equals(y0Var.c) && this.d == y0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j10 = this.d;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.a);
        sb2.append(", parameterKey=");
        sb2.append(this.b);
        sb2.append(", parameterValue=");
        sb2.append(this.c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
