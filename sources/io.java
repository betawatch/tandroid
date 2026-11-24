// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class io extends uj5 {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    /* JADX WARN: Multi-variable type inference failed */
    public io(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // uj5, jd7
    public final void b(hr6 hr6Var) {
        hr6Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.class != obj.getClass()) {
            return false;
        }
        io ioVar = (io) obj;
        return this.d == ioVar.d && this.b.equals(ioVar.b) && Objects.equals(this.c, ioVar.c) && Arrays.equals(this.e, ioVar.e);
    }

    public final int hashCode() {
        int j = ir2.j((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
