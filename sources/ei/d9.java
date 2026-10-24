package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class d9 extends o9 {
    public final /* synthetic */ k9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(k9 k9Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, a9 a9Var) {
        super(context, g6Var, a9Var);
        this.M = k9Var;
    }

    @Override // ei.o9
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        k9 k9Var = this.M;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        k9 k9Var = this.M;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.J) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
