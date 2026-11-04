package ci;

import android.text.TextUtils;
import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ sf.b c;
    public final /* synthetic */ xg.e1 d;

    public /* synthetic */ p3(l6 l6Var, sf.b bVar, xg.e1 e1Var, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = bVar;
        this.d = e1Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.c.b();
                l6 l6Var = this.b;
                xg.e1 e1Var = this.d;
                if (str == null) {
                    if (e1Var != null) {
                        e1Var.dismiss();
                    }
                    l6Var.dismiss();
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.w5) {
                        ((org.telegram.ui.Wallet.w5) T).O0();
                        break;
                    }
                } else {
                    (e1Var != null ? new org.telegram.ui.Components.fc(e1Var.c, l6Var.J0) : l6Var.k()).e0(str, false);
                    break;
                }
                break;
            default:
                this.c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    l6 l6Var2 = this.b;
                    xg.e1 e1Var2 = this.d;
                    (e1Var2 != null ? new org.telegram.ui.Components.fc(e1Var2.c, l6Var2.J0) : l6Var2.k()).e0(str, false);
                    break;
                }
                break;
        }
    }
}
