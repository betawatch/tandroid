// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
