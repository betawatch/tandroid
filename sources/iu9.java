// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iu9 implements View.OnClickListener {
    public final /* synthetic */ ny0 a;

    public iu9(ny0 ny0Var) {
        this.a = ny0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ju9 ju9Var = (ju9) this.a.d;
        for (int i = 0; i < ju9Var.e.size(); i++) {
            k47 k47Var = (k47) ju9Var.e.get(i);
            boolean z = ju9Var.I;
            int i2 = z8c.t0;
            if (z) {
                bc4.G(j5.a(i2).a).f(k47Var.F0());
            } else {
                bc4.G(j5.a(i2).a).X(k47Var.F0(), k47Var, 0, 0);
                er3.q(ju9Var.d).y();
            }
        }
        ju9Var.d(true);
    }
}
