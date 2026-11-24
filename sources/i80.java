// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i80 extends my2 {
    public final j80 a;

    public i80(j80 j80Var) {
        this.a = j80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof my2)) {
            return false;
        }
        return this.a.equals(((i80) ((my2) obj)).a);
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.a + "}";
    }
}
