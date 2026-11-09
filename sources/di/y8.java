package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ y8(q9 q9Var, int i7) {
        this.a = i7;
        this.b = q9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var = this.b;
                q9Var.U = floatValue;
                q9Var.q();
                e9 e9Var = q9Var.s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                g1 g1Var = q9Var.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - q9Var.V) * q9Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var2 = this.b;
                q9Var2.U = floatValue2;
                f9 f9Var = q9Var2.w;
                if (f9Var != null && floatValue2 > 0.6f && v.c && f9Var.a) {
                    f9Var.a(false);
                }
                g1 g1Var2 = q9Var2.A0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - q9Var2.V) * q9Var2.U);
                }
                q9Var2.q();
                e9 e9Var2 = q9Var2.s;
                if (e9Var2 != null) {
                    e9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var3 = this.b;
                q9Var3.Z = floatValue3;
                q9Var3.d0 = Utilities.i(q9Var3.Z / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                g9 g9Var = q9Var3.n0;
                j4 currentPeerView = g9Var == null ? null : g9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9 q9Var4 = this.b;
                q9Var4.e0 = floatValue4;
                q9Var4.w.invalidate();
                break;
        }
    }
}
