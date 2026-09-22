package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.bj0;
import org.telegram.ui.g51;
import org.telegram.ui.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
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
                if (y9Var != null && ((org.telegram.ui.Cells.t1) y9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue2);
                u9Var.setScaleY(floatValue2);
                if (!this.b) {
                    u9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.i0(floatValue3, false);
                if (this.b) {
                    org.telegram.ui.Components.v8 v8Var = c9Var.a;
                    v8Var.w = floatValue3;
                    v8Var.invalidate();
                    break;
                }
                break;
            case 6:
                w50 w50Var = (w50) this.c;
                w50Var.u0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                w50Var.s();
                break;
            case 7:
                ta0 ta0Var = (ta0) this.c;
                ta0Var.getClass();
                ta0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ta0Var.invalidate();
                if (this.b) {
                    ta0Var.requestLayout();
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
                bj0 bj0Var = (bj0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bj0Var.E = floatValue4;
                bj0Var.H.setAlpha(floatValue4);
                bj0Var.K.setAlpha(bj0Var.E);
                if (!this.b && (viewGroup = bj0Var.Z) != null) {
                    viewGroup.setAlpha(bj0Var.E);
                }
                bj0Var.F.invalidate();
                bj0Var.G.invalidate();
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
                    io0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? qr.g : qr.i).getInterpolation(Utilities.clamp(i51Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                qg.o0 o0Var = (qg.o0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e = floatValue5;
                if (!this.b) {
                    o0Var.c.setAlpha(1.0f - floatValue5);
                }
                o0Var.b.invalidate();
                break;
            default:
                zg.c0 c0Var = (zg.c0) this.c;
                c0Var.x = null;
                c0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.j, 1.0f, 0.0f));
                c0Var.a.invalidate();
                c0Var.m.invalidateOutline();
                if (c0Var.w) {
                    c0Var.j(c0Var.j, this.b);
                    break;
                }
                break;
        }
    }
}
