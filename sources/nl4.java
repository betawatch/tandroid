// default package

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nl4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl4)) {
            return false;
        }
        nl4 nl4Var = (nl4) obj;
        return Objects.equals(this.a, nl4Var.a) && Objects.equals(this.b, nl4Var.b) && Objects.equals(this.c, nl4Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
