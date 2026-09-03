package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ c40(e40 e40Var, int i10) {
        this.a = i10;
        this.b = e40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        lh.e1 e1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var = this.b;
                e40Var.w = floatValue;
                e40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = this.b;
                e40Var2.B = floatValue2;
                e40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                e40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.B));
                org.telegram.ui.hk hkVar = e40Var2.f;
                if (hkVar != null && (aoVar = hkVar.a) != null && (e1Var = aoVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                    e40Var2.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                }
                e40Var2.h.setAlpha(e40Var2.B);
                break;
        }
    }
}
