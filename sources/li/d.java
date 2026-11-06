package li;

import org.telegram.messenger.p10;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ d(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.L(true, 2147483646, 0, 0L, false);
                bg0 bg0Var = pVar.O;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    pVar.O = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.L(false, 0, 0, 0L, false);
                bg0 bg0Var2 = pVar2.O;
                if (bg0Var2 != null) {
                    bg0Var2.g(true);
                    pVar2.O = null;
                    break;
                }
                break;
            case 2:
                p pVar3 = this.b;
                if (!p10.i(pVar3.n).q()) {
                    new ug.w0(pVar3.b.W1, pVar3.getContext(), pVar3.n, 43, true).show();
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
