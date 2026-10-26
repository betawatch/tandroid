package li;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ni0 ni0Var = qVar.O;
                if (ni0Var != null) {
                    ni0Var.g(false);
                    qVar.O = null;
                    break;
                }
                break;
            case 1:
                q qVar2 = this.b;
                qVar2.K(0, false, 0, false, 0L);
                ni0 ni0Var2 = qVar2.O;
                if (ni0Var2 != null) {
                    ni0Var2.g(true);
                    qVar2.O = null;
                    break;
                }
                break;
            case 2:
                q qVar3 = this.b;
                if (!UserConfig.getInstance(qVar3.n).isPremium()) {
                    new tg.y0(qVar3.b.f0, qVar3.getContext(), qVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                q qVar4 = this.b;
                a4 a4Var = qVar4.s;
                if (a4Var != null) {
                    a4Var.setSendEnabled(qVar4.r.S3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
