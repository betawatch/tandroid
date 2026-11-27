// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jo extends wl5 {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    /* JADX WARN: Multi-variable type inference failed */
    public jo(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // wl5, sf7
    public final void b(lt6 lt6Var) {
        lt6Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jo.class != obj.getClass()) {
            return false;
        }
        jo joVar = (jo) obj;
        return this.d == joVar.d && this.b.equals(joVar.b) && Objects.equals(this.c, joVar.c) && Arrays.equals(this.e, joVar.e);
    }

    public final int hashCode() {
        int j = bs2.j((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
