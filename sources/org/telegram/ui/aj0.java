package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class aj0 extends yg.h {
    public boolean J;
    public final /* synthetic */ dj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = dj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        dj0 dj0Var = this.K;
        dj0Var.l0 = dp;
        dj0Var.k0.G();
        if (this.J != dj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = dj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.im0 im0Var = dj0Var.d;
                li.n nVar = new li.n(dj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
