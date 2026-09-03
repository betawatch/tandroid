package cg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ w0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final d1 d1Var = this.b;
                final int i10 = 1;
                d1Var.f.f(new Runnable() { // from class: cg.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                d1 d1Var2 = d1Var;
                                d1Var2.getClass();
                                d1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = d1Var2.a;
                                if (iVar != null) {
                                    iVar.q();
                                    break;
                                }
                                break;
                            default:
                                d1 d1Var3 = d1Var;
                                d1Var3.getClass();
                                d1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = d1Var3.a;
                                if (iVar2 != null) {
                                    iVar2.q();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final d1 d1Var2 = this.b;
                final int i11 = 0;
                d1Var2.f.f(new Runnable() { // from class: cg.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d1 d1Var22 = d1Var2;
                                d1Var22.getClass();
                                d1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = d1Var22.a;
                                if (iVar != null) {
                                    iVar.q();
                                    break;
                                }
                                break;
                            default:
                                d1 d1Var3 = d1Var2;
                                d1Var3.getClass();
                                d1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = d1Var3.a;
                                if (iVar2 != null) {
                                    iVar2.q();
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
