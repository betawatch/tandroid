package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.b51;
import org.telegram.ui.vi0;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        z41 z41Var;
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
                c60 c60Var = (c60) this.c;
                c60Var.z0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (c60Var.getMeasuredHeight() / 2.0f);
                c60Var.v();
                break;
            case 7:
                fb0 fb0Var = (fb0) this.c;
                fb0Var.getClass();
                fb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fb0Var.invalidate();
                if (this.b) {
                    fb0Var.requestLayout();
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
                vi0 vi0Var = (vi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.E = floatValue4;
                vi0Var.H.setAlpha(floatValue4);
                vi0Var.K.setAlpha(vi0Var.E);
                if (!this.b && (viewGroup = vi0Var.Z) != null) {
                    viewGroup.setAlpha(vi0Var.E);
                }
                vi0Var.F.invalidate();
                vi0Var.G.invalidate();
                break;
            case 10:
                b51 b51Var = (b51) this.c;
                b51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b51Var.b.invalidate();
                b51Var.c.invalidate();
                if (b51Var.S) {
                    b51Var.N.invalidate();
                }
                b51Var.e();
                TextView textView = b51Var.y;
                if (textView != null) {
                    textView.setAlpha(b51Var.s);
                }
                if (!b51Var.S && (z41Var = b51Var.N) != null && z41Var.getSeekBarWaveform() != null) {
                    vo0 seekBarWaveform = b51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? rr.g : rr.i).getInterpolation(Utilities.clamp(b51Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                qg.m0 m0Var = (qg.m0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue5;
                if (!this.b) {
                    m0Var.c.setAlpha(1.0f - floatValue5);
                }
                m0Var.b.invalidate();
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
