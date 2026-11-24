// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bu7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;

    public /* synthetic */ bu7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gu7Var.f.f(new Runnable() { // from class: au7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        gu7 gu7Var2 = gu7Var;
                        switch (b3) {
                            case 0:
                                gu7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var = gu7Var2.a;
                                if (u39Var != null) {
                                    u39Var.i0();
                                    break;
                                }
                                break;
                            default:
                                gu7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var2 = gu7Var2.a;
                                if (u39Var2 != null) {
                                    u39Var2.i0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gu7Var.f.f(new Runnable() { // from class: au7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        gu7 gu7Var2 = gu7Var;
                        switch (b32) {
                            case 0:
                                gu7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var = gu7Var2.a;
                                if (u39Var != null) {
                                    u39Var.i0();
                                    break;
                                }
                                break;
                            default:
                                gu7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var2 = gu7Var2.a;
                                if (u39Var2 != null) {
                                    u39Var2.i0();
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
