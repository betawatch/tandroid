package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.yn ynVar;
        mh.d1 d1Var;
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
                f40Var2.B = floatValue2;
                f40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                f40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.B));
                org.telegram.ui.fk fkVar = f40Var2.f;
                if (fkVar != null && (ynVar = fkVar.a) != null && (d1Var = ynVar.I3) != null) {
                    d1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                    f40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                }
                f40Var2.h.setAlpha(f40Var2.B);
                break;
        }
    }
}
