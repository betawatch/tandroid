package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class t9 extends fa {
    public final /* synthetic */ ba L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(ba baVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, o9 o9Var) {
        super(context, f6Var, o9Var);
        this.L = baVar;
    }

    @Override // di.fa
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
