package dg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ v0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final c1 c1Var = this.b;
                final int i10 = 1;
                c1Var.f.f(new Runnable() { // from class: dg.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                c1Var2.getClass();
                                c1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = c1Var2.a;
                                if (iVar != null) {
                                    iVar.c();
                                    break;
                                }
                                break;
                            default:
                                c1 c1Var3 = c1Var;
                                c1Var3.getClass();
                                c1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = c1Var3.a;
                                if (iVar2 != null) {
                                    iVar2.c();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final c1 c1Var2 = this.b;
                final int i11 = 0;
                c1Var2.f.f(new Runnable() { // from class: dg.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c1 c1Var22 = c1Var2;
                                c1Var22.getClass();
                                c1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = c1Var22.a;
                                if (iVar != null) {
                                    iVar.c();
                                    break;
                                }
                                break;
                            default:
                                c1 c1Var3 = c1Var2;
                                c1Var3.getClass();
                                c1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = c1Var3.a;
                                if (iVar2 != null) {
                                    iVar2.c();
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
