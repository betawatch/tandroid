package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class u9 extends fa {
    public final /* synthetic */ ba L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(ba baVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, p9 p9Var) {
        super(context, e6Var, p9Var);
        this.L = baVar;
    }

    @Override // ci.fa
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        ba baVar = this.L;
        baVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (baVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = baVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ba baVar = this.L;
        baVar.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.I) + (getY() - (baVar.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = baVar.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
