package kh;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4(zr0 zr0Var, int i9, wk0 wk0Var) {
        this.a = 1;
        this.c = zr0Var;
        this.b = i9;
        this.d = wk0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.w1.a = i0.a.d(floatValue, num.intValue(), this.b);
                c6 c6Var = g6Var.P0;
                if (c6Var != null) {
                    c6Var.invalidate();
                    break;
                }
                break;
            case 1:
                zr0 zr0Var = (zr0) this.c;
                wk0 wk0Var = (wk0) this.d;
                zr0Var.e.K1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                wk0Var.invalidate();
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.G1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                yf.j0 j0Var = l0Var.Y0;
                if (j0Var != null) {
                    j0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p4(yu0 yu0Var, Integer num, int i9, int i10) {
        this.a = i10;
        this.c = yu0Var;
        this.d = num;
        this.b = i9;
    }
}
