package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f9 implements View.OnFocusChangeListener {
    public final /* synthetic */ i9 a;

    public f9(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            i9 i9Var = this.a;
            i9Var.i0 = true;
            s4.c0 c0Var = (s4.c0) i9Var.d.getLayoutManager();
            ii.o oVar = new ii.o(i9Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            c0Var.w0(oVar);
        }
    }
}
