// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class br1 extends yu1 {
    public final /* synthetic */ mu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br1(mu1 mu1Var, Context context) {
        super(context);
        this.d = mu1Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        mu1 mu1Var = this.d;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            ar1Var.invalidate();
        }
        if (getVisibility() != 8) {
            mu1Var.x7(true);
            FrameLayout frameLayout = mu1Var.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f);
            }
            mu1Var.E7();
            mu1Var.G7();
            View view = mu1Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        FrameLayout frameLayout;
        super.setVisibility(i);
        if (i != 8 || (frameLayout = this.d.R) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
