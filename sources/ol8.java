// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ol8 extends tl5 {
    public final String b;
    public final byte[] c;

    public ol8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol8.class != obj.getClass()) {
            return false;
        }
        ol8 ol8Var = (ol8) obj;
        return this.b.equals(ol8Var.b) && Arrays.equals(this.c, ol8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ts2.j(527, 31, this.b);
    }

    @Override // tl5
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
