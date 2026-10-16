package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z7 implements View.OnFocusChangeListener {
    public final /* synthetic */ c8 a;

    public z7(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            c8 c8Var = this.a;
            c8Var.i0 = true;
            s4.b0 b0Var = (s4.b0) c8Var.d.getLayoutManager();
            ki.o oVar = new ki.o(c8Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            b0Var.w0(oVar);
        }
    }
}
