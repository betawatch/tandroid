// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gs9 implements View.OnClickListener {
    public final /* synthetic */ gx0 a;

    public gs9(gx0 gx0Var) {
        this.a = gx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hs9 hs9Var = (hs9) this.a.d;
        for (int i = 0; i < hs9Var.e.size(); i++) {
            k27 k27Var = (k27) hs9Var.e.get(i);
            boolean z = hs9Var.I;
            int i2 = y6c.t0;
            if (z) {
                ba4.G(j5.a(i2).a).f(k27Var.F0());
            } else {
                ba4.G(j5.a(i2).a).X(k27Var.F0(), k27Var, 0, 0);
                up3.q(hs9Var.d).y();
            }
        }
        hs9Var.d(true);
    }
}
