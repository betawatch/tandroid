package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d7 implements View.OnFocusChangeListener {
    public final /* synthetic */ g7 a;

    public d7(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            g7 g7Var = this.a;
            g7Var.e0 = true;
            f2.j0 j0Var = (f2.j0) g7Var.d.getLayoutManager();
            uh.n nVar = new uh.n(g7Var.getContext(), 2);
            nVar.a = 1;
            nVar.p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            j0Var.w0(nVar);
        }
    }
}
