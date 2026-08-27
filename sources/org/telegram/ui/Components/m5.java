package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        Object obj = this.f;
        switch (i10) {
            case 0:
                t5 t5Var = (t5) obj;
                t5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, floatValue);
                t5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.i5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                go0 go0Var = chatActivityEnterView.l0;
                if (go0Var != null) {
                    go0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.l0.setTranslationX(z10);
                }
                chatActivityEnterView.M0.setTranslationX(z10);
                chatActivityEnterView.C = z10;
                chatActivityEnterView.I1();
                break;
        }
    }
}
