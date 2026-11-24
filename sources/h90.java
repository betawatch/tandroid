// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h90 extends uz2 {
    public final String a;
    public final byte[] b;

    public h90(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uz2)) {
            return false;
        }
        uz2 uz2Var = (uz2) obj;
        h90 h90Var = (h90) uz2Var;
        if (!this.a.equals(h90Var.a)) {
            return false;
        }
        if (uz2Var instanceof h90) {
            h90Var = (h90) uz2Var;
        }
        return Arrays.equals(this.b, h90Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
