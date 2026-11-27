// default package

import java.util.function.IntSupplier;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class cs2 extends vr2 {
    public int d;
    public IntSupplier e;
    public int f;
    public int g;
    public Integer h;

    public final void u() {
        this.h = 25;
    }

    public final ds2 v(js2 js2Var) {
        IntSupplier oq9Var;
        IntSupplier intSupplier = this.e;
        if (intSupplier != null) {
            oq9Var = intSupplier;
        } else {
            int i = this.d;
            r(i >= this.f && i <= this.g, Integer.valueOf(i));
            oq9Var = new oq9(this.d);
        }
        ds2 ds2Var = new ds2(s(), oq9Var, this.f, this.g, this.h, this.a);
        q(js2Var, ds2Var);
        return ds2Var;
    }

    public final void w(int i) {
        this.d = i;
        this.e = null;
    }

    public final void x(int i, int i2) {
        if (i > i2) {
            lq5.j(c00.h(i, i2, "range ", ".."));
        } else {
            this.f = i;
            this.g = i2;
        }
    }
}
