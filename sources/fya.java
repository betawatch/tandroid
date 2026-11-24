// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
