package bg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lh.d8;
import nh.r5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.ki0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        d41 d41Var;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.e = floatValue;
                if (!this.b) {
                    e1Var.c.setAlpha(1.0f - floatValue);
                }
                e1Var.b.invalidate();
                break;
            case 1:
                kg.d0 d0Var = (kg.d0) this.c;
                d0Var.x = null;
                d0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.j, 1.0f, 0.0f));
                d0Var.a.invalidate();
                d0Var.m.invalidateOutline();
                if (d0Var.w) {
                    d0Var.j(d0Var.j, this.b);
                    break;
                }
                break;
            case 2:
                d8 d8Var = (d8) this.c;
                d8Var.getClass();
                d8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.b) {
                    d8Var.requestLayout();
                    break;
                }
                break;
            case 3:
                r5 r5Var = (r5) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.e = floatValue2;
                if (!this.b) {
                    r5Var.c.setAlpha(1.0f - floatValue2);
                }
                r5Var.b.invalidate();
                break;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                s1Var.fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 5:
                l9 l9Var = (l9) this.c;
                l9Var.getClass();
                l9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = l9Var.C;
                if (w9Var != null) {
                    w9Var.invalidate();
                }
                s9 s9Var = l9Var.W;
                if (s9Var != null && ((org.telegram.ui.Cells.s1) s9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.s1) l9Var.W).setSelectedBackgroundProgress(1.0f - l9Var.U);
                    break;
                }
                break;
            case 6:
                t9 t9Var = (t9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9Var.setScaleX(floatValue3);
                t9Var.setScaleY(floatValue3);
                if (!this.b) {
                    t9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 7:
                b9 b9Var = (b9) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b9Var.i0(floatValue4, false);
                if (this.b) {
                    u8 u8Var = b9Var.a;
                    u8Var.w = floatValue4;
                    u8Var.invalidate();
                    break;
                }
                break;
            case 8:
                s50 s50Var = (s50) this.c;
                s50Var.q0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (s50Var.getMeasuredHeight() / 2.0f);
                s50Var.s();
                break;
            case 9:
                qa0 qa0Var = (qa0) this.c;
                qa0Var.getClass();
                qa0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa0Var.invalidate();
                if (this.b) {
                    qa0Var.requestLayout();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.c;
                TextView[] textViewArr = x2Var.h;
                x2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - x2Var.s);
                    textViewArr[0].setScaleX(1.0f - x2Var.s);
                    textViewArr[0].setScaleY(1.0f - x2Var.s);
                    textViewArr[1].setAlpha(x2Var.s);
                    textViewArr[1].setScaleX(x2Var.s);
                    textViewArr[1].setScaleY(x2Var.s);
                    break;
                }
                break;
            case 11:
                ki0 ki0Var = (ki0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki0Var.A = floatValue5;
                ki0Var.D.setAlpha(floatValue5);
                ki0Var.G.setAlpha(ki0Var.A);
                if (!this.b && (viewGroup = ki0Var.V) != null) {
                    viewGroup.setAlpha(ki0Var.A);
                }
                ki0Var.B.invalidate();
                ki0Var.C.invalidate();
                break;
            default:
                f41 f41Var = (f41) this.c;
                f41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.b.invalidate();
                f41Var.c.invalidate();
                if (f41Var.O) {
                    f41Var.J.invalidate();
                }
                f41Var.e();
                TextView textView = f41Var.y;
                if (textView != null) {
                    textView.setAlpha(f41Var.s);
                }
                if (!f41Var.O && (d41Var = f41Var.J) != null && d41Var.getSeekBarWaveform() != null) {
                    co0 seekBarWaveform = f41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? jr.g : jr.i).getInterpolation(Utilities.clamp(f41Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
