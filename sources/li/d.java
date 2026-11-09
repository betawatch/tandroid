package li;

import org.telegram.messenger.p10;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                dg0 dg0Var = pVar.O;
                if (dg0Var != null) {
                    dg0Var.g(false);
                    pVar.O = null;
                    break;
                }
                break;
            case 1:
                p pVar2 = this.b;
                pVar2.L(false, 0, 0, 0L, false);
                dg0 dg0Var2 = pVar2.O;
                if (dg0Var2 != null) {
                    dg0Var2.g(true);
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
