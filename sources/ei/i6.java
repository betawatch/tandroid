package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ch1;
import org.telegram.ui.ht0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidate();
                break;
            case 1:
                e7 e7Var = (e7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.E = floatValue;
                d7 d7Var = e7Var.a;
                d7Var.setScaleX(1.0f - floatValue);
                d7Var.setScaleY(1.0f - e7Var.E);
                e7Var.invalidate();
                break;
            case 2:
                m8 m8Var = (m8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.r = floatValue2;
                Utilities.Callback callback = m8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                m8Var.a.invalidate();
                break;
            case 3:
                ((k9) obj).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                o9 o9Var = (o9) obj;
                o9Var.getClass();
                o9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                jg.h hVar = (jg.h) obj;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 6:
                ki.u4 u4Var = (ki.u4) obj;
                u4Var.getClass();
                u4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 7:
                li.m mVar = (li.m) obj;
                sn snVar = mVar.F;
                if (snVar == null) {
                    mVar.G.invalidate();
                    break;
                } else {
                    snVar.w9();
                    if (snVar.J8 != null) {
                        snVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj;
                q0Var.getClass();
                q0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ch1 ch1Var = (ch1) obj;
                ch1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = ch1Var.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * ch1Var.E));
                z0Var.requestLayout();
                break;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                s1Var.getClass();
                s1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 12:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) obj;
                k2Var.getClass();
                k2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.b.invalidate();
                break;
            case 13:
                ci.f3 f3Var = (ci.f3) obj;
                ((ci.j4) f3Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                break;
            case 14:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.U = floatValue3;
                u1Var.V.setAlpha(floatValue3);
                u1Var.invalidate();
                break;
            case 15:
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.a0 = floatValue4;
                n0Var.j(floatValue4);
                n0Var.b0.setAlpha(n0Var.a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.a0);
                n0Var.invalidate();
                break;
            case 16:
                ((ht0) ((rg.w0) obj)).K.e0.invalidate();
                break;
            case 17:
                rg.r1 r1Var = (rg.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 18:
                rg.y1 y1Var = (rg.y1) obj;
                y1Var.getClass();
                y1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 19:
                qg.n nVar = (qg.n) obj;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 20:
                rg.m2 m2Var = (rg.m2) obj;
                m2Var.getClass();
                m2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 21:
                rg.s2 s2Var = (rg.s2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.y = floatValue5;
                ai.r rVar = s2Var.c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, s2Var.y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, s2Var.y));
                s2Var.b.invalidate();
                break;
            case 22:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue6 < 0.5f ? (floatValue6 / 0.5f) * (-7.0f) : (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 23:
                sg.q0 q0Var2 = (sg.q0) obj;
                q0Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var2.d.invalidate();
                sg.p0 p0Var = q0Var2.e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    break;
                }
                break;
            case 24:
                ((sg.x1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 25:
                ((tg.f) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 26:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 27:
                yg.h hVar2 = (yg.h) obj;
                hVar2.getClass();
                hVar2.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                zh.w wVar = (zh.w) obj;
                wVar.getClass();
                wVar.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                break;
            default:
                ((zh.f0) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
