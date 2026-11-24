// default package

import java.util.function.IntSupplier;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class jr2 extends cr2 {
    public int d;
    public IntSupplier e;
    public int f;
    public int g;

    public final kr2 u(qr2 qr2Var) {
        IntSupplier ym9Var;
        IntSupplier intSupplier = this.e;
        if (intSupplier != null) {
            ym9Var = intSupplier;
        } else {
            int i = this.d;
            r(i >= this.f && i <= this.g, Integer.valueOf(i));
            ym9Var = new ym9(this.d);
        }
        kr2 kr2Var = new kr2(s(), ym9Var, this.f, this.g, this.a);
        q(qr2Var, kr2Var);
        return kr2Var;
    }

    public final void v(int i) {
        this.d = i;
        this.e = null;
    }

    public final void w(int i, int i2) {
        if (i > i2) {
            w26.j(b00.g(i, i2, "range ", ".."));
        } else {
            this.f = i;
            this.g = i2;
        }
    }
}
