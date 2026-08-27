package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ o30(q30 q30Var, int i10) {
        this.a = i10;
        this.b = q30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.sn snVar;
        hh.f1 f1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var = this.b;
                q30Var.w = floatValue;
                q30Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                q30Var.e.setPadding(0, 0, 0, (int) (q30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var2 = this.b;
                q30Var2.A = floatValue2;
                q30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                q30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, q30Var2.A));
                org.telegram.ui.yj yjVar = q30Var2.f;
                if (yjVar != null && (snVar = yjVar.a) != null && (f1Var = snVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                    q30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                }
                q30Var2.h.setAlpha(q30Var2.A);
                break;
        }
    }
}
