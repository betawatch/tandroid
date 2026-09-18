package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.dj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        i51 i51Var;
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
                dj0 dj0Var = (dj0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj0Var.E = floatValue4;
                dj0Var.H.setAlpha(floatValue4);
                dj0Var.K.setAlpha(dj0Var.E);
                if (!this.b && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                break;
            case 10:
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
                    jo0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? qr.g : qr.i).getInterpolation(Utilities.clamp(k51Var.s * 1.25f, 1.0f, 0.0f));
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
