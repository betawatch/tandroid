// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class k80 extends hz2 {
    public final l80 a;

    public k80(l80 l80Var) {
        this.a = l80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz2)) {
            return false;
        }
        return this.a.equals(((k80) ((hz2) obj)).a);
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.a + "}";
    }
}
