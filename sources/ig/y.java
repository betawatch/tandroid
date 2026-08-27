package ig;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jh.d8;
import lh.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        a41 a41Var;
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.c;
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
            case 1:
                d8 d8Var = (d8) this.c;
                d8Var.getClass();
                d8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.b) {
                    d8Var.requestLayout();
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
                s1 s1Var = (s1) this.c;
                s1Var.fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                k9 k9Var = (k9) this.c;
                k9Var.getClass();
                k9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = k9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = k9Var.W;
                if (r9Var != null && ((s1) r9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((s1) k9Var.W).setSelectedBackgroundProgress(1.0f - k9Var.U);
                    break;
                }
                break;
            case 5:
                n9 n9Var = (n9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.setScaleX(floatValue2);
                n9Var.setScaleY(floatValue2);
                if (!this.b) {
                    n9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                v8 v8Var = (v8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.i0(floatValue3, false);
                if (this.b) {
                    o8 o8Var = v8Var.a;
                    o8Var.w = floatValue3;
                    o8Var.invalidate();
                    break;
                }
                break;
            case 7:
                k50 k50Var = (k50) this.c;
                k50Var.q0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (k50Var.getMeasuredHeight() / 2.0f);
                k50Var.s();
                break;
            case 8:
                ga0 ga0Var = (ga0) this.c;
                ga0Var.getClass();
                ga0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ga0Var.invalidate();
                if (this.b) {
                    ga0Var.requestLayout();
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
                ni0 ni0Var = (ni0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni0Var.A = floatValue4;
                ni0Var.D.setAlpha(floatValue4);
                ni0Var.G.setAlpha(ni0Var.A);
                if (!this.b && (viewGroup = ni0Var.V) != null) {
                    viewGroup.setAlpha(ni0Var.A);
                }
                ni0Var.B.invalidate();
                ni0Var.C.invalidate();
                break;
            case 11:
                c41 c41Var = (c41) this.c;
                c41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.b.invalidate();
                c41Var.c.invalidate();
                if (c41Var.O) {
                    c41Var.J.invalidate();
                }
                c41Var.e();
                TextView textView = c41Var.y;
                if (textView != null) {
                    textView.setAlpha(c41Var.s);
                }
                if (!c41Var.O && (a41Var = c41Var.J) != null && a41Var.getSeekBarWaveform() != null) {
                    sn0 seekBarWaveform = c41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? er.g : er.i).getInterpolation(Utilities.clamp(c41Var.s * 1.25f, 1.0f, 0.0f));
                    s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                zf.k0 k0Var = (zf.k0) this.c;
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
