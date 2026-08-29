package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d61 b;

    public /* synthetic */ g41(d61 d61Var, int i10) {
        this.a = i10;
        this.b = d61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d61 d61Var = this.b;
                d61Var.getClass();
                d61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                d61 d61Var2 = this.b;
                View view = d61Var2.p0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, d61Var2.V0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = d61Var2.i0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.fn fnVar = d61Var2.j0;
                if (fnVar != null) {
                    fnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                d61 d61Var3 = this.b;
                x41 x41Var = d61Var3.T;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = d61Var3.i0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.fn fnVar2 = d61Var3.j0;
                if (fnVar2 != null) {
                    fnVar2.setAlpha(floatValue * floatValue);
                }
                x41Var.setAlpha(floatValue);
                x41Var.invalidate();
                d61Var3.invalidate();
                break;
        }
    }
}
