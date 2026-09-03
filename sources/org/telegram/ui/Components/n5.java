package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n5(Object obj, float f10, float f11, float f12, float f13, int i10) {
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
                u5 u5Var = (u5) obj;
                u5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5Var.lastDrawnCy = AndroidUtilities.lerp(f13, f12, floatValue);
                u5Var.lastDrawnCx = AndroidUtilities.lerp(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.j5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w10 = e2.c.w(f12, f13, floatValue2, f13);
                zo0 zo0Var = chatActivityEnterView.m0;
                if (zo0Var != null) {
                    zo0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.m0.setTranslationX(w10);
                }
                chatActivityEnterView.N0.setTranslationX(w10);
                chatActivityEnterView.D = w10;
                chatActivityEnterView.J1();
                break;
        }
    }
}
