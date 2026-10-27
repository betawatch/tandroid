package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m40 b;

    public /* synthetic */ k40(m40 m40Var, int i10) {
        this.a = i10;
        this.b = m40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        bi.r1 r1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40 m40Var = this.b;
                m40Var.w = floatValue;
                m40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                m40Var.e.setPadding(0, 0, 0, (int) (m40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40 m40Var2 = this.b;
                m40Var2.E = floatValue2;
                m40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                m40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, m40Var2.E));
                org.telegram.ui.ek ekVar = m40Var2.f;
                if (ekVar != null && (xnVar = ekVar.a) != null && (r1Var = xnVar.X3) != null) {
                    r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                    m40Var2.f.a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                }
                m40Var2.h.setAlpha(m40Var2.E);
                break;
        }
    }
}
