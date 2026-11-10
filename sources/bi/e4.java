package bi;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ wg.f1 d;

    public /* synthetic */ e4(k7 k7Var, vf.b bVar, wg.f1 f1Var, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = bVar;
        this.d = f1Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.c.b();
                k7 k7Var = this.b;
                wg.f1 f1Var = this.d;
                if (str == null) {
                    if (f1Var != null) {
                        f1Var.dismiss();
                    }
                    k7Var.dismiss();
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.z5) {
                        ((org.telegram.ui.Wallet.z5) T).P0();
                        break;
                    }
                } else {
                    (f1Var != null ? new org.telegram.ui.Components.gc(f1Var.c, k7Var.I0) : k7Var.k()).e0(str, false);
                    break;
                }
                break;
            default:
                this.c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    k7 k7Var2 = this.b;
                    wg.f1 f1Var2 = this.d;
                    (f1Var2 != null ? new org.telegram.ui.Components.gc(f1Var2.c, k7Var2.I0) : k7Var2.k()).e0(str, false);
                    break;
                }
                break;
        }
    }
}
