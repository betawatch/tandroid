// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lu4 extends tl5 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public lu4(String str, byte[] bArr, String str2, String str3) {
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
        if (obj == null || lu4.class != obj.getClass()) {
            return false;
        }
        lu4 lu4Var = (lu4) obj;
        return Objects.equals(this.b, lu4Var.b) && this.c.equals(lu4Var.c) && this.d.equals(lu4Var.d) && Arrays.equals(this.e, lu4Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ts2.j(ts2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // tl5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
