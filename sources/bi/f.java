package bi;

import org.telegram.messenger.e20;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ f(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.J(true, 2147483646, 0, 0L, false);
                ih0 ih0Var = tVar.O;
                if (ih0Var != null) {
                    ih0Var.g(false);
                    tVar.O = null;
                    break;
                }
                break;
            case 1:
                t tVar2 = this.b;
                tVar2.J(false, 0, 0, 0L, false);
                ih0 ih0Var2 = tVar2.O;
                if (ih0Var2 != null) {
                    ih0Var2.g(true);
                    tVar2.O = null;
                    break;
                }
                break;
            case 2:
                t tVar3 = this.b;
                if (!e20.i(tVar3.n).q()) {
                    new kg.i1(tVar3.b.W1, tVar3.getContext(), tVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                t tVar4 = this.b;
                i4 i4Var = tVar4.s;
                if (i4Var != null) {
                    i4Var.setSendEnabled(tVar4.r.P3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
