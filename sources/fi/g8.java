package fi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g8 extends p8 {
    public final /* synthetic */ n8 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(n8 n8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, d8 d8Var) {
        super(context, h6Var, d8Var);
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
