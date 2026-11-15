package di;

import android.text.TextUtils;
import org.telegram.messenger.z10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ wg.c1 d;

    public /* synthetic */ g3(c6 c6Var, vf.b bVar, wg.c1 c1Var, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = bVar;
        this.d = c1Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.c.b();
                c6 c6Var = this.b;
                wg.c1 c1Var = this.d;
                if (str == null) {
                    if (c1Var != null) {
                        c1Var.dismiss();
                    }
                    c6Var.dismiss();
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.y5) {
                        ((org.telegram.ui.Wallet.y5) T).P0();
                        break;
                    }
                } else {
                    (c1Var != null ? new org.telegram.ui.Components.cc(c1Var.c, c6Var.J0) : c6Var.k()).e0(str, false);
                    break;
                }
                break;
            default:
                this.c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    c6 c6Var2 = this.b;
                    wg.c1 c1Var2 = this.d;
                    (c1Var2 != null ? new org.telegram.ui.Components.cc(c1Var2.c, c6Var2.J0) : c6Var2.k()).e0(str, false);
                    break;
                }
                break;
        }
    }
}
