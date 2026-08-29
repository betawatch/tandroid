package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r5(Object obj, float f9, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f9 = this.e;
        float f10 = this.d;
        float f11 = this.c;
        float f12 = this.b;
        Object obj = this.f;
        switch (i10) {
            case 0:
                y5 y5Var = (y5) obj;
                y5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                y5Var.lastDrawnCx = AndroidUtilities.lerp(f10, f9, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.i5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.recaptcha.internal.a.z(f11, f12, floatValue2, f12);
                qo0 qo0Var = chatActivityEnterView.l0;
                if (qo0Var != null) {
                    qo0Var.setAlpha(((f9 - f10) * floatValue2) + f10);
                    chatActivityEnterView.l0.setTranslationX(z10);
                }
                chatActivityEnterView.M0.setTranslationX(z10);
                chatActivityEnterView.C = z10;
                chatActivityEnterView.J1();
                break;
        }
    }
}
