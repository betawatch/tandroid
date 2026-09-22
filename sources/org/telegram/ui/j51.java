package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;

    public /* synthetic */ j51(h71 h71Var, int i10) {
        this.a = i10;
        this.b = h71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h71 h71Var = this.b;
                h71Var.getClass();
                h71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                h71 h71Var2 = this.b;
                View view = h71Var2.t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, h71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = h71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.kn knVar = h71Var2.n0;
                if (knVar != null) {
                    knVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                h71 h71Var3 = this.b;
                b61 b61Var = h71Var3.a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = h71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.kn knVar2 = h71Var3.n0;
                if (knVar2 != null) {
                    knVar2.setAlpha(floatValue * floatValue);
                }
                b61Var.setAlpha(floatValue);
                b61Var.invalidate();
                h71Var3.invalidate();
                break;
        }
    }
}
