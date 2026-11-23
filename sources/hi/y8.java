package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y8 extends h9 {
    public final /* synthetic */ f9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(f9 f9Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, v8 v8Var) {
        super(context, i6Var, v8Var);
        this.N = f9Var;
    }

    @Override // hi.h9
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        f9 f9Var = this.N;
        f9Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (f9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = f9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        f9 f9Var = this.N;
        f9Var.E.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.K) + (getY() - (f9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = f9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
