// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g90 extends bz2 {
    public final h90 a;
    public final String b;
    public final String c;
    public final long d;

    public g90(h90 h90Var, String str, String str2, long j) {
        this.a = h90Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bz2)) {
            return false;
        }
        g90 g90Var = (g90) ((bz2) obj);
        return this.a.equals(g90Var.a) && this.b.equals(g90Var.b) && this.c.equals(g90Var.c) && this.d == g90Var.d;
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
        return ls6.p(sb, this.d, "}");
    }
}
