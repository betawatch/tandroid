package ii;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m20;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                j0Var.v.d.f3.h1(1, j0Var.U.b);
                j0Var.b.a(false, true);
                j0Var.setAllowNestedScroll(true);
                m20 m20Var = j0Var.y;
                AndroidUtilities.hideKeyboard(m20Var.r);
                m20Var.r.clearFocus();
                break;
            case 1:
                j0 j0Var2 = this.b;
                j0Var2.x.d.f3.h1(1, j0Var2.U.b);
                j0Var2.c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                m20 m20Var2 = j0Var2.E;
                AndroidUtilities.hideKeyboard(m20Var2.r);
                m20Var2.r.clearFocus();
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
