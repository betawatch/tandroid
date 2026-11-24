// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fkc implements vn {
    public final byte a;

    public fkc(d00 d00Var) {
        this.a = d00Var.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fkc) || !cqe.a(Integer.valueOf(this.a), Integer.valueOf(((fkc) obj).a)) || !cqe.a(1, 1) || !cqe.a(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return cqe.a(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
