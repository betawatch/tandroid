package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ i11(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                g31Var.getClass();
                g31Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                g31 g31Var2 = this.b;
                View view = g31Var2.t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, g31Var2.Z0), i0.b.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = g31Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.bn bnVar = g31Var2.n0;
                if (bnVar != null) {
                    bnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                g31 g31Var3 = this.b;
                b21 b21Var = g31Var3.a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(8.0f));
                View view3 = g31Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.bn bnVar2 = g31Var3.n0;
                if (bnVar2 != null) {
                    bnVar2.setAlpha(floatValue * floatValue);
                }
                b21Var.setAlpha(floatValue);
                b21Var.invalidate();
                g31Var3.invalidate();
                break;
        }
    }
}
