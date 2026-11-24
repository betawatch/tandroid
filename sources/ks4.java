// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ks4 extends uj5 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public ks4(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ks4.class != obj.getClass()) {
            return false;
        }
        ks4 ks4Var = (ks4) obj;
        return Objects.equals(this.b, ks4Var.b) && this.c.equals(ks4Var.c) && this.d.equals(ks4Var.d) && Arrays.equals(this.e, ks4Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ir2.j(ir2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
