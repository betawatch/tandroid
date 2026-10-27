package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z8 extends k9 {
    public final /* synthetic */ g9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, w8 w8Var) {
        super(context, u6Var, w8Var);
        this.M = g9Var;
    }

    @Override // fi.k9
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        g9 g9Var = this.M;
        g9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (getY() - (g9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = g9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        g9 g9Var = this.M;
        g9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (getY() - (g9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = g9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
