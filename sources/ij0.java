// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ij0 extends tl5 {
    public final byte[] b;

    public ij0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij0.class != obj.getClass()) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        return this.a.equals(ij0Var.a) && Arrays.equals(this.b, ij0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ts2.j(527, 31, this.a);
    }
}
