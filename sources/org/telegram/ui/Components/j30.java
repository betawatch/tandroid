package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l30 b;

    public /* synthetic */ j30(l30 l30Var, int i9) {
        this.a = i9;
        this.b = l30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l30 l30Var = this.b;
                l30Var.w = floatValue;
                l30Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                l30Var.e.setPadding(0, 0, 0, (int) (l30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l30 l30Var2 = this.b;
                l30Var2.A = floatValue2;
                l30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                l30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l30Var2.A));
                org.telegram.ui.wj wjVar = l30Var2.f;
                if (wjVar != null && (rnVar = wjVar.a) != null && (f1Var = rnVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                    l30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                }
                l30Var2.h.setAlpha(l30Var2.A);
                break;
        }
    }
}
