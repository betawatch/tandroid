package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ n8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var = this.b;
                f9Var.V = floatValue;
                f9Var.q();
                t8 t8Var = f9Var.s;
                if (t8Var != null) {
                    t8Var.invalidate();
                }
                c1 c1Var = f9Var.B0;
                if (c1Var != null) {
                    c1Var.v((1.0f - f9Var.W) * f9Var.V);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var2 = this.b;
                f9Var2.V = floatValue2;
                u8 u8Var = f9Var2.w;
                if (u8Var != null && floatValue2 > 0.6f && v.c && u8Var.a) {
                    u8Var.a(false);
                }
                c1 c1Var2 = f9Var2.B0;
                if (c1Var2 != null) {
                    c1Var2.v((1.0f - f9Var2.W) * f9Var2.V);
                }
                f9Var2.q();
                t8 t8Var2 = f9Var2.s;
                if (t8Var2 != null) {
                    t8Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var3 = this.b;
                f9Var3.a0 = floatValue3;
                f9Var3.e0 = Utilities.i(f9Var3.a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                v8 v8Var = f9Var3.o0;
                z3 currentPeerView = v8Var == null ? null : v8Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9 f9Var4 = this.b;
                f9Var4.f0 = floatValue4;
                f9Var4.w.invalidate();
                break;
        }
    }
}
