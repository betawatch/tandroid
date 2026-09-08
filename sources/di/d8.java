package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d8 implements View.OnFocusChangeListener {
    public final /* synthetic */ g8 a;

    public d8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            g8 g8Var = this.a;
            g8Var.i0 = true;
            s4.c0 c0Var = (s4.c0) g8Var.d.getLayoutManager();
            ki.p pVar = new ki.p(g8Var.getContext(), 2);
            pVar.a = 1;
            pVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            c0Var.w0(pVar);
        }
    }
}
