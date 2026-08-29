package ag;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final f1 f1Var = this.b;
                final int i10 = 1;
                f1Var.f.f(new Runnable() { // from class: ag.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                f1 f1Var2 = f1Var;
                                f1Var2.getClass();
                                f1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var = f1Var2.a;
                                if (o1Var != null) {
                                    o1Var.c();
                                    break;
                                }
                                break;
                            default:
                                f1 f1Var3 = f1Var;
                                f1Var3.getClass();
                                f1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var2 = f1Var3.a;
                                if (o1Var2 != null) {
                                    o1Var2.c();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final f1 f1Var2 = this.b;
                final int i11 = 0;
                f1Var2.f.f(new Runnable() { // from class: ag.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f1 f1Var22 = f1Var2;
                                f1Var22.getClass();
                                f1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var = f1Var22.a;
                                if (o1Var != null) {
                                    o1Var.c();
                                    break;
                                }
                                break;
                            default:
                                f1 f1Var3 = f1Var2;
                                f1Var3.getClass();
                                f1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var2 = f1Var3.a;
                                if (o1Var2 != null) {
                                    o1Var2.c();
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
