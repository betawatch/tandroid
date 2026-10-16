package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.gj0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ d(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.K(2147483646, true, 0, false, 0L);
                gj0 gj0Var = rVar.O;
                if (gj0Var != null) {
                    gj0Var.h(false);
                    rVar.O = null;
                    break;
                }
                break;
            case 1:
                r rVar2 = this.b;
                rVar2.K(0, false, 0, false, 0L);
                gj0 gj0Var2 = rVar2.O;
                if (gj0Var2 != null) {
                    gj0Var2.h(true);
                    rVar2.O = null;
                    break;
                }
                break;
            case 2:
                r rVar3 = this.b;
                if (!UserConfig.getInstance(rVar3.n).isPremium()) {
                    new sg.y0(rVar3.b.f0, rVar3.getContext(), rVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                r rVar4 = this.b;
                c4 c4Var = rVar4.s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.r.N3());
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
