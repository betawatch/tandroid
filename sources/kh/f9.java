package kh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f9 extends q9 {
    public final /* synthetic */ n9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(n9 n9Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, c9 c9Var) {
        super(context, b6Var, c9Var);
        this.H = n9Var;
    }

    @Override // kh.q9
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        n9 n9Var = this.H;
        n9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (n9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = n9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        n9 n9Var = this.H;
        n9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (n9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = n9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
