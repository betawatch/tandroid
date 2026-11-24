// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kgc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wgc b;

    public /* synthetic */ kgc(wgc wgcVar, byte b) {
        this.a = b;
        this.b = wgcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wgc wgcVar = this.b;
        switch (b) {
            case 0:
                wgcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = wgcVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (wgcVar.E) {
                        wgcVar.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        wgcVar.F(viewArr[0], (-r0.getMeasuredWidth()) * floatValue);
                    } else {
                        wgcVar.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        wgcVar.F(viewArr[0], r0.getMeasuredWidth() * floatValue);
                    }
                    wgcVar.c = floatValue;
                    wgcVar.x(true);
                    mgc mgcVar = wgcVar.N;
                    if (mgcVar != null) {
                        mgcVar.w.invalidate();
                        wgcVar.N.w.h1();
                        wgcVar.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                wgcVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                wgcVar.O.onAnimationUpdate(valueAnimator);
                wgcVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wgcVar.N.w.h1();
                wgcVar.N.invalidate();
                break;
            default:
                wgcVar.getClass();
                wgcVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
