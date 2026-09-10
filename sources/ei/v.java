package ei;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k20;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ v(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.v.d.X2.h1(1, k0Var.U.b);
                k0Var.b.a(false, true);
                k0Var.setAllowNestedScroll(true);
                k20 k20Var = k0Var.y;
                AndroidUtilities.hideKeyboard(k20Var.r);
                k20Var.r.clearFocus();
                break;
            case 1:
                k0 k0Var2 = this.b;
                k0Var2.x.d.X2.h1(1, k0Var2.U.b);
                k0Var2.c.a(false, true);
                k0Var2.setAllowNestedScroll(true);
                k20 k20Var2 = k0Var2.E;
                AndroidUtilities.hideKeyboard(k20Var2.r);
                k20Var2.r.clearFocus();
                break;
            default:
                k0 k0Var3 = this.b;
                k0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", k0Var3.e);
                k0Var3.s.presentFragment(new p(bundle));
                k0Var3.dismiss();
                break;
        }
    }
}
