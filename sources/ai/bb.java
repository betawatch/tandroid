package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.cj0;
import org.telegram.ui.g51;
import org.telegram.ui.i51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        g51 g51Var;
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
                ci.o6 o6Var = (ci.o6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.e = floatValue;
                if (!this.b) {
                    o6Var.c.setAlpha(1.0f - floatValue);
                }
                o6Var.b.invalidate();
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
                b60 b60Var = (b60) this.c;
                b60Var.x0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (b60Var.getMeasuredHeight() / 2.0f);
                b60Var.w();
                break;
            case 7:
                cb0 cb0Var = (cb0) this.c;
                cb0Var.getClass();
                cb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cb0Var.invalidate();
                if (this.b) {
                    cb0Var.requestLayout();
                    break;
                }
                break;
            case 8:
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
            case 9:
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
            case 10:
                i51 i51Var = (i51) this.c;
                i51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51Var.b.invalidate();
                i51Var.c.invalidate();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                }
                i51Var.e();
                TextView textView = i51Var.y;
                if (textView != null) {
                    textView.setAlpha(i51Var.s);
                }
                if (!i51Var.S && (g51Var = i51Var.N) != null && g51Var.getSeekBarWaveform() != null) {
                    wo0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? qr.g : qr.i).getInterpolation(Utilities.clamp(i51Var.s * 1.25f, 1.0f, 0.0f));
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
                zg.b0 b0Var = (zg.b0) this.c;
                b0Var.x = null;
                b0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.j, 1.0f, 0.0f));
                b0Var.a.invalidate();
                b0Var.m.invalidateOutline();
                if (b0Var.w) {
                    b0Var.j(b0Var.j, this.b);
                    break;
                }
                break;
        }
    }
}
