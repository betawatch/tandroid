package mi;

import org.telegram.messenger.h10;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(p pVar, int i3) {
        this.a = i3;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.L(true, 2147483646, 0, 0L, false);
                vf0 vf0Var = pVar.P;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    pVar.P = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.L(false, 0, 0, 0L, false);
                vf0 vf0Var2 = pVar2.P;
                if (vf0Var2 != null) {
                    vf0Var2.g(true);
                    pVar2.P = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!h10.i(pVar3.n).q()) {
                    new vg.v0(pVar3.b.X1, pVar3.getContext(), pVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                p pVar4 = this.b;
                y3 y3Var = pVar4.s;
                if (y3Var != null) {
                    y3Var.setSendEnabled(pVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
