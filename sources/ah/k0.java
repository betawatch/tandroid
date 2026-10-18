package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.v8;
import ei.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x8;
import org.telegram.ui.oi0;
import org.telegram.ui.x31;
import org.telegram.ui.z31;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        x31 x31Var;
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
                v8 v8Var = (v8) this.c;
                v8Var.getClass();
                v8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                if (this.b) {
                    v8Var.requestLayout();
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
                u1 u1Var = (u1) this.c;
                u1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                o9 o9Var = (o9) this.c;
                o9Var.getClass();
                o9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = o9Var.C;
                if (z9Var != null) {
                    z9Var.invalidate();
                }
                v9 v9Var = o9Var.W;
                if (v9Var != null && ((u1) v9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((u1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    break;
                }
                break;
            case 5:
                w9 w9Var = (w9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue2);
                w9Var.setScaleY(floatValue2);
                if (!this.b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
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
                m60 m60Var = (m60) this.c;
                m60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (m60Var.getMeasuredHeight() / 2.0f);
                m60Var.w();
                break;
            case 8:
                ob0 ob0Var = (ob0) this.c;
                ob0Var.getClass();
                ob0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ob0Var.invalidate();
                if (this.b) {
                    ob0Var.requestLayout();
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
                oi0 oi0Var = (oi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oi0Var.E = floatValue4;
                oi0Var.H.setAlpha(floatValue4);
                oi0Var.K.setAlpha(oi0Var.E);
                if (!this.b && (viewGroup = oi0Var.Z) != null) {
                    viewGroup.setAlpha(oi0Var.E);
                }
                oi0Var.F.invalidate();
                oi0Var.G.invalidate();
                break;
            case 11:
                z31 z31Var = (z31) this.c;
                z31Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z31Var.b.invalidate();
                z31Var.c.invalidate();
                if (z31Var.S) {
                    z31Var.N.invalidate();
                }
                z31Var.e();
                TextView textView = z31Var.y;
                if (textView != null) {
                    textView.setAlpha(z31Var.s);
                }
                if (!z31Var.S && (x31Var = z31Var.N) != null && x31Var.getSeekBarWaveform() != null) {
                    fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? bs.g : bs.i).getInterpolation(Utilities.clamp(z31Var.s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
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
