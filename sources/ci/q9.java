package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class q9 extends ba {
    public final /* synthetic */ x9 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(x9 x9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, l9 l9Var) {
        super(context, d6Var, l9Var);
        this.L = x9Var;
    }

    @Override // ci.ba
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        x9 x9Var = this.L;
        x9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (x9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = x9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        x9 x9Var = this.L;
        x9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (x9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = x9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
