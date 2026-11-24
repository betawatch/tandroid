// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kec implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wec b;

    public /* synthetic */ kec(wec wecVar, byte b) {
        this.a = b;
        this.b = wecVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wec wecVar = this.b;
        switch (b) {
            case 0:
                wecVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = wecVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (wecVar.E) {
                        wecVar.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        wecVar.F(viewArr[0], (-r0.getMeasuredWidth()) * floatValue);
                    } else {
                        wecVar.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        wecVar.F(viewArr[0], r0.getMeasuredWidth() * floatValue);
                    }
                    wecVar.c = floatValue;
                    wecVar.x(true);
                    mec mecVar = wecVar.N;
                    if (mecVar != null) {
                        mecVar.w.invalidate();
                        wecVar.N.w.h1();
                        wecVar.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                wecVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                wecVar.O.onAnimationUpdate(valueAnimator);
                wecVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wecVar.N.w.h1();
                wecVar.N.invalidate();
                break;
            default:
                wecVar.getClass();
                wecVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
