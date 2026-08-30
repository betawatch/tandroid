package gg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q2 extends kg.k {
    public boolean G;
    public final /* synthetic */ v2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(v2 v2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.H = v2Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        v2 v2Var = this.H;
        v2Var.n0 = dp;
        v2Var.m0.G();
        if (this.G != v2Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = v2Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                sl0 sl0Var = v2Var.d;
                wh.o oVar = new wh.o(v2Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                sl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
