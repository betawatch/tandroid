package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ x8(r9 r9Var, int i3) {
        this.a = i3;
        this.b = r9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var = this.b;
                r9Var.V = floatValue;
                r9Var.B();
                e9 e9Var = r9Var.s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                g1 g1Var = r9Var.B0;
                if (g1Var != null) {
                    g1Var.v((1.0f - r9Var.W) * r9Var.V);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var2 = this.b;
                r9Var2.V = floatValue2;
                f9 f9Var = r9Var2.w;
                if (f9Var != null && floatValue2 > 0.6f && w.c && f9Var.a) {
                    f9Var.a(false);
                }
                g1 g1Var2 = r9Var2.B0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - r9Var2.W) * r9Var2.V);
                }
                r9Var2.B();
                e9 e9Var2 = r9Var2.s;
                if (e9Var2 != null) {
                    e9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var3 = this.b;
                r9Var3.a0 = floatValue3;
                r9Var3.e0 = Utilities.i(r9Var3.a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                g9 g9Var = r9Var3.o0;
                j4 currentPeerView = g9Var == null ? null : g9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var4 = this.b;
                r9Var4.f0 = floatValue4;
                r9Var4.w.invalidate();
                break;
        }
    }
}
