package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d40 b;

    public /* synthetic */ b40(d40 d40Var, int i10) {
        this.a = i10;
        this.b = d40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var = this.b;
                d40Var.w = floatValue;
                d40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var2 = this.b;
                d40Var2.B = floatValue2;
                d40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                d40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.B));
                org.telegram.ui.fk fkVar = d40Var2.f;
                if (fkVar != null && (ynVar = fkVar.a) != null && (e1Var = ynVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                    d40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                }
                d40Var2.h.setAlpha(d40Var2.B);
                break;
        }
    }
}
