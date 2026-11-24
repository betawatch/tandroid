// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ii0 extends uj5 {
    public final byte[] b;

    public ii0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ii0.class != obj.getClass()) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return this.a.equals(ii0Var.a) && Arrays.equals(this.b, ii0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ir2.j(527, 31, this.a);
    }
}
