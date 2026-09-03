package eg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import oh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.ti0;
import org.telegram.ui.u41;
import org.telegram.ui.w41;
import qh.y4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        u41 u41Var;
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.e = floatValue;
                if (!this.b) {
                    a1Var.c.setAlpha(1.0f - floatValue);
                }
                a1Var.b.invalidate();
                break;
            case 1:
                ng.d0 d0Var = (ng.d0) this.c;
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.gd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                n9 n9Var = (n9) this.c;
                n9Var.getClass();
                n9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = n9Var.C;
                if (y9Var != null) {
                    y9Var.invalidate();
                }
                u9 u9Var = n9Var.W;
                if (u9Var != null && ((org.telegram.ui.Cells.t1) u9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.t1) n9Var.W).setSelectedBackgroundProgress(1.0f - n9Var.U);
                    break;
                }
                break;
            case 5:
                p9 p9Var = (p9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue2);
                p9Var.setScaleY(floatValue2);
                if (!this.b) {
                    p9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                w8 w8Var = (w8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.i0(floatValue3, false);
                if (this.b) {
                    p8 p8Var = w8Var.a;
                    p8Var.w = floatValue3;
                    p8Var.invalidate();
                    break;
                }
                break;
            case 7:
                z50 z50Var = (z50) this.c;
                z50Var.r0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z50Var.getMeasuredHeight() / 2.0f);
                z50Var.s();
                break;
            case 8:
                xa0 xa0Var = (xa0) this.c;
                xa0Var.getClass();
                xa0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xa0Var.invalidate();
                if (this.b) {
                    xa0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.c;
                TextView[] textViewArr = w2Var.h;
                w2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.s);
                    textViewArr[0].setScaleX(1.0f - w2Var.s);
                    textViewArr[0].setScaleY(1.0f - w2Var.s);
                    textViewArr[1].setAlpha(w2Var.s);
                    textViewArr[1].setScaleX(w2Var.s);
                    textViewArr[1].setScaleY(w2Var.s);
                    break;
                }
                break;
            case 10:
                ti0 ti0Var = (ti0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var.B = floatValue4;
                ti0Var.E.setAlpha(floatValue4);
                ti0Var.H.setAlpha(ti0Var.B);
                if (!this.b && (viewGroup = ti0Var.W) != null) {
                    viewGroup.setAlpha(ti0Var.B);
                }
                ti0Var.C.invalidate();
                ti0Var.D.invalidate();
                break;
            case 11:
                w41 w41Var = (w41) this.c;
                w41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w41Var.b.invalidate();
                w41Var.c.invalidate();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                }
                w41Var.e();
                TextView textView = w41Var.y;
                if (textView != null) {
                    textView.setAlpha(w41Var.s);
                }
                if (!w41Var.P && (u41Var = w41Var.K) != null && u41Var.getSeekBarWaveform() != null) {
                    mo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? pr.g : pr.i).getInterpolation(Utilities.clamp(w41Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                y4 y4Var = (y4) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.e = floatValue5;
                if (!this.b) {
                    y4Var.c.setAlpha(1.0f - floatValue5);
                }
                y4Var.b.invalidate();
                break;
        }
    }
}
