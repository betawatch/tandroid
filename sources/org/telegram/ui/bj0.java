package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bj0 extends zg.i {
    public boolean K;
    public final /* synthetic */ ej0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.L = ej0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        ej0 ej0Var = this.L;
        ej0Var.l0 = dp;
        ej0Var.k0.G();
        if (this.K != ej0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = ej0Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.nm0 nm0Var = ej0Var.d;
                mi.n nVar = new mi.n(ej0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                nm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
