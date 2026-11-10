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
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.wq;
import org.telegram.ui.eg0;
import org.telegram.ui.tz0;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        tz0 tz0Var;
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
                k9 k9Var = (k9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue2);
                k9Var.setScaleY(floatValue2);
                if (!this.b) {
                    k9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                s8 s8Var = (s8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.n0(false, floatValue3);
                if (this.b) {
                    org.telegram.ui.Components.l8 l8Var2 = s8Var.a;
                    l8Var2.x = floatValue3;
                    l8Var2.invalidate();
                    break;
                }
                break;
            case 7:
                o40 o40Var = (o40) this.c;
                o40Var.D0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (o40Var.getMeasuredHeight() / 2.0f);
                o40Var.x();
                break;
            case 8:
                l90 l90Var = (l90) this.c;
                l90Var.getClass();
                l90Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l90Var.invalidate();
                if (this.b) {
                    l90Var.requestLayout();
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
                eg0 eg0Var = (eg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.D = floatValue4;
                eg0Var.G.setAlpha(floatValue4);
                eg0Var.J.setAlpha(eg0Var.D);
                if (!this.b && (viewGroup = eg0Var.Y) != null) {
                    viewGroup.setAlpha(eg0Var.D);
                }
                eg0Var.E.invalidate();
                eg0Var.F.invalidate();
                break;
            case 11:
                vz0 vz0Var = (vz0) this.c;
                vz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vz0Var.b.invalidate();
                vz0Var.c.invalidate();
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                }
                vz0Var.e();
                TextView textView = vz0Var.D;
                if (textView != null) {
                    textView.setAlpha(vz0Var.s);
                }
                if (!vz0Var.S && (tz0Var = vz0Var.N) != null && tz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? wq.g : wq.i).getInterpolation(Utilities.i(vz0Var.s * 1.25f, 1.0f, 0.0f));
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
