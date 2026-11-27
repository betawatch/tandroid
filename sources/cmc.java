// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cmc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj2;
                View view2 = (View) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                view.setTranslationY(hl.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-hl.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                break;
            case 1:
                wmc wmcVar = (wmc) obj2;
                kjc kjcVar = (kjc) obj;
                kjcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kjcVar.c();
                int i = kjcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && wmcVar.S) {
                    wmcVar.R.pause();
                    AnimatorSet animatorSet = wmcVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        break;
                    }
                }
                break;
            case 2:
                ((ync) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((m12) obj).invalidate();
                break;
            default:
                foc focVar = (foc) obj2;
                focVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (focVar.c - r0)) + focVar.e);
                focVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (focVar.d - r0)) + focVar.f);
                ((tmc) obj).invalidate();
                break;
        }
    }
}
