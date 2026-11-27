// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vic b;

    public /* synthetic */ jic(vic vicVar, byte b) {
        this.a = b;
        this.b = vicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        vic vicVar = this.b;
        switch (b) {
            case 0:
                vicVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = vicVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (vicVar.E) {
                        vicVar.G(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        vicVar.G(viewArr[0], (-r0.getMeasuredWidth()) * floatValue);
                    } else {
                        vicVar.G(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        vicVar.G(viewArr[0], r0.getMeasuredWidth() * floatValue);
                    }
                    vicVar.c = floatValue;
                    vicVar.y(true);
                    lic licVar = vicVar.N;
                    if (licVar != null) {
                        licVar.w.invalidate();
                        vicVar.N.w.i1();
                        vicVar.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                vicVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                vicVar.O.onAnimationUpdate(valueAnimator);
                vicVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vicVar.N.w.i1();
                vicVar.N.invalidate();
                break;
            default:
                vicVar.getClass();
                vicVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
