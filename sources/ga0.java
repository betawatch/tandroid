// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ga0 {
    public final long a;
    public final ta0 b;
    public final r90 c;

    public ga0(long j, ta0 ta0Var, r90 r90Var) {
        this.a = j;
        this.b = ta0Var;
        this.c = r90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0Var = (ga0) obj;
        return this.a == ga0Var.a && this.b.equals(ga0Var.b) && this.c.equals(ga0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
