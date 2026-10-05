package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.a51;
import org.telegram.ui.c51;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        a51 a51Var;
        switch (this.a) {
            case 0:
                db dbVar = (db) this.c;
                dbVar.getClass();
                dbVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.b) {
                    dbVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ci.n6 n6Var = (ci.n6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.e = floatValue;
                if (!this.b) {
                    n6Var.c.setAlpha(1.0f - floatValue);
                }
                n6Var.b.invalidate();
                break;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                u1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.u1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue2);
                w9Var.setScaleY(floatValue2);
                if (!this.b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue3, false);
                if (this.b) {
                    org.telegram.ui.Components.x8 x8Var = e9Var.a;
                    x8Var.w = floatValue3;
                    x8Var.invalidate();
                    break;
                }
                break;
            case 6:
                f60 f60Var = (f60) this.c;
                f60Var.z0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f60Var.getMeasuredHeight() / 2.0f);
                f60Var.v();
                break;
            case 7:
                hb0 hb0Var = (hb0) this.c;
                hb0Var.getClass();
                hb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hb0Var.invalidate();
                if (this.b) {
                    hb0Var.requestLayout();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.c;
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
            case 9:
                zi0 zi0Var = (zi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi0Var.E = floatValue4;
                zi0Var.H.setAlpha(floatValue4);
                zi0Var.K.setAlpha(zi0Var.E);
                if (!this.b && (viewGroup = zi0Var.Z) != null) {
                    viewGroup.setAlpha(zi0Var.E);
                }
                zi0Var.F.invalidate();
                zi0Var.G.invalidate();
                break;
            case 10:
                c51 c51Var = (c51) this.c;
                c51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.b.invalidate();
                c51Var.c.invalidate();
                if (c51Var.S) {
                    c51Var.N.invalidate();
                }
                c51Var.e();
                TextView textView = c51Var.y;
                if (textView != null) {
                    textView.setAlpha(c51Var.s);
                }
                if (!c51Var.S && (a51Var = c51Var.N) != null && a51Var.getSeekBarWaveform() != null) {
                    cp0 seekBarWaveform = c51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? tr.g : tr.i).getInterpolation(Utilities.clamp(c51Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                qg.l0 l0Var = (qg.l0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue5;
                if (!this.b) {
                    l0Var.c.setAlpha(1.0f - floatValue5);
                }
                l0Var.b.invalidate();
                break;
            default:
                zg.z zVar = (zg.z) this.c;
                zVar.x = null;
                zVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.k();
                zVar.l();
                zVar.n.setCustomEmojiEnterProgress(Utilities.clamp(zVar.j, 1.0f, 0.0f));
                zVar.a.invalidate();
                zVar.m.invalidateOutline();
                if (zVar.w) {
                    zVar.j(zVar.j, this.b);
                    break;
                }
                break;
        }
    }
}
