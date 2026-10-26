package bh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.t8;
import fi.b6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.voip.w2;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(int i10, Object obj, boolean z10) {
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
                i0 i0Var = (i0) this.c;
                i0Var.x = null;
                i0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.k();
                i0Var.l();
                i0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(i0Var.j, 1.0f, 0.0f));
                i0Var.a.invalidate();
                i0Var.m.invalidateOutline();
                if (i0Var.w) {
                    i0Var.j(i0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                t8 t8Var = (t8) this.c;
                t8Var.getClass();
                t8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.invalidate();
                if (this.b) {
                    t8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                b6 b6Var = (b6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e = floatValue;
                if (!this.b) {
                    b6Var.c.setAlpha(1.0f - floatValue);
                }
                b6Var.b.invalidate();
                break;
            case 3:
                s1 s1Var = (s1) this.c;
                s1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                t9 t9Var = (t9) this.c;
                t9Var.getClass();
                t9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ea eaVar = t9Var.C;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                aa aaVar = t9Var.W;
                if (aaVar != null && ((s1) aaVar).getCurrentMessagesGroup() == null && this.b) {
                    ((s1) t9Var.W).setSelectedBackgroundProgress(1.0f - t9Var.U);
                    break;
                }
                break;
            case 5:
                y9 y9Var = (y9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue2);
                y9Var.setScaleY(floatValue2);
                if (!this.b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                g9 g9Var = (g9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.j0(floatValue3, false);
                if (this.b) {
                    z8 z8Var = g9Var.a;
                    z8Var.w = floatValue3;
                    z8Var.invalidate();
                    break;
                }
                break;
            case 7:
                o60 o60Var = (o60) this.c;
                o60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (o60Var.getMeasuredHeight() / 2.0f);
                o60Var.w();
                break;
            case 8:
                mb0 mb0Var = (mb0) this.c;
                mb0Var.getClass();
                mb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb0Var.invalidate();
                if (this.b) {
                    mb0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                w2 w2Var = (w2) this.c;
                TextView[] textViewArr = w2Var.h;
                w2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.s);
                    textViewArr[0].setScaleX(1.0f - w2Var.s);
                    textViewArr[0].setScaleY(1.0f - w2Var.s);
                    textViewArr[1].setAlpha(w2Var.s);
                    textViewArr[1].setScaleX(w2Var.s);
                    textViewArr[1].setScaleY(w2Var.s);
                    break;
                }
                break;
            case 10:
                ni0 ni0Var = (ni0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni0Var.y = floatValue4;
                ni0Var.G.setAlpha(floatValue4);
                ni0Var.J.setAlpha(ni0Var.y);
                if (!this.b && (viewGroup = ni0Var.Y) != null) {
                    viewGroup.setAlpha(ni0Var.y);
                }
                ni0Var.E.invalidate();
                ni0Var.F.invalidate();
                break;
            case 11:
                c41 c41Var = (c41) this.c;
                c41Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.b.invalidate();
                c41Var.c.invalidate();
                if (c41Var.S) {
                    c41Var.N.invalidate();
                }
                c41Var.e();
                TextView textView = c41Var.y;
                if (textView != null) {
                    textView.setAlpha(c41Var.s);
                }
                if (!c41Var.S && (a41Var = c41Var.N) != null && a41Var.getSeekBarWaveform() != null) {
                    pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? ds.g : ds.i).getInterpolation(Utilities.clamp(c41Var.s * 1.25f, 1.0f, 0.0f));
                    s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue5;
                if (!this.b) {
                    m0Var.c.setAlpha(1.0f - floatValue5);
                }
                m0Var.b.invalidate();
                break;
        }
    }
}
