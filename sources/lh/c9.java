package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class c9 extends n9 {
    public final /* synthetic */ k9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(k9 k9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, z8 z8Var) {
        super(context, c6Var, z8Var);
        this.H = k9Var;
    }

    @Override // lh.n9
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        k9 k9Var = this.H;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        k9 k9Var = this.H;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.E) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
