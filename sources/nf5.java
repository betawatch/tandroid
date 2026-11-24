// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nf5 {
    public final fm4 a;
    public final String b;
    public final String c;

    public nf5(fm4 fm4Var, String str, String str2) {
        em4 a = fm4Var.a();
        a.a = null;
        a.l = null;
        this.a = new fm4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf5)) {
            return false;
        }
        nf5 nf5Var = (nf5) obj;
        return this.a.equals(nf5Var.a) && Objects.equals(this.b, nf5Var.b) && Objects.equals(this.c, nf5Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
