package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.dj0;
import org.telegram.ui.j51;
import org.telegram.ui.l51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        j51 j51Var;
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
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.c;
                s9Var.getClass();
                s9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.da daVar = s9Var.C;
                if (daVar != null) {
                    daVar.invalidate();
                }
                org.telegram.ui.Cells.z9 z9Var = s9Var.W;
                if (z9Var != null && ((org.telegram.ui.Cells.u1) z9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((org.telegram.ui.Cells.u1) s9Var.W).setSelectedBackgroundProgress(1.0f - s9Var.U);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.setScaleX(floatValue2);
                v9Var.setScaleY(floatValue2);
                if (!this.b) {
                    v9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 5:
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
            case 6:
                a60 a60Var = (a60) this.c;
                a60Var.x0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (a60Var.getMeasuredHeight() / 2.0f);
                a60Var.v();
                break;
            case 7:
                bb0 bb0Var = (bb0) this.c;
                bb0Var.getClass();
                bb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bb0Var.invalidate();
                if (this.b) {
                    bb0Var.requestLayout();
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
                l51 l51Var = (l51) this.c;
                l51Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51Var.b.invalidate();
                l51Var.c.invalidate();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                }
                l51Var.e();
                TextView textView = l51Var.y;
                if (textView != null) {
                    textView.setAlpha(l51Var.s);
                }
                if (!l51Var.S && (j51Var = l51Var.N) != null && j51Var.getSeekBarWaveform() != null) {
                    vo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? qr.g : qr.i).getInterpolation(Utilities.clamp(l51Var.s * 1.25f, 1.0f, 0.0f));
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
