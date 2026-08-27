package oh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ u(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.v.d.T2.h1(1, j0Var.Q.b);
                j0Var.b.a(false, true);
                j0Var.setAllowNestedScroll(true);
                p10 p10Var = j0Var.y;
                AndroidUtilities.hideKeyboard(p10Var.r);
                p10Var.r.clearFocus();
                break;
            case 1:
                j0 j0Var2 = this.b;
                j0Var2.x.d.T2.h1(1, j0Var2.Q.b);
                j0Var2.c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                p10 p10Var2 = j0Var2.A;
                AndroidUtilities.hideKeyboard(p10Var2.r);
                p10Var2.r.clearFocus();
                break;
            default:
                j0 j0Var3 = this.b;
                j0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", j0Var3.e);
                j0Var3.s.presentFragment(new o(bundle));
                j0Var3.dismiss();
                break;
        }
    }
}
