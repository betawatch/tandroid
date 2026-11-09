package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.l8;
import fi.l5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.dg0;
import org.telegram.ui.sz0;
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        sz0 sz0Var;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
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
            case 1:
                l8 l8Var = (l8) this.c;
                l8Var.getClass();
                l8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                if (this.b) {
                    l8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                l5 l5Var = (l5) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.e = floatValue;
                if (!this.b) {
                    l5Var.c.setAlpha(1.0f - floatValue);
                }
                l5Var.b.invalidate();
                break;
            case 3:
                q1 q1Var = (q1) this.c;
                q1Var.rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                j9 j9Var = (j9) this.c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    break;
                }
                break;
            case 5:
                l9 l9Var = (l9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.setScaleX(floatValue2);
                l9Var.setScaleY(floatValue2);
                if (!this.b) {
                    l9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                t8 t8Var = (t8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.n0(false, floatValue3);
                if (this.b) {
                    m8 m8Var = t8Var.a;
                    m8Var.x = floatValue3;
                    m8Var.invalidate();
                    break;
                }
                break;
            case 7:
                p40 p40Var = (p40) this.c;
                p40Var.D0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (p40Var.getMeasuredHeight() / 2.0f);
                p40Var.x();
                break;
            case 8:
                m90 m90Var = (m90) this.c;
                m90Var.getClass();
                m90Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m90Var.invalidate();
                if (this.b) {
                    m90Var.requestLayout();
                    break;
                }
                break;
            case 9:
                n2 n2Var = (n2) this.c;
                TextView[] textViewArr = n2Var.h;
                n2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - n2Var.s);
                    textViewArr[0].setScaleX(1.0f - n2Var.s);
                    textViewArr[0].setScaleY(1.0f - n2Var.s);
                    textViewArr[1].setAlpha(n2Var.s);
                    textViewArr[1].setScaleX(n2Var.s);
                    textViewArr[1].setScaleY(n2Var.s);
                    break;
                }
                break;
            case 10:
                dg0 dg0Var = (dg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.D = floatValue4;
                dg0Var.G.setAlpha(floatValue4);
                dg0Var.J.setAlpha(dg0Var.D);
                if (!this.b && (viewGroup = dg0Var.Y) != null) {
                    viewGroup.setAlpha(dg0Var.D);
                }
                dg0Var.E.invalidate();
                dg0Var.F.invalidate();
                break;
            case 11:
                uz0 uz0Var = (uz0) this.c;
                uz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var.b.invalidate();
                uz0Var.c.invalidate();
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                }
                uz0Var.e();
                TextView textView = uz0Var.D;
                if (textView != null) {
                    textView.setAlpha(uz0Var.s);
                }
                if (!uz0Var.S && (sz0Var = uz0Var.N) != null && sz0Var.getSeekBarWaveform() != null) {
                    qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? xq.g : xq.i).getInterpolation(Utilities.i(uz0Var.s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                tg.f0 f0Var = (tg.f0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.e = floatValue5;
                if (!this.b) {
                    f0Var.c.setAlpha(1.0f - floatValue5);
                }
                f0Var.b.invalidate();
                break;
        }
    }
}
