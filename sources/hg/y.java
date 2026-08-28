package hg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ih.h8;
import kh.d6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.w8;
import org.telegram.ui.b41;
import org.telegram.ui.d41;
import org.telegram.ui.li0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        b41 b41Var;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.c;
                e0Var.x = null;
                e0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.k();
                e0Var.l();
                e0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(e0Var.j, 1.0f, 0.0f));
                e0Var.a.invalidate();
                e0Var.m.invalidateOutline();
                if (e0Var.w) {
                    e0Var.j(e0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                h8 h8Var = (h8) this.c;
                h8Var.getClass();
                h8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.invalidate();
                if (this.b) {
                    h8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                d6 d6Var = (d6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.e = floatValue;
                if (!this.b) {
                    d6Var.c.setAlpha(1.0f - floatValue);
                }
                d6Var.b.invalidate();
                break;
            case 3:
                t1 t1Var = (t1) this.c;
                t1Var.fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
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
                if (v9Var != null && ((t1) v9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((t1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.o9 o9Var2 = (org.telegram.ui.Components.o9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var2.setScaleX(floatValue2);
                o9Var2.setScaleY(floatValue2);
                if (!this.b) {
                    o9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                w8 w8Var = (w8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.h0(floatValue3, false);
                if (this.b) {
                    p8 p8Var = w8Var.a;
                    p8Var.w = floatValue3;
                    p8Var.invalidate();
                    break;
                }
                break;
            case 7:
                f50 f50Var = (f50) this.c;
                f50Var.q0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f50Var.getMeasuredHeight() / 2.0f);
                f50Var.s();
                break;
            case 8:
                ca0 ca0Var = (ca0) this.c;
                ca0Var.getClass();
                ca0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca0Var.invalidate();
                if (this.b) {
                    ca0Var.requestLayout();
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
                li0 li0Var = (li0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li0Var.A = floatValue4;
                li0Var.D.setAlpha(floatValue4);
                li0Var.G.setAlpha(li0Var.A);
                if (!this.b && (viewGroup = li0Var.V) != null) {
                    viewGroup.setAlpha(li0Var.A);
                }
                li0Var.B.invalidate();
                li0Var.C.invalidate();
                break;
            case 11:
                d41 d41Var = (d41) this.c;
                d41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.b.invalidate();
                d41Var.c.invalidate();
                if (d41Var.O) {
                    d41Var.J.invalidate();
                }
                d41Var.e();
                TextView textView = d41Var.y;
                if (textView != null) {
                    textView.setAlpha(d41Var.s);
                }
                if (!d41Var.O && (b41Var = d41Var.J) != null && b41Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = d41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? gr.g : gr.i).getInterpolation(Utilities.clamp(d41Var.s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                yf.k0 k0Var = (yf.k0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.e = floatValue5;
                if (!this.b) {
                    k0Var.c.setAlpha(1.0f - floatValue5);
                }
                k0Var.b.invalidate();
                break;
        }
    }
}
