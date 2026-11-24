// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ev9 {
    public final hv9 a;
    public final hv9 b;

    public ev9(hv9 hv9Var, hv9 hv9Var2) {
        this.a = hv9Var;
        this.b = hv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ev9.class != obj.getClass()) {
            return false;
        }
        ev9 ev9Var = (ev9) obj;
        return this.a.equals(ev9Var.a) && this.b.equals(ev9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        hv9 hv9Var = this.a;
        sb.append(hv9Var);
        hv9 hv9Var2 = this.b;
        if (hv9Var.equals(hv9Var2)) {
            str = "";
        } else {
            str = ", " + hv9Var2;
        }
        return b00.j(sb, str, "]");
    }
}
