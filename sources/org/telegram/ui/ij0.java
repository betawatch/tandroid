package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ij0 extends xg.i {
    public boolean J;
    public final /* synthetic */ lj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(lj0 lj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = lj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        lj0 lj0Var = this.K;
        lj0Var.l0 = dp;
        lj0Var.k0.G();
        if (this.J != lj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = lj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.ml0 ml0Var = lj0Var.d;
                ji.o oVar = new ji.o(lj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                ml0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
