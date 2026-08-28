package nh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ u(j0 j0Var, int i9) {
        this.a = i9;
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
                m10 m10Var = j0Var.y;
                AndroidUtilities.hideKeyboard(m10Var.r);
                m10Var.r.clearFocus();
                break;
            case 1:
                j0 j0Var2 = this.b;
                j0Var2.x.d.T2.h1(1, j0Var2.Q.b);
                j0Var2.c.a(false, true);
                j0Var2.setAllowNestedScroll(true);
                m10 m10Var2 = j0Var2.A;
                AndroidUtilities.hideKeyboard(m10Var2.r);
                m10Var2.r.clearFocus();
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
