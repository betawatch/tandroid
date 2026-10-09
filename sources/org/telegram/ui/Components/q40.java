package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s40 b;

    public /* synthetic */ q40(s40 s40Var, int i10) {
        this.a = i10;
        this.b = s40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s40 s40Var = this.b;
                s40Var.w = floatValue;
                s40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                s40Var.e.setPadding(0, 0, 0, (int) (s40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s40 s40Var2 = this.b;
                s40Var2.E = floatValue2;
                s40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                s40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, s40Var2.E));
                org.telegram.ui.jk jkVar = s40Var2.f;
                if (jkVar != null && (aoVar = jkVar.a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                    s40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                }
                s40Var2.h.setAlpha(s40Var2.E);
                break;
        }
    }
}
