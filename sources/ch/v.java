package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.i5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z40;
import org.telegram.ui.eg0;
import org.telegram.ui.rz0;
import org.telegram.ui.tz0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        rz0 rz0Var;
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
                a8 a8Var = (a8) this.c;
                a8Var.getClass();
                a8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.invalidate();
                if (this.b) {
                    a8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                i5 i5Var = (i5) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.e = floatValue;
                if (!this.b) {
                    i5Var.c.setAlpha(1.0f - floatValue);
                }
                i5Var.b.invalidate();
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
                j9 j9Var = (j9) this.c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.q9 q9Var2 = (org.telegram.ui.Components.q9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var2.setScaleX(floatValue2);
                q9Var2.setScaleY(floatValue2);
                if (!this.b) {
                    q9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                y8 y8Var = (y8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.n0(false, floatValue3);
                if (this.b) {
                    r8 r8Var = y8Var.a;
                    r8Var.x = floatValue3;
                    r8Var.invalidate();
                    break;
                }
                break;
            case 7:
                z40 z40Var = (z40) this.c;
                z40Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z40Var.getMeasuredHeight() / 2.0f);
                z40Var.x();
                break;
            case 8:
                y90 y90Var = (y90) this.c;
                y90Var.getClass();
                y90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y90Var.invalidate();
                if (this.b) {
                    y90Var.requestLayout();
                    break;
                }
                break;
            case 9:
                q2 q2Var = (q2) this.c;
                TextView[] textViewArr = q2Var.h;
                q2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - q2Var.s);
                    textViewArr[0].setScaleX(1.0f - q2Var.s);
                    textViewArr[0].setScaleY(1.0f - q2Var.s);
                    textViewArr[1].setAlpha(q2Var.s);
                    textViewArr[1].setScaleX(q2Var.s);
                    textViewArr[1].setScaleY(q2Var.s);
                    break;
                }
                break;
            case 10:
                eg0 eg0Var = (eg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.E = floatValue4;
                eg0Var.H.setAlpha(floatValue4);
                eg0Var.K.setAlpha(eg0Var.E);
                if (!this.b && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                break;
            case 11:
                tz0 tz0Var = (tz0) this.c;
                tz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz0Var.b.invalidate();
                tz0Var.c.invalidate();
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                }
                tz0Var.e();
                TextView textView = tz0Var.E;
                if (textView != null) {
                    textView.setAlpha(tz0Var.s);
                }
                if (!tz0Var.T && (rz0Var = tz0Var.O) != null && rz0Var.getSeekBarWaveform() != null) {
                    bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? lr.g : lr.i).getInterpolation(Utilities.i(tz0Var.s * 1.25f, 1.0f, 0.0f));
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
