// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lj8 extends uj5 {
    public final String b;
    public final byte[] c;

    public lj8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lj8.class != obj.getClass()) {
            return false;
        }
        lj8 lj8Var = (lj8) obj;
        return this.b.equals(lj8Var.b) && Arrays.equals(this.c, lj8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ir2.j(527, 31, this.b);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
