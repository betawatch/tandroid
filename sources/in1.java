// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class in1 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ in1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        k47 k47Var;
        k47 k47Var2;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                k47 k47Var3 = yv1Var.v5;
                if (k47Var3 == null) {
                    return false;
                }
                if (gm.g(k47Var3.T0)) {
                    new c41(n21.a(yv1Var.getParentActivity()), yv1Var.Ba).k(false).j();
                }
                return true;
            case 1:
                return yv1Var.M9();
            default:
                yv1 yv1Var2 = this.b;
                byte b2 = yv1Var2.ac;
                if (b2 == 1 && (k47Var2 = yv1Var2.H5) != null) {
                    yv1Var2.J(k47Var2.e1(), 0, 0, 0, true, true);
                } else {
                    if (yv1Var2.x5 == null || b2 != 2 || (k47Var = yv1Var2.F5) == null) {
                        return false;
                    }
                    yv1Var2.J(k47Var.e1(), 0, 0, 0, true, true);
                }
                return true;
        }
    }
}
