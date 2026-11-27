// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ix7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;

    public /* synthetic */ ix7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                nx7Var.f.f(new Runnable() { // from class: hx7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        nx7 nx7Var2 = nx7Var;
                        switch (b3) {
                            case 0:
                                nx7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var = nx7Var2.a;
                                if (xh4Var != null) {
                                    xh4Var.v();
                                    break;
                                }
                                break;
                            default:
                                nx7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var2 = nx7Var2.a;
                                if (xh4Var2 != null) {
                                    xh4Var2.v();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                nx7Var.f.f(new Runnable() { // from class: hx7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        nx7 nx7Var2 = nx7Var;
                        switch (b32) {
                            case 0:
                                nx7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var = nx7Var2.a;
                                if (xh4Var != null) {
                                    xh4Var.v();
                                    break;
                                }
                                break;
                            default:
                                nx7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var2 = nx7Var2.a;
                                if (xh4Var2 != null) {
                                    xh4Var2.v();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
