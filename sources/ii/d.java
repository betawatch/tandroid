package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.vi0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                vi0 vi0Var = rVar.O;
                if (vi0Var != null) {
                    vi0Var.h(false);
                    rVar.O = null;
                    break;
                }
                break;
            case 1:
                r rVar2 = this.b;
                rVar2.I(0, false, 0, false, 0L);
                vi0 vi0Var2 = rVar2.O;
                if (vi0Var2 != null) {
                    vi0Var2.h(true);
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
