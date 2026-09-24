package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class r9 extends ca {
    public final /* synthetic */ y9 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(y9 y9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, m9 m9Var) {
        super(context, d6Var, m9Var);
        this.L = y9Var;
    }

    @Override // ci.ca
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        y9 y9Var = this.L;
        y9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (y9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y9 y9Var = this.L;
        y9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (y9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
