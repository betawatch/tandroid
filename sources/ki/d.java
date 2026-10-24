package ki;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.qi0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                qi0 qi0Var = qVar.O;
                if (qi0Var != null) {
                    qi0Var.g(false);
                    qVar.O = null;
                    break;
                }
                break;
            case 1:
                q qVar2 = this.b;
                qVar2.K(0, false, 0, false, 0L);
                qi0 qi0Var2 = qVar2.O;
                if (qi0Var2 != null) {
                    qi0Var2.g(true);
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
                    b4Var.setSendEnabled(qVar4.r.S3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
