package dg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.u41;
import org.telegram.ui.ui0;
import org.telegram.ui.w41;
import ph.a5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1(int i10, Object obj, boolean z4) {
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
                c1 c1Var = (c1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e = floatValue;
                if (!this.b) {
                    c1Var.c.setAlpha(1.0f - floatValue);
                }
                c1Var.b.invalidate();
                break;
            case 1:
                mg.d0 d0Var = (mg.d0) this.c;
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
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                s1Var.gd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                m9 m9Var = (m9) this.c;
                m9Var.getClass();
                m9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = m9Var.C;
                if (x9Var != null) {
                    x9Var.invalidate();
                }
                t9 t9Var = m9Var.W;
                if (t9Var != null && ((org.telegram.ui.Cells.s1) t9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.s1) m9Var.W).setSelectedBackgroundProgress(1.0f - m9Var.U);
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
                y50 y50Var = (y50) this.c;
                y50Var.r0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (y50Var.getMeasuredHeight() / 2.0f);
                y50Var.s();
                break;
            case 8:
                wa0 wa0Var = (wa0) this.c;
                wa0Var.getClass();
                wa0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wa0Var.invalidate();
                if (this.b) {
                    wa0Var.requestLayout();
                    break;
                }
                break;
            case 9:
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
            case 10:
                ui0 ui0Var = (ui0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0Var.B = floatValue4;
                ui0Var.E.setAlpha(floatValue4);
                ui0Var.H.setAlpha(ui0Var.B);
                if (!this.b && (viewGroup = ui0Var.W) != null) {
                    viewGroup.setAlpha(ui0Var.B);
                }
                ui0Var.C.invalidate();
                ui0Var.D.invalidate();
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
                    lo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? mr.g : mr.i).getInterpolation(Utilities.clamp(w41Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                a5 a5Var = (a5) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.e = floatValue5;
                if (!this.b) {
                    a5Var.c.setAlpha(1.0f - floatValue5);
                }
                a5Var.b.invalidate();
                break;
        }
    }
}
