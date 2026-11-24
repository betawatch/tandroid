// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ae0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ae0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kb0) obj).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                gr0 gr0Var = (gr0) obj;
                gr0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr0Var.f.invalidate();
                break;
            case 2:
                mu1 mu1Var = (mu1) obj;
                mu1Var.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.m1.invalidate();
                break;
            case 3:
                pk2 pk2Var = (pk2) obj;
                pk2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk2Var.p.invalidate();
                break;
            case 4:
                cj3 cj3Var = (cj3) obj;
                cj3Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = cj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 5:
                cp3 cp3Var = (cp3) obj;
                cp3Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cp3Var.I = true;
                cp3Var.invalidate();
                break;
            case 6:
                ns9 ns9Var = ((ir5) obj).e.n1;
                int i = ns9Var.D1;
                if (i != -1 && (view = ns9Var.E1) != null) {
                    ns9Var.l1(i, view);
                    ns9Var.invalidate();
                    break;
                }
                break;
            case 7:
                ((es5) obj).y = valueAnimator.getAnimatedFraction();
                break;
            case 8:
                MediaController mediaController = (MediaController) obj;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.m0();
                break;
            case 9:
                qa7 qa7Var = (qa7) obj;
                qa7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa7Var.invalidate();
                int i2 = 0;
                while (i2 < 2) {
                    qa7Var.c[i2].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.c[i2].setVisibility(0);
                    float f = 0.0f;
                    qa7Var.c[i2].setAlpha(gl.R1(i2 == 0 ? 1.0f : 0.0f, i2 == 1 ? 1.0f : 0.0f, qa7Var.e));
                    qa7Var.d[i2].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.d[i2].setVisibility(0);
                    TextView textView = qa7Var.d[i2];
                    float f2 = i2 == 0 ? 1.0f : 0.0f;
                    if (i2 == 1) {
                        f = 1.0f;
                    }
                    textView.setAlpha(gl.R1(f2, f, qa7Var.e));
                    i2++;
                }
                break;
            case 10:
                ah8 ah8Var = (ah8) obj;
                ah8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah8Var.e();
                break;
            case 11:
                ((xg8) obj).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                nz9 nz9Var = (nz9) obj;
                nz9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz9Var.invalidate();
                break;
            case 13:
                qfa qfaVar = (qfa) obj;
                qfaVar.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qfaVar.invalidate();
                break;
            case 14:
                ima imaVar = (ima) obj;
                imaVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imaVar.I = true;
                imaVar.invalidate();
                break;
            case 15:
                ((qmb) obj).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                wec wecVar = (wec) obj;
                View[] viewArr = wecVar.e;
                if (wecVar.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    wecVar.c = abs;
                    mec mecVar = wecVar.N;
                    if (mecVar != null) {
                        mecVar.f(abs, wecVar.d, wecVar.b);
                    }
                }
                wecVar.x(false);
                break;
            default:
                pfc pfcVar = (pfc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pfcVar.K = floatValue;
                ofc ofcVar = pfcVar.j0;
                if (ofcVar != null) {
                    ((rfc) ofcVar).b.e0.d(pfcVar.Q, floatValue);
                }
                pfcVar.invalidate();
                break;
        }
    }
}
