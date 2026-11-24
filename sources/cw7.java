// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cw7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw7 b;

    public /* synthetic */ cw7(hw7 hw7Var, byte b) {
        this.a = b;
        this.b = hw7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                hw7Var.f.f(new Runnable() { // from class: bw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        hw7 hw7Var2 = hw7Var;
                        switch (b3) {
                            case 0:
                                hw7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var = hw7Var2.a;
                                if (x59Var != null) {
                                    x59Var.f0();
                                    break;
                                }
                                break;
                            default:
                                hw7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var2 = hw7Var2.a;
                                if (x59Var2 != null) {
                                    x59Var2.f0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                hw7Var.f.f(new Runnable() { // from class: bw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        hw7 hw7Var2 = hw7Var;
                        switch (b32) {
                            case 0:
                                hw7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var = hw7Var2.a;
                                if (x59Var != null) {
                                    x59Var.f0();
                                    break;
                                }
                                break;
                            default:
                                hw7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var2 = hw7Var2.a;
                                if (x59Var2 != null) {
                                    x59Var2.f0();
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
