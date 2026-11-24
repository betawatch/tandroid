// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fya {
    public final String a;
    public final String b;
    public final gya c;

    public fya(String str, String str2, gya gyaVar) {
        this.a = str;
        this.b = str2;
        this.c = gyaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fya)) {
            return false;
        }
        fya fyaVar = (fya) obj;
        return this.a.equals(fyaVar.a) && this.b.equals(fyaVar.b) && this.c.equals(fyaVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
