package jg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.g11;
import org.telegram.ui.i11;
import org.telegram.ui.kh0;
import th.l6;
import vh.z3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        g11 g11Var;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e = floatValue;
                if (!this.b) {
                    p0Var.c.setAlpha(1.0f - floatValue);
                }
                p0Var.b.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.qb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
                l9 l9Var = (l9) this.c;
                l9Var.getClass();
                l9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = l9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = l9Var.W;
                if (r9Var != null && ((org.telegram.ui.Cells.q1) r9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.q1) l9Var.W).setSelectedBackgroundProgress(1.0f - l9Var.U);
                    break;
                }
                break;
            case 3:
                g9 g9Var = (g9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.setScaleX(floatValue2);
                g9Var.setScaleY(floatValue2);
                if (!this.b) {
                    g9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 4:
                o8 o8Var = (o8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.m0(false, floatValue3);
                if (this.b) {
                    h8 h8Var = o8Var.a;
                    h8Var.x = floatValue3;
                    h8Var.invalidate();
                    break;
                }
                break;
            case 5:
                e50 e50Var = (e50) this.c;
                e50Var.D0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (e50Var.getMeasuredHeight() / 2.0f);
                e50Var.w();
                break;
            case 6:
                da0 da0Var = (da0) this.c;
                da0Var.getClass();
                da0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da0Var.invalidate();
                if (this.b) {
                    da0Var.requestLayout();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.b2 b2Var = (org.telegram.ui.Components.voip.b2) this.c;
                TextView[] textViewArr = b2Var.h;
                b2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - b2Var.s);
                    textViewArr[0].setScaleX(1.0f - b2Var.s);
                    textViewArr[0].setScaleY(1.0f - b2Var.s);
                    textViewArr[1].setAlpha(b2Var.s);
                    textViewArr[1].setScaleX(b2Var.s);
                    textViewArr[1].setScaleY(b2Var.s);
                    break;
                }
                break;
            case 8:
                kh0 kh0Var = (kh0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh0Var.D = floatValue4;
                kh0Var.G.setAlpha(floatValue4);
                kh0Var.J.setAlpha(kh0Var.D);
                if (!this.b && (viewGroup = kh0Var.Y) != null) {
                    viewGroup.setAlpha(kh0Var.D);
                }
                kh0Var.E.invalidate();
                kh0Var.F.invalidate();
                break;
            case 9:
                i11 i11Var = (i11) this.c;
                i11Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i11Var.b.invalidate();
                i11Var.c.invalidate();
                if (i11Var.S) {
                    i11Var.N.invalidate();
                }
                i11Var.e();
                TextView textView = i11Var.D;
                if (textView != null) {
                    textView.setAlpha(i11Var.s);
                }
                if (!i11Var.S && (g11Var = i11Var.N) != null && g11Var.getSeekBarWaveform() != null) {
                    qn0 seekBarWaveform = i11Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? gr.g : gr.i).getInterpolation(Utilities.i(i11Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                sg.b0 b0Var = (sg.b0) this.c;
                b0Var.x = null;
                b0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.n.setCustomEmojiEnterProgress(Utilities.i(b0Var.j, 1.0f, 0.0f));
                b0Var.a.invalidate();
                b0Var.m.invalidateOutline();
                if (b0Var.w) {
                    b0Var.j(this.b, b0Var.j);
                    break;
                }
                break;
            case 11:
                l6 l6Var = (l6) this.c;
                l6Var.getClass();
                l6Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                if (this.b) {
                    l6Var.requestLayout();
                    break;
                }
                break;
            default:
                z3 z3Var = (z3) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.e = floatValue5;
                if (!this.b) {
                    z3Var.c.setAlpha(1.0f - floatValue5);
                }
                z3Var.b.invalidate();
                break;
        }
    }
}
