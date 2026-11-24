// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ip extends tl5 {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    /* JADX WARN: Multi-variable type inference failed */
    public ip(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // tl5, lf7
    public final void b(ht6 ht6Var) {
        ht6Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ip.class != obj.getClass()) {
            return false;
        }
        ip ipVar = (ip) obj;
        return this.d == ipVar.d && this.b.equals(ipVar.b) && Objects.equals(this.c, ipVar.c) && Arrays.equals(this.e, ipVar.e);
    }

    public final int hashCode() {
        int j = ts2.j((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // tl5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
