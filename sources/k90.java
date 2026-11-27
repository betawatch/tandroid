// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class k90 extends xz2 {
    public final List a;

    public k90(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xz2)) {
            return false;
        }
        return this.a.equals(((k90) ((xz2) obj)).a);
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
