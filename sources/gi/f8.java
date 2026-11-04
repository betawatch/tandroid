package gi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f8 extends q8 {
    public final /* synthetic */ o8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(o8 o8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        super(context, e6Var, c8Var);
        this.N = o8Var;
    }

    @Override // gi.q8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        o8 o8Var = this.N;
        o8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (o8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = o8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        o8 o8Var = this.N;
        o8Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (o8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = o8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
