package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
