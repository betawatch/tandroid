package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.s5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.z40;
import org.telegram.ui.dg0;
import org.telegram.ui.qz0;
import org.telegram.ui.sz0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        qz0 qz0Var;
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
                s5 s5Var = (s5) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.e = floatValue;
                if (!this.b) {
                    s5Var.c.setAlpha(1.0f - floatValue);
                }
                s5Var.b.invalidate();
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
                j9 j9Var = (j9) this.c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((r1) q9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((r1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
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
                x8 x8Var = (x8) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.n0(false, floatValue3);
                if (this.b) {
                    q8 q8Var = x8Var.a;
                    q8Var.x = floatValue3;
                    q8Var.invalidate();
                    break;
                }
                break;
            case 7:
                z40 z40Var = (z40) this.c;
                z40Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z40Var.getMeasuredHeight() / 2.0f);
                z40Var.x();
                break;
            case 8:
                x90 x90Var = (x90) this.c;
                x90Var.getClass();
                x90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x90Var.invalidate();
                if (this.b) {
                    x90Var.requestLayout();
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
                dg0 dg0Var = (dg0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.E = floatValue4;
                dg0Var.H.setAlpha(floatValue4);
                dg0Var.K.setAlpha(dg0Var.E);
                if (!this.b && (viewGroup = dg0Var.Z) != null) {
                    viewGroup.setAlpha(dg0Var.E);
                }
                dg0Var.F.invalidate();
                dg0Var.G.invalidate();
                break;
            case 11:
                sz0 sz0Var = (sz0) this.c;
                sz0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sz0Var.b.invalidate();
                sz0Var.c.invalidate();
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                }
                sz0Var.e();
                TextView textView = sz0Var.E;
                if (textView != null) {
                    textView.setAlpha(sz0Var.s);
                }
                if (!sz0Var.T && (qz0Var = sz0Var.O) != null && qz0Var.getSeekBarWaveform() != null) {
                    dn0 seekBarWaveform = sz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? kr.g : kr.i).getInterpolation(Utilities.i(sz0Var.s * 1.25f, 1.0f, 0.0f));
                    r1 r1Var2 = seekBarWaveform.n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                tg.k0 k0Var = (tg.k0) this.c;
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
