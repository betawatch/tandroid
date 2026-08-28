package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m5(Object obj, float f10, float f11, float f12, float f13, int i9) {
        this.a = i9;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        Object obj = this.f;
        switch (i9) {
            case 0:
                t5 t5Var = (t5) obj;
                t5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, floatValue);
                t5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.i5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = e2.c.z(f12, f13, floatValue2, f13);
                fo0 fo0Var = chatActivityEnterView.l0;
                if (fo0Var != null) {
                    fo0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.l0.setTranslationX(z10);
                }
                chatActivityEnterView.M0.setTranslationX(z10);
                chatActivityEnterView.C = z10;
                chatActivityEnterView.J1();
                break;
        }
    }
}
