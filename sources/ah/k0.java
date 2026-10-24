package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.u8;
import ei.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.x8;
import org.telegram.ui.b41;
import org.telegram.ui.qi0;
import org.telegram.ui.z31;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        z31 z31Var;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                t0Var.x = null;
                t0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.j, 1.0f, 0.0f));
                t0Var.a.invalidate();
                t0Var.m.invalidateOutline();
                if (t0Var.w) {
                    t0Var.j(t0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                u8 u8Var = (u8) this.c;
                u8Var.getClass();
                u8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u8Var.invalidate();
                if (this.b) {
                    u8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                c6 c6Var = (c6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e = floatValue;
                if (!this.b) {
                    c6Var.c.setAlpha(1.0f - floatValue);
                }
                c6Var.b.invalidate();
                break;
            case 3:
                t1 t1Var = (t1) this.c;
                t1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                p9 p9Var = (p9) this.c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                w9 w9Var = p9Var.W;
                if (w9Var != null && ((t1) w9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((t1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var2.setScaleX(floatValue2);
                w9Var2.setScaleY(floatValue2);
                if (!this.b) {
                    w9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                e9 e9Var = (e9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue3, false);
                if (this.b) {
                    x8 x8Var = e9Var.a;
                    x8Var.w = floatValue3;
                    x8Var.invalidate();
                    break;
                }
                break;
            case 7:
                n60 n60Var = (n60) this.c;
                n60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (n60Var.getMeasuredHeight() / 2.0f);
                n60Var.w();
                break;
            case 8:
                pb0 pb0Var = (pb0) this.c;
                pb0Var.getClass();
                pb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb0Var.invalidate();
                if (this.b) {
                    pb0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                t2 t2Var = (t2) this.c;
                TextView[] textViewArr = t2Var.h;
                t2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.s);
                    textViewArr[0].setScaleX(1.0f - t2Var.s);
                    textViewArr[0].setScaleY(1.0f - t2Var.s);
                    textViewArr[1].setAlpha(t2Var.s);
                    textViewArr[1].setScaleX(t2Var.s);
                    textViewArr[1].setScaleY(t2Var.s);
                    break;
                }
                break;
            case 10:
                qi0 qi0Var = (qi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var.y = floatValue4;
                qi0Var.G.setAlpha(floatValue4);
                qi0Var.J.setAlpha(qi0Var.y);
                if (!this.b && (viewGroup = qi0Var.Y) != null) {
                    viewGroup.setAlpha(qi0Var.y);
                }
                qi0Var.E.invalidate();
                qi0Var.F.invalidate();
                break;
            case 11:
                b41 b41Var = (b41) this.c;
                b41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.b.invalidate();
                b41Var.c.invalidate();
                if (b41Var.S) {
                    b41Var.N.invalidate();
                }
                b41Var.e();
                TextView textView = b41Var.y;
                if (textView != null) {
                    textView.setAlpha(b41Var.s);
                }
                if (!b41Var.S && (z31Var = b41Var.N) != null && z31Var.getSeekBarWaveform() != null) {
                    kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? bs.g : bs.i).getInterpolation(Utilities.clamp(b41Var.s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                rg.l0 l0Var = (rg.l0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue5;
                if (!this.b) {
                    l0Var.c.setAlpha(1.0f - floatValue5);
                }
                l0Var.b.invalidate();
                break;
        }
    }
}
