package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cj0 extends yg.h {
    public boolean K;
    public final /* synthetic */ fj0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(fj0 fj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.L = fj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        fj0 fj0Var = this.L;
        fj0Var.l0 = dp;
        fj0Var.k0.G();
        if (this.K != fj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = fj0Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = fj0Var.d;
                li.n nVar = new li.n(fj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
