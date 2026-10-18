package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d9 extends o9 {
    public final /* synthetic */ k9 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(k9 k9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, a9 a9Var) {
        super(context, d6Var, a9Var);
        this.L = k9Var;
    }

    @Override // ei.o9
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        k9 k9Var = this.L;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        k9 k9Var = this.L;
        k9Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (k9Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = k9Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
