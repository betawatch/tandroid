package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.hj0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.h(false);
                    rVar.O = null;
                    break;
                }
                break;
            case 1:
                r rVar2 = this.b;
                rVar2.K(0, false, 0, false, 0L);
                hj0 hj0Var2 = rVar2.O;
                if (hj0Var2 != null) {
                    hj0Var2.h(true);
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
