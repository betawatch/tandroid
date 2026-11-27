// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ai1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gi1 b;

    public /* synthetic */ ai1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                gi1Var.g0(view);
                break;
            case 1:
                gi1Var.x.n(gi1Var.E != null, new xh1(gi1Var, (byte) 2), new o1(gi1Var, (byte) 11), 0);
                gi1Var.L.H(0);
                gi1Var.L.K(43);
                gi1Var.n.d();
                break;
            case 2:
                if (!gi1Var.l0) {
                    gi1Var.k0();
                    break;
                } else if (gi1Var.c0) {
                    gi1Var.c0 = false;
                    gi1Var.m0();
                    break;
                }
                break;
            default:
                if (!gi1Var.c0) {
                    gi1Var.c0 = true;
                    gi1Var.m0();
                    break;
                }
                break;
        }
    }
}
