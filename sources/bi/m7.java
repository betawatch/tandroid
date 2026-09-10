package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.cj0;
import org.telegram.ui.l51;
import org.telegram.ui.n51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m7(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        l51 l51Var;
        switch (this.a) {
            case 0:
                o7 o7Var = (o7) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.e = floatValue;
                if (!this.b) {
                    o7Var.c.setAlpha(1.0f - floatValue);
                }
                o7Var.b.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) this.c;
                t9Var.getClass();
                t9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ea eaVar = t9Var.C;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                org.telegram.ui.Cells.aa aaVar = t9Var.W;
                if (aaVar != null && ((org.telegram.ui.Cells.t1) aaVar).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.t1) t9Var.W).setSelectedBackgroundProgress(1.0f - t9Var.U);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue2);
                w9Var.setScaleY(floatValue2);
                if (!this.b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.i0(floatValue3, false);
                if (this.b) {
                    org.telegram.ui.Components.w8 w8Var = d9Var.a;
                    w8Var.w = floatValue3;
                    w8Var.invalidate();
                    break;
                }
                break;
            case 5:
                f60 f60Var = (f60) this.c;
                f60Var.u0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f60Var.getMeasuredHeight() / 2.0f);
                f60Var.s();
                break;
            case 6:
                db0 db0Var = (db0) this.c;
                db0Var.getClass();
                db0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db0Var.invalidate();
                if (this.b) {
                    db0Var.requestLayout();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.c;
                TextView[] textViewArr = u2Var.h;
                u2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.s);
                    textViewArr[0].setScaleX(1.0f - u2Var.s);
                    textViewArr[0].setScaleY(1.0f - u2Var.s);
                    textViewArr[1].setAlpha(u2Var.s);
                    textViewArr[1].setScaleX(u2Var.s);
                    textViewArr[1].setScaleY(u2Var.s);
                    break;
                }
                break;
            case 8:
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
            case 9:
                n51 n51Var = (n51) this.c;
                n51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.b.invalidate();
                n51Var.c.invalidate();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                }
                n51Var.e();
                TextView textView = n51Var.y;
                if (textView != null) {
                    textView.setAlpha(n51Var.s);
                }
                if (!n51Var.S && (l51Var = n51Var.N) != null && l51Var.getSeekBarWaveform() != null) {
                    ro0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? wr.g : wr.i).getInterpolation(Utilities.clamp(n51Var.s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                pg.l0 l0Var = (pg.l0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue5;
                if (!this.b) {
                    l0Var.c.setAlpha(1.0f - floatValue5);
                }
                l0Var.b.invalidate();
                break;
            case 11:
                yg.c0 c0Var = (yg.c0) this.c;
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
            default:
                zh.r6 r6Var = (zh.r6) this.c;
                r6Var.getClass();
                r6Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.invalidate();
                if (this.b) {
                    r6Var.requestLayout();
                    break;
                }
                break;
        }
    }
}
