package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.ja;
import di.n6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.cj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        i51 i51Var;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                u0Var.x = null;
                u0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u0Var.k();
                u0Var.l();
                u0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(u0Var.j, 1.0f, 0.0f));
                u0Var.a.invalidate();
                u0Var.m.invalidateOutline();
                if (u0Var.w) {
                    u0Var.j(u0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                ja jaVar = (ja) this.c;
                jaVar.getClass();
                jaVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jaVar.invalidate();
                if (this.b) {
                    jaVar.requestLayout();
                    break;
                }
                break;
            case 2:
                n6 n6Var = (n6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.e = floatValue;
                if (!this.b) {
                    n6Var.c.setAlpha(1.0f - floatValue);
                }
                n6Var.b.invalidate();
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
                r9 r9Var = (r9) this.c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                y9 y9Var = r9Var.W;
                if (y9Var != null && ((t1) y9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    break;
                }
                break;
            case 5:
                x9 x9Var = (x9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.setScaleX(floatValue2);
                x9Var.setScaleY(floatValue2);
                if (!this.b) {
                    x9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                f9 f9Var = (f9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.i0(floatValue3, false);
                if (this.b) {
                    y8 y8Var = f9Var.a;
                    y8Var.w = floatValue3;
                    y8Var.invalidate();
                    break;
                }
                break;
            case 7:
                w50 w50Var = (w50) this.c;
                w50Var.u0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                w50Var.s();
                break;
            case 8:
                ua0 ua0Var = (ua0) this.c;
                ua0Var.getClass();
                ua0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ua0Var.invalidate();
                if (this.b) {
                    ua0Var.requestLayout();
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
                cj0 cj0Var = (cj0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj0Var.E = floatValue4;
                cj0Var.H.setAlpha(floatValue4);
                cj0Var.K.setAlpha(cj0Var.E);
                if (!this.b && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                break;
            case 11:
                k51 k51Var = (k51) this.c;
                k51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.b.invalidate();
                k51Var.c.invalidate();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                k51Var.e();
                TextView textView = k51Var.y;
                if (textView != null) {
                    textView.setAlpha(k51Var.s);
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? pr.g : pr.i).getInterpolation(Utilities.clamp(k51Var.s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
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
