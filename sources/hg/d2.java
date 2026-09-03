package hg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d2 extends lg.k {
    public final /* synthetic */ f2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f2 f2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.G = f2Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        f2 f2Var = this.G;
        f2Var.m0 = dp;
        f2Var.l0.G();
    }
}
