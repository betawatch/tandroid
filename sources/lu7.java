// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lu7 {
    public final Object a;
    public final Object b;

    public lu7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        return Objects.equals(lu7Var.a, this.a) && Objects.equals(lu7Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
