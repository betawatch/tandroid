package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t1 extends qg.h {
    public final /* synthetic */ v1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, Context context, p6 p6Var) {
        super(context, p6Var);
        this.K = v1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(78.0f) + getMeasuredHeight();
        v1 v1Var = this.K;
        v1Var.h2 = L;
        v1Var.g2.G();
    }
}
