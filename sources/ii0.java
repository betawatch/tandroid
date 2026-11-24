// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
