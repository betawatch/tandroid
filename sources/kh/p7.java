package kh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p7 implements View.OnFocusChangeListener {
    public final /* synthetic */ s7 a;

    public p7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            s7 s7Var = this.a;
            s7Var.e0 = true;
            f2.m0 m0Var = (f2.m0) s7Var.d.getLayoutManager();
            rh.n nVar = new rh.n(s7Var.getContext(), 2);
            nVar.a = 1;
            nVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            m0Var.w0(nVar);
        }
    }
}
