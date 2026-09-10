package og;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final v0 v0Var = this.b;
                final int i10 = 1;
                v0Var.f.f(new Runnable() { // from class: og.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v0 v0Var2 = v0Var;
                                v0Var2.getClass();
                                v0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar = v0Var2.a;
                                if (hVar != null) {
                                    hVar.n();
                                    break;
                                }
                                break;
                            default:
                                v0 v0Var3 = v0Var;
                                v0Var3.getClass();
                                v0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar2 = v0Var3.a;
                                if (hVar2 != null) {
                                    hVar2.n();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final v0 v0Var2 = this.b;
                final int i11 = 0;
                v0Var2.f.f(new Runnable() { // from class: og.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                v0 v0Var22 = v0Var2;
                                v0Var22.getClass();
                                v0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar = v0Var22.a;
                                if (hVar != null) {
                                    hVar.n();
                                    break;
                                }
                                break;
                            default:
                                v0 v0Var3 = v0Var2;
                                v0Var3.getClass();
                                v0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar2 = v0Var3.a;
                                if (hVar2 != null) {
                                    hVar2.n();
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
