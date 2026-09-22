package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            ji.o oVar = new ji.o(g8Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            c0Var.w0(oVar);
        }
    }
}
