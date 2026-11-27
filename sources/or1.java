// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class or1 extends lv1 {
    public final /* synthetic */ zu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or1(zu1 zu1Var, Context context) {
        super(context);
        this.d = zu1Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        zu1 zu1Var = this.d;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            nr1Var.invalidate();
        }
        if (getVisibility() != 8) {
            zu1Var.H7(true);
            FrameLayout frameLayout = zu1Var.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f);
            }
            zu1Var.O7();
            zu1Var.Q7();
            View view = zu1Var.fragmentView;
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
