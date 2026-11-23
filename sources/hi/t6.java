package hi;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ t6(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                w6 w6Var = (w6) obj;
                x6 x6Var = this.b;
                x6Var.I = null;
                x6Var.F = w6Var;
                x6Var.E = w6Var != null;
                x6Var.a();
                x6Var.invalidate();
                m9 m9Var = x6Var.b;
                if (m9Var != null) {
                    m9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                w6 w6Var2 = this.b.F;
                if (w6Var2 != null || g2Var == null) {
                    w6Var2.c(g2Var);
                    break;
                }
        }
    }
}
