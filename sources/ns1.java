// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ns1 extends kw1 {
    public final /* synthetic */ yv1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(yv1 yv1Var, Context context) {
        super(context);
        this.d = yv1Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        yv1 yv1Var = this.d;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            ms1Var.invalidate();
        }
        if (getVisibility() != 8) {
            yv1Var.H7(true);
            FrameLayout frameLayout = yv1Var.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f);
            }
            yv1Var.O7();
            yv1Var.Q7();
            View view = yv1Var.fragmentView;
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
