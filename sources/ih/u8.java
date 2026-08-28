package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ u8(m9 m9Var, int i9) {
        this.a = i9;
        this.b = m9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var = this.b;
                m9Var.Q = floatValue;
                m9Var.o();
                a9 a9Var = m9Var.s;
                if (a9Var != null) {
                    a9Var.invalidate();
                }
                f1 f1Var = m9Var.w0;
                if (f1Var != null) {
                    f1Var.v((1.0f - m9Var.R) * m9Var.Q);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var2 = this.b;
                m9Var2.Q = floatValue2;
                b9 b9Var = m9Var2.v;
                if (b9Var != null && floatValue2 > 0.6f && v.c && b9Var.a) {
                    b9Var.a(false);
                }
                f1 f1Var2 = m9Var2.w0;
                if (f1Var2 != null) {
                    f1Var2.v((1.0f - m9Var2.R) * m9Var2.Q);
                }
                m9Var2.o();
                a9 a9Var2 = m9Var2.s;
                if (a9Var2 != null) {
                    a9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var3 = this.b;
                m9Var3.V = floatValue3;
                m9Var3.Z = Utilities.clamp(m9Var3.V / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                c9 c9Var = m9Var3.j0;
                i4 currentPeerView = c9Var == null ? null : c9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9 m9Var4 = this.b;
                m9Var4.a0 = floatValue4;
                m9Var4.v.invalidate();
                break;
        }
    }
}
