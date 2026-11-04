package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ ae(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm wmVar = this.b;
                wmVar.Z8 = floatValue;
                kl klVar = wmVar.m1;
                if (klVar != null) {
                    klVar.invalidate();
                    wmVar.A0.invalidate();
                    break;
                }
                break;
            case 1:
                wm wmVar2 = this.b;
                wmVar2.getClass();
                wmVar2.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.Pc();
                break;
            case 2:
                wm wmVar3 = this.b;
                wmVar3.getClass();
                wmVar3.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar3.Pc();
                break;
            case 3:
                wm wmVar4 = this.b;
                wmVar4.getClass();
                wmVar4.Ya = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar4.K9();
                break;
            default:
                wm wmVar5 = this.b;
                wmVar5.getClass();
                wmVar5.Ya = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar5.K9();
                break;
        }
    }
}
