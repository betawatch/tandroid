// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lj1 extends uj5 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final uj5[] f;

    public lj1(String str, boolean z, boolean z2, String[] strArr, uj5[] uj5VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = uj5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lj1.class != obj.getClass()) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        return this.c == lj1Var.c && this.d == lj1Var.d && this.b.equals(lj1Var.b) && Arrays.equals(this.e, lj1Var.e) && Arrays.equals(this.f, lj1Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
