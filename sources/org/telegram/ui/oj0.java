package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oj0 extends xg.i {
    public boolean J;
    public final /* synthetic */ rj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj0(rj0 rj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = rj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        rj0 rj0Var = this.K;
        rj0Var.l0 = dp;
        rj0Var.k0.G();
        if (this.J != rj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = rj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.ll0 ll0Var = rj0Var.d;
                ji.o oVar = new ji.o(rj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                ll0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
