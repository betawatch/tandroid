package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r8 extends b9 {
    public final /* synthetic */ y8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(y8 y8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, o8 o8Var) {
        super(context, c6Var, o8Var);
        this.H = y8Var;
    }

    @Override // nh.b9
    public final void setContainerHeight(float f9) {
        super.setContainerHeight(f9);
        y8 y8Var = this.H;
        y8Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (y8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        y8 y8Var = this.H;
        y8Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (y8Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y8Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
