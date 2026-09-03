package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gj0 extends kg.k {
    public boolean G;
    public final /* synthetic */ jj0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(jj0 jj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = jj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        jj0 jj0Var = this.H;
        jj0Var.i0 = dp;
        jj0Var.h0.G();
        if (this.G != jj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = jj0Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.rl0 rl0Var = jj0Var.d;
                wh.o oVar = new wh.o(jj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                rl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
