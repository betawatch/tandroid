// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d20(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        ou9 ou9Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                be0 be0Var = (be0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.setScaleX(floatValue);
                be0Var.setScaleY(floatValue);
                if (!z) {
                    be0Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 1:
                mb0 mb0Var = (mb0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb0Var.m0(false, floatValue2);
                if (z) {
                    db0 db0Var = mb0Var.a;
                    db0Var.x = floatValue2;
                    db0Var.invalidate();
                    break;
                }
                break;
            case 2:
                gb2 gb2Var = (gb2) obj;
                gb2Var.Eb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gb2Var.invalidate();
                if (z && gb2Var.getParent() != null) {
                    ((View) gb2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                m43 m43Var = (m43) obj;
                m43Var.x = null;
                m43Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m43Var.k();
                m43Var.l();
                m43Var.n.setCustomEmojiEnterProgress(Utilities.i(m43Var.j, 1.0f, 0.0f));
                m43Var.a.invalidate();
                m43Var.m.invalidateOutline();
                if (m43Var.w) {
                    m43Var.j(z, m43Var.j);
                    break;
                }
                break;
            case 4:
                pw5 pw5Var = (pw5) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pw5Var.e = floatValue3;
                if (!z) {
                    pw5Var.c.setAlpha(1.0f - floatValue3);
                }
                pw5Var.b.invalidate();
                break;
            case 5:
                j17 j17Var = (j17) obj;
                j17Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j17Var.invalidate();
                if (z) {
                    j17Var.requestLayout();
                    break;
                }
                break;
            case 6:
                j47 j47Var = (j47) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j47Var.E = floatValue4;
                j47Var.H.setAlpha(floatValue4);
                j47Var.K.setAlpha(j47Var.E);
                if (!z && (viewGroup = j47Var.Z) != null) {
                    viewGroup.setAlpha(j47Var.E);
                }
                j47Var.F.invalidate();
                j47Var.G.invalidate();
                break;
            case 7:
                ut7 ut7Var = (ut7) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ut7Var.e = floatValue5;
                if (!z) {
                    ut7Var.c.setAlpha(1.0f - floatValue5);
                }
                ut7Var.b.invalidate();
                break;
            case 8:
                qu9 qu9Var = (qu9) obj;
                qu9Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qu9Var.b.invalidate();
                qu9Var.c.invalidate();
                if (qu9Var.T) {
                    qu9Var.O.invalidate();
                }
                qu9Var.e();
                TextView textView = qu9Var.E;
                if (textView != null) {
                    textView.setAlpha(qu9Var.s);
                }
                if (!qu9Var.T && (ou9Var = qu9Var.O) != null && ou9Var.getSeekBarWaveform() != null) {
                    dv9 seekBarWaveform = qu9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (z ? s33.g : s33.i).getInterpolation(Utilities.i(qu9Var.s * 1.25f, 1.0f, 0.0f));
                    gb2 gb2Var2 = seekBarWaveform.n;
                    if (gb2Var2 != null) {
                        gb2Var2.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                x3b x3bVar = (x3b) obj;
                x3bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3bVar.invalidate();
                if (z) {
                    x3bVar.requestLayout();
                    break;
                }
                break;
            case 10:
                gib gibVar = (gib) obj;
                gibVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qib qibVar = gibVar.C;
                if (qibVar != null) {
                    qibVar.invalidate();
                }
                mib mibVar = gibVar.W;
                if (mibVar != null && ((gb2) mibVar).getCurrentMessagesGroup() == null && z) {
                    ((gb2) gibVar.W).setSelectedBackgroundProgress(1.0f - gibVar.U);
                    break;
                }
                break;
            default:
                dic dicVar = (dic) obj;
                TextView[] textViewArr = dicVar.h;
                dicVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.invalidate();
                if (z) {
                    textViewArr[0].setAlpha(1.0f - dicVar.s);
                    textViewArr[0].setScaleX(1.0f - dicVar.s);
                    textViewArr[0].setScaleY(1.0f - dicVar.s);
                    textViewArr[1].setAlpha(dicVar.s);
                    textViewArr[1].setScaleX(dicVar.s);
                    textViewArr[1].setScaleY(dicVar.s);
                    break;
                }
                break;
        }
    }
}
