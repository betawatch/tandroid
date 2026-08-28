package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ e41(b61 b61Var, int i9) {
        this.a = i9;
        this.b = b61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b61 b61Var = this.b;
                b61Var.getClass();
                b61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.m();
                break;
            case 2:
                b61 b61Var2 = this.b;
                View view = b61Var2.p0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b61Var2.V0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = b61Var2.i0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.an anVar = b61Var2.j0;
                if (anVar != null) {
                    anVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                b61 b61Var3 = this.b;
                v41 v41Var = b61Var3.T;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = b61Var3.i0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.an anVar2 = b61Var3.j0;
                if (anVar2 != null) {
                    anVar2.setAlpha(floatValue * floatValue);
                }
                v41Var.setAlpha(floatValue);
                v41Var.invalidate();
                b61Var3.invalidate();
                break;
        }
    }
}
