package bg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b3 extends fg.m {
    public boolean F;
    public final /* synthetic */ g3 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(g3 g3Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.G = g3Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        g3 g3Var = this.G;
        g3Var.m0 = dp;
        g3Var.l0.G();
        if (this.F != g3Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = g3Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                wk0 wk0Var = g3Var.d;
                rh.n nVar = new rh.n(g3Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                wk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
