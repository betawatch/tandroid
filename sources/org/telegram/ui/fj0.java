package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fj0 extends lg.k {
    public boolean G;
    public final /* synthetic */ ij0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj0(ij0 ij0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = ij0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        ij0 ij0Var = this.H;
        ij0Var.i0 = dp;
        ij0Var.h0.G();
        if (this.G != ij0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = ij0Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.sl0 sl0Var = ij0Var.d;
                xh.o oVar = new xh.o(ij0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                sl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
