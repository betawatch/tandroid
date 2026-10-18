package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ h9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = this.b;
                z9Var.U = floatValue;
                z9Var.o();
                n9 n9Var = z9Var.s;
                if (n9Var != null) {
                    n9Var.invalidate();
                }
                h1 h1Var = z9Var.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - z9Var.V) * z9Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var2 = this.b;
                z9Var2.U = floatValue2;
                o9 o9Var = z9Var2.v;
                if (o9Var != null && floatValue2 > 0.6f && w.c && o9Var.a) {
                    o9Var.a(false);
                }
                h1 h1Var2 = z9Var2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - z9Var2.V) * z9Var2.U);
                }
                z9Var2.o();
                n9 n9Var2 = z9Var2.s;
                if (n9Var2 != null) {
                    n9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var3 = this.b;
                z9Var3.Z = floatValue3;
                z9Var3.d0 = Utilities.clamp(z9Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                p9 p9Var = z9Var3.n0;
                p4 currentPeerView = p9Var == null ? null : p9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var4 = this.b;
                z9Var4.e0 = floatValue4;
                z9Var4.v.invalidate();
                break;
        }
    }
}
