package dh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.k8;
import gi.j5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.gz0;
import org.telegram.ui.iz0;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        gz0 gz0Var;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                a0Var.x = null;
                a0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.n.setCustomEmojiEnterProgress(Utilities.i(a0Var.j, 1.0f, 0.0f));
                a0Var.a.invalidate();
                a0Var.m.invalidateOutline();
                if (a0Var.w) {
                    a0Var.j(this.b, a0Var.j);
                    break;
                }
                break;
            case 1:
                k8 k8Var = (k8) this.c;
                k8Var.getClass();
                k8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                if (this.b) {
                    k8Var.requestLayout();
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
                q1Var.rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                k9 k9Var = (k9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue2);
                k9Var.setScaleY(floatValue2);
                if (!this.b) {
                    k9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                r8 r8Var = (r8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.n0(false, floatValue3);
                if (this.b) {
                    org.telegram.ui.Components.k8 k8Var2 = r8Var.a;
                    k8Var2.x = floatValue3;
                    k8Var2.invalidate();
                    break;
                }
                break;
            case 7:
                k40 k40Var = (k40) this.c;
                k40Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (k40Var.getMeasuredHeight() / 2.0f);
                k40Var.w();
                break;
            case 8:
                h90 h90Var = (h90) this.c;
                h90Var.getClass();
                h90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h90Var.invalidate();
                if (this.b) {
                    h90Var.requestLayout();
                    break;
                }
                break;
            case 9:
                c2 c2Var = (c2) this.c;
                TextView[] textViewArr = c2Var.h;
                c2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - c2Var.s);
                    textViewArr[0].setScaleX(1.0f - c2Var.s);
                    textViewArr[0].setScaleY(1.0f - c2Var.s);
                    textViewArr[1].setAlpha(c2Var.s);
                    textViewArr[1].setScaleX(c2Var.s);
                    textViewArr[1].setScaleY(c2Var.s);
                    break;
                }
                break;
            case 10:
                vf0 vf0Var = (vf0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.E = floatValue4;
                vf0Var.H.setAlpha(floatValue4);
                vf0Var.K.setAlpha(vf0Var.E);
                if (!this.b && (viewGroup = vf0Var.Z) != null) {
                    viewGroup.setAlpha(vf0Var.E);
                }
                vf0Var.F.invalidate();
                vf0Var.G.invalidate();
                break;
            case 11:
                iz0 iz0Var = (iz0) this.c;
                iz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iz0Var.b.invalidate();
                iz0Var.c.invalidate();
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                }
                iz0Var.e();
                TextView textView = iz0Var.E;
                if (textView != null) {
                    textView.setAlpha(iz0Var.s);
                }
                if (!iz0Var.T && (gz0Var = iz0Var.O) != null && gz0Var.getSeekBarWaveform() != null) {
                    sm0 seekBarWaveform = iz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? xq.g : xq.i).getInterpolation(Utilities.i(iz0Var.s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                ug.e0 e0Var = (ug.e0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.e = floatValue5;
                if (!this.b) {
                    e0Var.c.setAlpha(1.0f - floatValue5);
                }
                e0Var.b.invalidate();
                break;
        }
    }
}
