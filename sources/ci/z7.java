package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
            s4.c0 c0Var = (s4.c0) c8Var.d.getLayoutManager();
            ji.o oVar = new ji.o(c8Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            c0Var.w0(oVar);
        }
    }
}
