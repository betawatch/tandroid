package ig;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ j0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final q0 q0Var = this.b;
                final int i10 = 1;
                q0Var.f.f(new Runnable() { // from class: ig.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar = q0Var2.a;
                                if (lVar != null) {
                                    lVar.u();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar2 = q0Var3.a;
                                if (lVar2 != null) {
                                    lVar2.u();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final q0 q0Var2 = this.b;
                final int i11 = 0;
                q0Var2.f.f(new Runnable() { // from class: ig.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar = q0Var22.a;
                                if (lVar != null) {
                                    lVar.u();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar2 = q0Var3.a;
                                if (lVar2 != null) {
                                    lVar2.u();
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
