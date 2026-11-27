// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e20(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        jy9 jy9Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                de0 de0Var = (de0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.setScaleX(floatValue);
                de0Var.setScaleY(floatValue);
                if (!z) {
                    de0Var.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            case 1:
                ob0 ob0Var = (ob0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ob0Var.m0(false, floatValue2);
                if (z) {
                    fb0 fb0Var = ob0Var.a;
                    fb0Var.x = floatValue2;
                    fb0Var.invalidate();
                    break;
                }
                break;
            case 2:
                wb2 wb2Var = (wb2) obj;
                wb2Var.Eb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb2Var.invalidate();
                if (z && wb2Var.getParent() != null) {
                    ((View) wb2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                e53 e53Var = (e53) obj;
                e53Var.x = null;
                e53Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e53Var.k();
                e53Var.l();
                e53Var.n.setCustomEmojiEnterProgress(Utilities.i(e53Var.j, 1.0f, 0.0f));
                e53Var.a.invalidate();
                e53Var.m.invalidateOutline();
                if (e53Var.w) {
                    e53Var.j(z, e53Var.j);
                    break;
                }
                break;
            case 4:
                uy5 uy5Var = (uy5) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy5Var.e = floatValue3;
                if (!z) {
                    uy5Var.c.setAlpha(1.0f - floatValue3);
                }
                uy5Var.b.invalidate();
                break;
            case 5:
                q37 q37Var = (q37) obj;
                q37Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q37Var.invalidate();
                if (z) {
                    q37Var.requestLayout();
                    break;
                }
                break;
            case 6:
                q67 q67Var = (q67) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q67Var.E = floatValue4;
                q67Var.H.setAlpha(floatValue4);
                q67Var.K.setAlpha(q67Var.E);
                if (!z && (viewGroup = q67Var.Z) != null) {
                    viewGroup.setAlpha(q67Var.E);
                }
                q67Var.F.invalidate();
                q67Var.G.invalidate();
                break;
            case 7:
                bx7 bx7Var = (bx7) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bx7Var.e = floatValue5;
                if (!z) {
                    bx7Var.c.setAlpha(1.0f - floatValue5);
                }
                bx7Var.b.invalidate();
                break;
            case 8:
                ky9 ky9Var = (ky9) obj;
                ky9Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky9Var.b.invalidate();
                ky9Var.c.invalidate();
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
                }
                ky9Var.e();
                TextView textView = ky9Var.E;
                if (textView != null) {
                    textView.setAlpha(ky9Var.s);
                }
                if (!ky9Var.T && (jy9Var = ky9Var.O) != null && jy9Var.getSeekBarWaveform() != null) {
                    xy9 seekBarWaveform = ky9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = (z ? k43.g : k43.i).getInterpolation(Utilities.i(ky9Var.s * 1.25f, 1.0f, 0.0f));
                    wb2 wb2Var2 = seekBarWaveform.n;
                    if (wb2Var2 != null) {
                        wb2Var2.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                u7b u7bVar = (u7b) obj;
                u7bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7bVar.invalidate();
                if (z) {
                    u7bVar.requestLayout();
                    break;
                }
                break;
            case 10:
                bmb bmbVar = (bmb) obj;
                bmbVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lmb lmbVar = bmbVar.C;
                if (lmbVar != null) {
                    lmbVar.invalidate();
                }
                hmb hmbVar = bmbVar.W;
                if (hmbVar != null && ((wb2) hmbVar).getCurrentMessagesGroup() == null && z) {
                    ((wb2) bmbVar.W).setSelectedBackgroundProgress(1.0f - bmbVar.U);
                    break;
                }
                break;
            default:
                kmc kmcVar = (kmc) obj;
                TextView[] textViewArr = kmcVar.h;
                kmcVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmcVar.invalidate();
                if (z) {
                    textViewArr[0].setAlpha(1.0f - kmcVar.s);
                    textViewArr[0].setScaleX(1.0f - kmcVar.s);
                    textViewArr[0].setScaleY(1.0f - kmcVar.s);
                    textViewArr[1].setAlpha(kmcVar.s);
                    textViewArr[1].setScaleX(kmcVar.s);
                    textViewArr[1].setScaleY(kmcVar.s);
                    break;
                }
                break;
        }
    }
}
