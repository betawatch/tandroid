package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ d40(f40 f40Var, int i10) {
        this.a = i10;
        this.b = f40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.zn znVar;
        ai.w0 w0Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var = this.b;
                f40Var.w = floatValue;
                f40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                f40Var.e.setPadding(0, 0, 0, (int) (f40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = this.b;
                f40Var2.E = floatValue2;
                f40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                f40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f;
                if (fkVar != null && (znVar = fkVar.a) != null && (w0Var = znVar.J3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f.a.J3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                }
                f40Var2.h.setAlpha(f40Var2.E);
                break;
        }
    }
}
