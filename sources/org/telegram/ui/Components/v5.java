package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.c;
        float f12 = this.b;
        Object obj = this.f;
        switch (i10) {
            case 0:
                c6 c6Var = (c6) obj;
                c6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.lastDrawnCy = AndroidUtilities.lerp(f12, f11, floatValue);
                c6Var.lastDrawnCx = AndroidUtilities.lerp(f10, f7, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.r5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = c3.h0.z(f11, f12, floatValue2, f12);
                dq0 dq0Var = chatActivityEnterView.p0;
                if (dq0Var != null) {
                    dq0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.G1();
                break;
        }
    }
}
