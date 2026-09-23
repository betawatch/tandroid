package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.a51;
import org.telegram.ui.wi0;
import org.telegram.ui.y41;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        y41 y41Var;
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.c;
                s9Var.getClass();
                s9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.da daVar = s9Var.C;
                if (daVar != null) {
                    daVar.invalidate();
                }
                org.telegram.ui.Cells.z9 z9Var = s9Var.W;
                if (z9Var != null && ((org.telegram.ui.Cells.t1) z9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.t1) s9Var.W).setSelectedBackgroundProgress(1.0f - s9Var.U);
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
                x50 x50Var = (x50) this.c;
                x50Var.u0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (x50Var.getMeasuredHeight() / 2.0f);
                x50Var.s();
                break;
            case 7:
                ua0 ua0Var = (ua0) this.c;
                ua0Var.getClass();
                ua0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ua0Var.invalidate();
                if (this.b) {
                    ua0Var.requestLayout();
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
                wi0 wi0Var = (wi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var.E = floatValue4;
                wi0Var.H.setAlpha(floatValue4);
                wi0Var.K.setAlpha(wi0Var.E);
                if (!this.b && (viewGroup = wi0Var.Z) != null) {
                    viewGroup.setAlpha(wi0Var.E);
                }
                wi0Var.F.invalidate();
                wi0Var.G.invalidate();
                break;
            case 10:
                a51 a51Var = (a51) this.c;
                a51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.b.invalidate();
                a51Var.c.invalidate();
                if (a51Var.S) {
                    a51Var.N.invalidate();
                }
                a51Var.e();
                TextView textView = a51Var.y;
                if (textView != null) {
                    textView.setAlpha(a51Var.s);
                }
                if (!a51Var.S && (y41Var = a51Var.N) != null && y41Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = a51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? rr.g : rr.i).getInterpolation(Utilities.clamp(a51Var.s * 1.25f, 1.0f, 0.0f));
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
