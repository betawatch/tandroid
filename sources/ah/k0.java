package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.v8;
import ei.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x8;
import org.telegram.ui.mi0;
import org.telegram.ui.v31;
import org.telegram.ui.x31;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        v31 v31Var;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                t0Var.x = null;
                t0Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.j, 1.0f, 0.0f));
                t0Var.a.invalidate();
                t0Var.m.invalidateOutline();
                if (t0Var.w) {
                    t0Var.j(t0Var.j, this.b);
                    break;
                }
                break;
            case 1:
                v8 v8Var = (v8) this.c;
                v8Var.getClass();
                v8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                if (this.b) {
                    v8Var.requestLayout();
                    break;
                }
                break;
            case 2:
                c6 c6Var = (c6) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e = floatValue;
                if (!this.b) {
                    c6Var.c.setAlpha(1.0f - floatValue);
                }
                c6Var.b.invalidate();
                break;
            case 3:
                u1 u1Var = (u1) this.c;
                u1Var.jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                o9 o9Var = (o9) this.c;
                o9Var.getClass();
                o9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = o9Var.C;
                if (z9Var != null) {
                    z9Var.invalidate();
                }
                v9 v9Var = o9Var.W;
                if (v9Var != null && ((u1) v9Var).getCurrentMessagesGroup() == null && this.b) {
                    ((u1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    break;
                }
                break;
            case 5:
                w9 w9Var = (w9) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue2);
                w9Var.setScaleY(floatValue2);
                if (!this.b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 6:
                e9 e9Var = (e9) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue3, false);
                if (this.b) {
                    x8 x8Var = e9Var.a;
                    x8Var.w = floatValue3;
                    x8Var.invalidate();
                    break;
                }
                break;
            case 7:
                m60 m60Var = (m60) this.c;
                m60Var.E0 = this.b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (m60Var.getMeasuredHeight() / 2.0f);
                m60Var.w();
                break;
            case 8:
                ob0 ob0Var = (ob0) this.c;
                ob0Var.getClass();
                ob0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ob0Var.invalidate();
                if (this.b) {
                    ob0Var.requestLayout();
                    break;
                }
                break;
            case 9:
                t2 t2Var = (t2) this.c;
                TextView[] textViewArr = t2Var.h;
                t2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.s);
                    textViewArr[0].setScaleX(1.0f - t2Var.s);
                    textViewArr[0].setScaleY(1.0f - t2Var.s);
                    textViewArr[1].setAlpha(t2Var.s);
                    textViewArr[1].setScaleX(t2Var.s);
                    textViewArr[1].setScaleY(t2Var.s);
                    break;
                }
                break;
            case 10:
                mi0 mi0Var = (mi0) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi0Var.y = floatValue4;
                mi0Var.G.setAlpha(floatValue4);
                mi0Var.J.setAlpha(mi0Var.y);
                if (!this.b && (viewGroup = mi0Var.Y) != null) {
                    viewGroup.setAlpha(mi0Var.y);
                }
                mi0Var.E.invalidate();
                mi0Var.F.invalidate();
                break;
            case 11:
                x31 x31Var = (x31) this.c;
                x31Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.b.invalidate();
                x31Var.c.invalidate();
                if (x31Var.S) {
                    x31Var.N.invalidate();
                }
                x31Var.e();
                TextView textView = x31Var.y;
                if (textView != null) {
                    textView.setAlpha(x31Var.s);
                }
                if (!x31Var.S && (v31Var = x31Var.N) != null && v31Var.getSeekBarWaveform() != null) {
                    gp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = (this.b ? bs.g : bs.i).getInterpolation(Utilities.clamp(x31Var.s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        break;
                    }
                }
                break;
            default:
                rg.l0 l0Var = (rg.l0) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue5;
                if (!this.b) {
                    l0Var.c.setAlpha(1.0f - floatValue5);
                }
                l0Var.b.invalidate();
                break;
        }
    }
}
