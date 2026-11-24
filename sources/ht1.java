// default package

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ht1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt1 b;
    public final /* synthetic */ k27 c;

    public /* synthetic */ ht1(wt1 wt1Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = wt1Var;
        this.c = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.c;
        wt1 wt1Var = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = wt1Var.a;
                mu1Var.Z5();
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.k(0L, (mu1Var.a0.getVisibility() != 0 || mu1Var.T.getVisibility() == 0) ? 17 : 16, k27Var.C0(), null, null, new ht1(wt1Var, k27Var, (byte) 2));
                    break;
                }
                break;
            case 1:
                mu1 mu1Var2 = wt1Var.a;
                mu1Var2.ac = k27Var.e1();
                mu1Var2.bc = 0;
                break;
            default:
                mu1 mu1Var3 = wt1Var.a;
                if (mu1Var3.k5()) {
                    x3a b2 = x3a.b(k27Var.C0(), mu1Var3.l6, mu1Var3.F5, mu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = mu1Var3.O6();
                    mu1Var3.getSendMessagesHelper().q0(b2);
                    break;
                }
                break;
        }
    }
}
