package bi;

import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ u10 c;
    public final /* synthetic */ d2 d;

    public /* synthetic */ y(String str, u10 u10Var, d2 d2Var) {
        this.b = str;
        this.c = u10Var;
        this.d = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        d2 d2Var = this.d;
        u10 u10Var = this.c;
        String str = this.b;
        switch (i3) {
            case 0:
                a0.p(d2Var, 0, new y(str, u10Var, d2Var));
                break;
            default:
                if (str == null) {
                    fc.a0(d2Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                    break;
                } else {
                    u10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ y(d2 d2Var, String str, u10 u10Var) {
        this.d = d2Var;
        this.b = str;
        this.c = u10Var;
    }
}
