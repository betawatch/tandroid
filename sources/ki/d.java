package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.mi0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ d(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.K(2147483646, true, 0, false, 0L);
                mi0 mi0Var = qVar.O;
                if (mi0Var != null) {
                    mi0Var.h(false);
                    qVar.O = null;
                    break;
                }
                break;
            case 1:
                q qVar2 = this.b;
                qVar2.K(0, false, 0, false, 0L);
                mi0 mi0Var2 = qVar2.O;
                if (mi0Var2 != null) {
                    mi0Var2.h(true);
                    qVar2.O = null;
                    break;
                }
                break;
            case 2:
                q qVar3 = this.b;
                if (!UserConfig.getInstance(qVar3.n).isPremium()) {
                    new sg.y0(qVar3.b.f0, qVar3.getContext(), qVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                q qVar4 = this.b;
                b4 b4Var = qVar4.s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(qVar4.r.N3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
