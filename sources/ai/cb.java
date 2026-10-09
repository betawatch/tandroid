package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.dj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cb(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        i51 i51Var;
        switch (this.a) {
            case 0:
                eb ebVar = (eb) this.c;
                ebVar.getClass();
                ebVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ebVar.invalidate();
                if (this.b) {
                    ebVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ci.n6 n6Var = (ci.n6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.e = floatValue;
                if (!this.b) {
                    n6Var.c.setAlpha(1.0f - floatValue);
                }
                n6Var.b.invalidate();
                break;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                u1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.p9 p9Var = (org.telegram.ui.Cells.p9) this.c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                org.telegram.ui.Cells.w9 w9Var = p9Var.W;
                if (w9Var != null && ((org.telegram.ui.Cells.u1) w9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.u1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue2);
                y9Var.setScaleY(floatValue2);
                if (!this.b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.i0(floatValue3, false);
                if (this.b) {
                    org.telegram.ui.Components.z8 z8Var = g9Var.a;
                    z8Var.w = floatValue3;
                    z8Var.invalidate();
                    break;
                }
                break;
            case 6:
                t60 t60Var = (t60) this.c;
                t60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (t60Var.getMeasuredHeight() / 2.0f);
                t60Var.w();
                break;
            case 7:
                vb0 vb0Var = (vb0) this.c;
                vb0Var.getClass();
                vb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vb0Var.invalidate();
                if (this.b) {
                    vb0Var.requestLayout();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.c;
                TextView[] textViewArr = v2Var.h;
                v2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.s);
                    textViewArr[0].setScaleX(1.0f - v2Var.s);
                    textViewArr[0].setScaleY(1.0f - v2Var.s);
                    textViewArr[1].setAlpha(v2Var.s);
                    textViewArr[1].setScaleX(v2Var.s);
                    textViewArr[1].setScaleY(v2Var.s);
                    break;
                }
                break;
            case 9:
                dj0 dj0Var = (dj0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj0Var.E = floatValue4;
                dj0Var.H.setAlpha(floatValue4);
                dj0Var.K.setAlpha(dj0Var.E);
                if (!this.b && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                break;
            case 10:
                k51 k51Var = (k51) this.c;
                k51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.b.invalidate();
                k51Var.c.invalidate();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                k51Var.e();
                TextView textView = k51Var.y;
                if (textView != null) {
                    textView.setAlpha(k51Var.s);
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    np0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? hs.g : hs.i).getInterpolation(Utilities.clamp(k51Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                qg.l0 l0Var = (qg.l0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue5;
                if (!this.b) {
                    l0Var.c.setAlpha(1.0f - floatValue5);
                }
                l0Var.b.invalidate();
                break;
            default:
                zg.a0 a0Var = (zg.a0) this.c;
                a0Var.x = null;
                a0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.j, 1.0f, 0.0f));
                a0Var.a.invalidate();
                a0Var.m.invalidateOutline();
                if (a0Var.w) {
                    a0Var.j(a0Var.j, this.b);
                    break;
                }
                break;
        }
    }
}
