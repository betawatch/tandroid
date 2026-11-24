// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gj1 {
    public static final fj1 b = new fj1();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof gj1) {
            return this.a.equals(((gj1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ej1) {
            return ((ej1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
