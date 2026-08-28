package bg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n2 extends fg.m {
    public final /* synthetic */ q2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q2 q2Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.F = q2Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        q2 q2Var = this.F;
        q2Var.l0 = dp;
        q2Var.k0.G();
    }
}
