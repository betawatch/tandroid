package dg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x50;
import org.telegram.ui.n41;
import org.telegram.ui.p41;
import org.telegram.ui.si0;
import ph.a5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        n41 n41Var;
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
                x50 x50Var = (x50) this.c;
                x50Var.r0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (x50Var.getMeasuredHeight() / 2.0f);
                x50Var.s();
                break;
            case 8:
                va0 va0Var = (va0) this.c;
                va0Var.getClass();
                va0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                va0Var.invalidate();
                if (this.b) {
                    va0Var.requestLayout();
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
                si0 si0Var = (si0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var.B = floatValue4;
                si0Var.E.setAlpha(floatValue4);
                si0Var.H.setAlpha(si0Var.B);
                if (!this.b && (viewGroup = si0Var.W) != null) {
                    viewGroup.setAlpha(si0Var.B);
                }
                si0Var.C.invalidate();
                si0Var.D.invalidate();
                break;
            case 11:
                p41 p41Var = (p41) this.c;
                p41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.b.invalidate();
                p41Var.c.invalidate();
                if (p41Var.P) {
                    p41Var.K.invalidate();
                }
                p41Var.e();
                TextView textView = p41Var.y;
                if (textView != null) {
                    textView.setAlpha(p41Var.s);
                }
                if (!p41Var.P && (n41Var = p41Var.K) != null && n41Var.getSeekBarWaveform() != null) {
                    mo0 seekBarWaveform = p41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? nr.g : nr.i).getInterpolation(Utilities.clamp(p41Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
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
