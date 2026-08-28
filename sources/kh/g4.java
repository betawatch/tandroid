package kh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fh1;
import org.telegram.ui.qn;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g4(fa.c cVar, View view) {
        this.a = 17;
        this.b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ((m4) obj).invalidate();
                break;
            case 1:
                k6 k6Var = (k6) obj;
                k6Var.getClass();
                k6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.e();
                break;
            case 2:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidate();
                break;
            case 3:
                e7 e7Var = (e7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.A = floatValue;
                d7 d7Var = e7Var.a;
                d7Var.setScaleX(1.0f - floatValue);
                d7Var.setScaleY(1.0f - e7Var.A);
                e7Var.invalidate();
                break;
            case 4:
                n8 n8Var = (n8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.r = floatValue2;
                Utilities.Callback callback = n8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                n8Var.a.invalidate();
                break;
            case 5:
                ((n9) obj).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                q9 q9Var = (q9) obj;
                q9Var.getClass();
                q9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) obj;
                p0Var.getClass();
                p0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                fh1 fh1Var = (fh1) obj;
                fh1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = fh1Var.c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * fh1Var.A));
                y0Var.requestLayout();
                break;
            case 9:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                s1Var.getClass();
                s1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) obj;
                l2Var.getClass();
                l2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.b.invalidate();
                break;
            case 12:
                ih.z2 z2Var = (ih.z2) obj;
                ((ih.d4) z2Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                break;
            case 13:
                org.telegram.ui.web.q1 q1Var = (org.telegram.ui.web.q1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.Q = floatValue3;
                q1Var.R.setAlpha(floatValue3);
                q1Var.invalidate();
                break;
            case 14:
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.T = floatValue4;
                n0Var.j(floatValue4);
                n0Var.U.setAlpha(n0Var.T);
                n0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.T);
                n0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.T);
                n0Var.invalidate();
                break;
            case 15:
                qf.h hVar = (qf.h) obj;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 16:
                qh.l4 l4Var = (qh.l4) obj;
                l4Var.getClass();
                l4Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4Var.requestLayout();
                l4Var.invalidate();
                break;
            case 17:
                ((View) ((g.a0) ((fa.c) obj).b).d.getParent()).invalidate();
                break;
            case 18:
                rh.m mVar = (rh.m) obj;
                qn qnVar = mVar.F;
                if (qnVar == null) {
                    mVar.G.invalidate();
                    break;
                } else {
                    qnVar.r9();
                    if (qnVar.F8 != null) {
                        qnVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 19:
                ((ws0) ((yf.v0) obj)).G.a0.invalidate();
                break;
            case 20:
                yf.r1 r1Var = (yf.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 21:
                yf.y1 y1Var = (yf.y1) obj;
                y1Var.getClass();
                y1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 22:
                xf.n nVar = (xf.n) obj;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 23:
                yf.m2 m2Var = (yf.m2) obj;
                m2Var.getClass();
                m2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 24:
                yf.t2 t2Var = (yf.t2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue5;
                gh.m mVar2 = t2Var.c;
                mVar2.setAlpha(floatValue5);
                mVar2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                mVar2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                break;
            case 25:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.h0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.U = floatValue6 < 0.5f ? (floatValue6 / 0.5f) * (-7.0f) : (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 26:
                zf.p0 p0Var2 = (zf.p0) obj;
                p0Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var2.d.invalidate();
                zf.o0 o0Var = p0Var2.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            default:
                ((zf.w1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }

    public /* synthetic */ g4(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
