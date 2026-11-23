package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class d8 extends m8 {
    public final /* synthetic */ k8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(k8 k8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, a8 a8Var) {
        super(context, h6Var, a8Var);
        this.N = k8Var;
    }

    @Override // hi.m8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        k8 k8Var = this.N;
        k8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (k8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        k8 k8Var = this.N;
        k8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (k8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
