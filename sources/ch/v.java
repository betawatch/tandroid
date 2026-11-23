package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.h5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.y8;
import org.telegram.ui.eg0;
import org.telegram.ui.sz0;
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        sz0 sz0Var;
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
                h5 h5Var = (h5) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h5Var.e = floatValue;
                if (!this.b) {
                    h5Var.c.setAlpha(1.0f - floatValue);
                }
                h5Var.b.invalidate();
                break;
            case 3:
                r1 r1Var = (r1) this.c;
                r1Var.sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                if (this.b && r1Var.getParent() != null) {
                    ((View) r1Var.getParent()).invalidate();
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
                if (r9Var != null && ((r1) r9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((r1) k9Var.W).setSelectedBackgroundProgress(1.0f - k9Var.U);
                    break;
                }
                break;
            case 5:
                q9 q9Var = (q9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.setScaleX(floatValue2);
                q9Var.setScaleY(floatValue2);
                if (!this.b) {
                    q9Var.setAlpha(valueAnimator.getAnimatedFraction());
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
                c50 c50Var = (c50) this.c;
                c50Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (c50Var.getMeasuredHeight() / 2.0f);
                c50Var.x();
                break;
            case 8:
                aa0 aa0Var = (aa0) this.c;
                aa0Var.getClass();
                aa0Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa0Var.invalidate();
                if (this.b) {
                    aa0Var.requestLayout();
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
                uz0 uz0Var = (uz0) this.c;
                uz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var.b.invalidate();
                uz0Var.c.invalidate();
                if (uz0Var.T) {
                    uz0Var.O.invalidate();
                }
                uz0Var.e();
                TextView textView = uz0Var.E;
                if (textView != null) {
                    textView.setAlpha(uz0Var.s);
                }
                if (!uz0Var.T && (sz0Var = uz0Var.O) != null && sz0Var.getSeekBarWaveform() != null) {
                    en0 seekBarWaveform = uz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? nr.g : nr.i).getInterpolation(Utilities.i(uz0Var.s * 1.25f, 1.0f, 0.0f));
                    r1 r1Var2 = seekBarWaveform.n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.e = floatValue5;
                if (!this.b) {
                    g0Var.c.setAlpha(1.0f - floatValue5);
                }
                g0Var.b.invalidate();
                break;
        }
    }
}
