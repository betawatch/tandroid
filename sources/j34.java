// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class j34 {
    public final n34 a;
    public final byte[] b;

    public j34(n34 n34Var, byte[] bArr) {
        if (n34Var == null) {
            p3d.h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            p3d.h("bytes is null");
            throw null;
        }
        this.a = n34Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j34)) {
            return false;
        }
        j34 j34Var = (j34) obj;
        if (this.a.equals(j34Var.a)) {
            return Arrays.equals(this.b, j34Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
