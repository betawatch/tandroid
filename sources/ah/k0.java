package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.na;
import di.l6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.z9;
import org.telegram.ui.hj0;
import org.telegram.ui.p51;
import org.telegram.ui.r51;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        p51 p51Var;
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
                na naVar = (na) this.c;
                naVar.getClass();
                naVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.invalidate();
                if (this.b) {
                    naVar.requestLayout();
                    break;
                }
                break;
            case 2:
                l6 l6Var = (l6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.e = floatValue;
                if (!this.b) {
                    l6Var.c.setAlpha(1.0f - floatValue);
                }
                l6Var.b.invalidate();
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
                p9 p9Var = (p9) this.c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                w9 w9Var = p9Var.W;
                if (w9Var != null && ((u1) w9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((u1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    break;
                }
                break;
            case 5:
                z9 z9Var = (z9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.setScaleX(floatValue2);
                z9Var.setScaleY(floatValue2);
                if (!this.b) {
                    z9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                h9 h9Var = (h9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.i0(floatValue3, false);
                if (this.b) {
                    a9 a9Var = h9Var.a;
                    a9Var.w = floatValue3;
                    a9Var.invalidate();
                    break;
                }
                break;
            case 7:
                p60 p60Var = (p60) this.c;
                p60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (p60Var.getMeasuredHeight() / 2.0f);
                p60Var.w();
                break;
            case 8:
                ub0 ub0Var = (ub0) this.c;
                ub0Var.getClass();
                ub0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ub0Var.invalidate();
                if (this.b) {
                    ub0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                u2 u2Var = (u2) this.c;
                TextView[] textViewArr = u2Var.h;
                u2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.s);
                    textViewArr[0].setScaleX(1.0f - u2Var.s);
                    textViewArr[0].setScaleY(1.0f - u2Var.s);
                    textViewArr[1].setAlpha(u2Var.s);
                    textViewArr[1].setScaleX(u2Var.s);
                    textViewArr[1].setScaleY(u2Var.s);
                    break;
                }
                break;
            case 10:
                hj0 hj0Var = (hj0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var.E = floatValue4;
                hj0Var.H.setAlpha(floatValue4);
                hj0Var.K.setAlpha(hj0Var.E);
                if (!this.b && (viewGroup = hj0Var.Z) != null) {
                    viewGroup.setAlpha(hj0Var.E);
                }
                hj0Var.F.invalidate();
                hj0Var.G.invalidate();
                break;
            case 11:
                r51 r51Var = (r51) this.c;
                r51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r51Var.b.invalidate();
                r51Var.c.invalidate();
                if (r51Var.S) {
                    r51Var.N.invalidate();
                }
                r51Var.e();
                TextView textView = r51Var.y;
                if (textView != null) {
                    textView.setAlpha(r51Var.s);
                }
                if (!r51Var.S && (p51Var = r51Var.N) != null && p51Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? es.g : es.i).getInterpolation(Utilities.clamp(r51Var.s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                rg.n0 n0Var = (rg.n0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.e = floatValue5;
                if (!this.b) {
                    n0Var.c.setAlpha(1.0f - floatValue5);
                }
                n0Var.b.invalidate();
                break;
        }
    }
}
