// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fi3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ cj3 d;

    public fi3(cj3 cj3Var, float f, boolean z, float f2) {
        this.d = cj3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) gl.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        cj3 cj3Var = this.d;
        cj3Var.f0[0].a.scrollBy(0, i);
        View view = cj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
