package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i71 b;

    public /* synthetic */ l51(i71 i71Var, int i10) {
        this.a = i10;
        this.b = i71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i71 i71Var = this.b;
                i71Var.getClass();
                i71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                i71 i71Var2 = this.b;
                View view = i71Var2.t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, i71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = i71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.kn knVar = i71Var2.n0;
                if (knVar != null) {
                    knVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                i71 i71Var3 = this.b;
                c61 c61Var = i71Var3.a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = i71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.kn knVar2 = i71Var3.n0;
                if (knVar2 != null) {
                    knVar2.setAlpha(floatValue * floatValue);
                }
                c61Var.setAlpha(floatValue);
                c61Var.invalidate();
                i71Var3.invalidate();
                break;
        }
    }
}
