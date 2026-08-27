package lh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.eh1;
import org.telegram.ui.rn;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(a9.i iVar, View view) {
        this.a = 18;
        this.b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                r2Var.getClass();
                r2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.i();
                break;
            case 1:
                ((t3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                w3 w3Var = (w3) this.b;
                w3Var.getClass();
                w3Var.k0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w3Var.invalidate();
                break;
            case 3:
                ((k4) this.b).invalidate();
                break;
            case 4:
                i6 i6Var = (i6) this.b;
                i6Var.getClass();
                i6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.e();
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                h6Var.getClass();
                h6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                break;
            case 6:
                d7 d7Var = (d7) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7Var.A = floatValue;
                c7 c7Var = d7Var.a;
                c7Var.setScaleX(1.0f - floatValue);
                c7Var.setScaleY(1.0f - d7Var.A);
                d7Var.invalidate();
                break;
            case 7:
                m8 m8Var = (m8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.r = floatValue2;
                Utilities.Callback callback = m8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                m8Var.a.invalidate();
                break;
            case 8:
                ((k9) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                n9 n9Var = (n9) this.b;
                n9Var.getClass();
                n9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.b;
                p0Var.getClass();
                p0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 11:
                eh1 eh1Var = (eh1) this.b;
                eh1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = eh1Var.c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * eh1Var.A));
                y0Var.requestLayout();
                break;
            case 12:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                s1Var.getClass();
                s1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.b;
                l2Var.getClass();
                l2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.b.invalidate();
                break;
            case 15:
                jh.y2 y2Var = (jh.y2) this.b;
                ((jh.z3) y2Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y2Var.invalidate();
                break;
            case 16:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.Q = floatValue3;
                r1Var.R.setAlpha(floatValue3);
                r1Var.invalidate();
                break;
            case 17:
                org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.T = floatValue4;
                o0Var.j(floatValue4);
                o0Var.U.setAlpha(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                break;
            case 18:
                ((View) ((g.b0) ((a9.i) this.b).b).d.getParent()).invalidate();
                break;
            case 19:
                rf.h hVar = (rf.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 20:
                rh.m4 m4Var = (rh.m4) this.b;
                m4Var.getClass();
                m4Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.requestLayout();
                m4Var.invalidate();
                break;
            case 21:
                sh.m mVar = (sh.m) this.b;
                rn rnVar = mVar.F;
                if (rnVar == null) {
                    mVar.G.invalidate();
                    break;
                } else {
                    rnVar.r9();
                    if (rnVar.F8 != null) {
                        rnVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 22:
                ((xs0) ((zf.v0) this.b)).G.a0.invalidate();
                break;
            case 23:
                zf.r1 r1Var2 = (zf.r1) this.b;
                r1Var2.getClass();
                r1Var2.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var2.invalidate();
                break;
            case 24:
                zf.y1 y1Var = (zf.y1) this.b;
                y1Var.getClass();
                y1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 25:
                yf.n nVar = (yf.n) this.b;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 26:
                zf.n2 n2Var = (zf.n2) this.b;
                n2Var.getClass();
                n2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                zf.t2 t2Var = (zf.t2) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue5;
                hh.m mVar2 = t2Var.c;
                mVar2.setAlpha(floatValue5);
                mVar2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                mVar2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                break;
        }
    }

    public /* synthetic */ m2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
