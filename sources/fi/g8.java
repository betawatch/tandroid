package fi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g8 extends p8 {
    public final /* synthetic */ n8 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(n8 n8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, d8 d8Var) {
        super(context, g6Var, d8Var);
        this.M = n8Var;
    }

    @Override // fi.p8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        n8 n8Var = this.M;
        n8Var.D.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.J) + (getY() - (n8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = n8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        n8 n8Var = this.M;
        n8Var.D.setTranslationY((Math.min(org.telegram.messenger.g0.L(150.0f), this.J) + (getY() - (n8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = n8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
