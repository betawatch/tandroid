package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a8 implements View.OnFocusChangeListener {
    public final /* synthetic */ d8 a;

    public a8(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            d8 d8Var = this.a;
            d8Var.i0 = true;
            s4.d0 d0Var = (s4.d0) d8Var.d.getLayoutManager();
            ji.o oVar = new ji.o(d8Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            d0Var.w0(oVar);
        }
    }
}
