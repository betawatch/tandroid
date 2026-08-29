package eg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r2 extends ig.k {
    public boolean F;
    public final /* synthetic */ w2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(w2 w2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.G = w2Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        w2 w2Var = this.G;
        w2Var.m0 = dp;
        w2Var.l0.G();
        if (this.F != w2Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = w2Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                jl0 jl0Var = w2Var.d;
                uh.n nVar = new uh.n(w2Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                jl0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
