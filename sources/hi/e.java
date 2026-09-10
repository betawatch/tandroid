package hi;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.cj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ e(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                sVar.I(2147483646, true, 0, false, 0L);
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    sVar.O = null;
                    break;
                }
                break;
            case 1:
                s sVar2 = this.b;
                sVar2.I(0, false, 0, false, 0L);
                cj0 cj0Var2 = sVar2.O;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    sVar2.O = null;
                    break;
                }
                break;
            case 2:
                s sVar3 = this.b;
                if (!UserConfig.getInstance(sVar3.n).isPremium()) {
                    new qg.a1(sVar3.b.f0, sVar3.getContext(), sVar3.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                s sVar4 = this.b;
                e4 e4Var = sVar4.s;
                if (e4Var != null) {
                    e4Var.setSendEnabled(sVar4.r.L3());
                    break;
                }
                break;
            default:
                this.b.a0();
                break;
        }
    }
}
