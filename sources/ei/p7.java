package ei;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
            s7Var.i0 = true;
            s4.b0 b0Var = (s4.b0) s7Var.d.getLayoutManager();
            li.n nVar = new li.n(s7Var.getContext(), 2);
            nVar.a = 1;
            nVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            b0Var.w0(nVar);
        }
    }
}
