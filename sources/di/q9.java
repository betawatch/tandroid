package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q9 extends ba {
    public final /* synthetic */ x9 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(x9 x9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, l9 l9Var) {
        super(context, c6Var, l9Var);
        this.L = x9Var;
    }

    @Override // di.ba
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
