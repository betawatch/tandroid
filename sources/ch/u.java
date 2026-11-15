package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.d8;
import hi.j5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.bg0;
import org.telegram.ui.nz0;
import org.telegram.ui.pz0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        nz0 nz0Var;
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
                d8 d8Var = (d8) this.c;
                d8Var.getClass();
                d8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.b) {
                    d8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                j5 j5Var = (j5) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.e = floatValue;
                if (!this.b) {
                    j5Var.c.setAlpha(1.0f - floatValue);
                }
                j5Var.b.invalidate();
                break;
            case 3:
                q1 q1Var = (q1) this.c;
                q1Var.sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                i9 i9Var = (i9) this.c;
                i9Var.getClass();
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = i9Var.C;
                if (t9Var != null) {
                    t9Var.invalidate();
                }
                p9 p9Var = i9Var.W;
                if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((q1) i9Var.W).setSelectedBackgroundProgress(1.0f - i9Var.U);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.i9 i9Var2 = (org.telegram.ui.Components.i9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var2.setScaleX(floatValue2);
                i9Var2.setScaleY(floatValue2);
                if (!this.b) {
                    i9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                q8 q8Var = (q8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.n0(false, floatValue3);
                if (this.b) {
                    j8 j8Var = q8Var.a;
                    j8Var.x = floatValue3;
                    j8Var.invalidate();
                    break;
                }
                break;
            case 7:
                r40 r40Var = (r40) this.c;
                r40Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (r40Var.getMeasuredHeight() / 2.0f);
                r40Var.x();
                break;
            case 8:
                n90 n90Var = (n90) this.c;
                n90Var.getClass();
                n90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n90Var.invalidate();
                if (this.b) {
                    n90Var.requestLayout();
                    break;
                }
                break;
            case 9:
                r2 r2Var = (r2) this.c;
                TextView[] textViewArr = r2Var.h;
                r2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - r2Var.s);
                    textViewArr[0].setScaleX(1.0f - r2Var.s);
                    textViewArr[0].setScaleY(1.0f - r2Var.s);
                    textViewArr[1].setAlpha(r2Var.s);
                    textViewArr[1].setScaleX(r2Var.s);
                    textViewArr[1].setScaleY(r2Var.s);
                    break;
                }
                break;
            case 10:
                bg0 bg0Var = (bg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.E = floatValue4;
                bg0Var.H.setAlpha(floatValue4);
                bg0Var.K.setAlpha(bg0Var.E);
                if (!this.b && (viewGroup = bg0Var.Z) != null) {
                    viewGroup.setAlpha(bg0Var.E);
                }
                bg0Var.F.invalidate();
                bg0Var.G.invalidate();
                break;
            case 11:
                pz0 pz0Var = (pz0) this.c;
                pz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz0Var.b.invalidate();
                pz0Var.c.invalidate();
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                }
                pz0Var.e();
                TextView textView = pz0Var.E;
                if (textView != null) {
                    textView.setAlpha(pz0Var.s);
                }
                if (!pz0Var.T && (nz0Var = pz0Var.O) != null && nz0Var.getSeekBarWaveform() != null) {
                    tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? er.g : er.i).getInterpolation(Utilities.i(pz0Var.s * 1.25f, 1.0f, 0.0f));
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
