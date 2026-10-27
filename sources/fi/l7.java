package fi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l7 implements View.OnFocusChangeListener {
    public final /* synthetic */ o7 a;

    public l7(o7 o7Var) {
        this.a = o7Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            o7 o7Var = this.a;
            o7Var.i0 = true;
            s4.c0 c0Var = (s4.c0) o7Var.d.getLayoutManager();
            mi.n nVar = new mi.n(o7Var.getContext(), 2);
            nVar.a = 1;
            nVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            c0Var.w0(nVar);
        }
    }
}
