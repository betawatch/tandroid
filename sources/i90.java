// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i90 extends cz2 {
    public final List a;

    public i90(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cz2)) {
            return false;
        }
        return this.a.equals(((i90) ((cz2) obj)).a);
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
