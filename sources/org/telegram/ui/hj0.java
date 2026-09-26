package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hj0 extends xg.i {
    public boolean J;
    public final /* synthetic */ kj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(kj0 kj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = kj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        kj0 kj0Var = this.K;
        kj0Var.l0 = dp;
        kj0Var.k0.G();
        if (this.J != kj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = kj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.wl0 wl0Var = kj0Var.d;
                ji.o oVar = new ji.o(kj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                wl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
