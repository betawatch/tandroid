package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
