package bh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.t8;
import fi.b6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.voip.w2;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.pi0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(int i10, Object obj, boolean z10) {
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
                i0 i0Var = (i0) this.c;
                i0Var.x = null;
                i0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.k();
                i0Var.l();
                i0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(i0Var.j, 1.0f, 0.0f));
                i0Var.a.invalidate();
                i0Var.m.invalidateOutline();
                if (i0Var.w) {
                    i0Var.j(i0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                t8 t8Var = (t8) this.c;
                t8Var.getClass();
                t8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.invalidate();
                if (this.b) {
                    t8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                b6 b6Var = (b6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e = floatValue;
                if (!this.b) {
                    b6Var.c.setAlpha(1.0f - floatValue);
                }
                b6Var.b.invalidate();
                break;
            case 3:
                s1 s1Var = (s1) this.c;
                s1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                t9 t9Var = (t9) this.c;
                t9Var.getClass();
                t9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ea eaVar = t9Var.C;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                aa aaVar = t9Var.W;
                if (aaVar != null && ((s1) aaVar).getCurrentMessagesGroup() == null && this.b) {
                    ((s1) t9Var.W).setSelectedBackgroundProgress(1.0f - t9Var.U);
                    break;
                }
                break;
            case 5:
                y9 y9Var = (y9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue2);
                y9Var.setScaleY(floatValue2);
                if (!this.b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                g9 g9Var = (g9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.j0(floatValue3, false);
                if (this.b) {
                    z8 z8Var = g9Var.a;
                    z8Var.w = floatValue3;
                    z8Var.invalidate();
                    break;
                }
                break;
            case 7:
                p60 p60Var = (p60) this.c;
                p60Var.D0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (p60Var.getMeasuredHeight() / 2.0f);
                p60Var.x();
                break;
            case 8:
                nb0 nb0Var = (nb0) this.c;
                nb0Var.getClass();
                nb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nb0Var.invalidate();
                if (this.b) {
                    nb0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                w2 w2Var = (w2) this.c;
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
                pi0 pi0Var = (pi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0Var.y = floatValue4;
                pi0Var.G.setAlpha(floatValue4);
                pi0Var.J.setAlpha(pi0Var.y);
                if (!this.b && (viewGroup = pi0Var.Y) != null) {
                    viewGroup.setAlpha(pi0Var.y);
                }
                pi0Var.E.invalidate();
                pi0Var.F.invalidate();
                break;
            case 11:
                f41 f41Var = (f41) this.c;
                f41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.b.invalidate();
                f41Var.c.invalidate();
                if (f41Var.S) {
                    f41Var.N.invalidate();
                }
                f41Var.e();
                TextView textView = f41Var.y;
                if (textView != null) {
                    textView.setAlpha(f41Var.s);
                }
                if (!f41Var.S && (d41Var = f41Var.N) != null && d41Var.getSeekBarWaveform() != null) {
                    qp0 seekBarWaveform = f41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? ds.g : ds.i).getInterpolation(Utilities.clamp(f41Var.s * 1.25f, 1.0f, 0.0f));
                    s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                sg.l0 l0Var = (sg.l0) this.c;
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
