// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d79 {
    public static final d79 c = new d79(0, false);
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public d79(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d79.class != obj.getClass()) {
            return false;
        }
        d79 d79Var = (d79) obj;
        return this.a == d79Var.a && this.b == d79Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
