// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ai2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei2 ei2Var = (ei2) obj2;
                ci2 ci2Var = (ci2) obj;
                ei2.b(floatValue, ci2Var);
                ei2Var.a(floatValue, ci2Var, false);
                ei2Var.invalidateSelf();
                break;
            case 1:
                u3b u3bVar = (u3b) obj2;
                u3bVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3bVar.invalidate();
                ((xu9) obj).invalidate();
                break;
            default:
                ((vic) obj2).G((View) obj, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
