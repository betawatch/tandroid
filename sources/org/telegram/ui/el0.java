package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm0 b;

    public /* synthetic */ el0(cm0 cm0Var, int i3) {
        this.a = i3;
        this.b = cm0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                gi.g1 g1Var = this.b.J;
                if (g1Var != null) {
                    g1Var.D(num.intValue());
                    break;
                }
                break;
            default:
                cm0 cm0Var = this.b;
                cm0Var.r = false;
                cm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    cm0Var.C0();
                    cm0Var.finishFragment();
                    cm0Var.I0();
                    break;
                }
                break;
        }
    }
}
