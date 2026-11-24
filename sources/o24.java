// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class o24 {
    public final s24 a;
    public final byte[] b;

    public o24(s24 s24Var, byte[] bArr) {
        if (s24Var == null) {
            fvc.f("encoding is null");
            throw null;
        }
        if (bArr == null) {
            fvc.f("bytes is null");
            throw null;
        }
        this.a = s24Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o24)) {
            return false;
        }
        o24 o24Var = (o24) obj;
        if (this.a.equals(o24Var.a)) {
            return Arrays.equals(this.b, o24Var.b);
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
