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
import org.telegram.ui.Components.rn0;
import org.telegram.ui.f11;
import org.telegram.ui.h11;
import org.telegram.ui.ih0;
import th.l6;
import vh.z3;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        f11 f11Var;
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
                o8Var.n0(false, floatValue3);
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
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) this.c;
                TextView[] textViewArr = c2Var.h;
                c2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - c2Var.s);
                    textViewArr[0].setScaleX(1.0f - c2Var.s);
                    textViewArr[0].setScaleY(1.0f - c2Var.s);
                    textViewArr[1].setAlpha(c2Var.s);
                    textViewArr[1].setScaleX(c2Var.s);
                    textViewArr[1].setScaleY(c2Var.s);
                    break;
                }
                break;
            case 8:
                ih0 ih0Var = (ih0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih0Var.D = floatValue4;
                ih0Var.G.setAlpha(floatValue4);
                ih0Var.J.setAlpha(ih0Var.D);
                if (!this.b && (viewGroup = ih0Var.Y) != null) {
                    viewGroup.setAlpha(ih0Var.D);
                }
                ih0Var.E.invalidate();
                ih0Var.F.invalidate();
                break;
            case 9:
                h11 h11Var = (h11) this.c;
                h11Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.b.invalidate();
                h11Var.c.invalidate();
                if (h11Var.S) {
                    h11Var.N.invalidate();
                }
                h11Var.e();
                TextView textView = h11Var.D;
                if (textView != null) {
                    textView.setAlpha(h11Var.s);
                }
                if (!h11Var.S && (f11Var = h11Var.N) != null && f11Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = h11Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? gr.g : gr.i).getInterpolation(Utilities.i(h11Var.s * 1.25f, 1.0f, 0.0f));
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
