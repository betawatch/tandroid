package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ hh(yi yiVar, int i10) {
        this.a = i10;
        this.b = yiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.f2();
                break;
            case 1:
                this.b.G0.invalidate();
                break;
            case 2:
                yi.o(this.b, valueAnimator);
                break;
            case 3:
                yi yiVar = this.b;
                yiVar.getClass();
                yiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                yi yiVar2 = this.b;
                qi qiVar = yiVar2.B0;
                gl glVar = yiVar2.w0;
                if (qiVar == glVar && glVar != null) {
                    glVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.f2();
                break;
        }
    }
}
