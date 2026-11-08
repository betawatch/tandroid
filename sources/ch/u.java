package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.k8;
import fi.l5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.bg0;
import org.telegram.ui.pz0;
import org.telegram.ui.rz0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        pz0 pz0Var;
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
                k8 k8Var = (k8) this.c;
                k8Var.getClass();
                k8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                if (this.b) {
                    k8Var.requestLayout();
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
                bg0 bg0Var = (bg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.D = floatValue4;
                bg0Var.G.setAlpha(floatValue4);
                bg0Var.J.setAlpha(bg0Var.D);
                if (!this.b && (viewGroup = bg0Var.Y) != null) {
                    viewGroup.setAlpha(bg0Var.D);
                }
                bg0Var.E.invalidate();
                bg0Var.F.invalidate();
                break;
            case 11:
                rz0 rz0Var = (rz0) this.c;
                rz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz0Var.b.invalidate();
                rz0Var.c.invalidate();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                }
                rz0Var.e();
                TextView textView = rz0Var.D;
                if (textView != null) {
                    textView.setAlpha(rz0Var.s);
                }
                if (!rz0Var.S && (pz0Var = rz0Var.N) != null && pz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? xq.g : xq.i).getInterpolation(Utilities.i(rz0Var.s * 1.25f, 1.0f, 0.0f));
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
