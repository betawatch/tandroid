package cg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t2 extends gg.l {
    public boolean F;
    public final /* synthetic */ y2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(y2 y2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.G = y2Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        y2 y2Var = this.G;
        y2Var.m0 = dp;
        y2Var.l0.G();
        if (this.F != y2Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = y2Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                zk0 zk0Var = y2Var.d;
                sh.n nVar = new sh.n(y2Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                zk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
