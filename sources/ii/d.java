package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.wi0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                rVar.I(2147483646, true, 0, false, 0L);
                wi0 wi0Var = rVar.O;
                if (wi0Var != null) {
                    wi0Var.h(false);
                    rVar.O = null;
                    break;
                }
                break;
            case 1:
                r rVar2 = this.b;
                rVar2.I(0, false, 0, false, 0L);
                wi0 wi0Var2 = rVar2.O;
                if (wi0Var2 != null) {
                    wi0Var2.h(true);
                    rVar2.O = null;
                    break;
                }
                break;
            case 2:
                r rVar3 = this.b;
                if (!UserConfig.getInstance(rVar3.n).isPremium()) {
                    new rg.x0(rVar3.b.f0, rVar3.getContext(), rVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                r rVar4 = this.b;
                c4 c4Var = rVar4.s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.r.M3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
