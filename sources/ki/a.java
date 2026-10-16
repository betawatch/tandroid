package ki;

import android.animation.ValueAnimator;
import android.view.View;
import bi.b4;
import bi.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.q0;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.z0;
import org.telegram.ui.ee;
import org.telegram.ui.fo;
import org.telegram.ui.fu0;
import org.telegram.ui.m0;
import org.telegram.ui.vi1;
import org.telegram.ui.web.v1;
import org.telegram.ui.x00;
import rg.a2;
import rg.p2;
import rg.t1;
import rg.v2;
import rg.y0;
import sg.o0;
import sg.x1;
import zh.d7;
import zh.e8;
import zh.k2;
import zh.l2;
import zh.r3;
import zh.s2;
import zh.v3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k2 k2Var;
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                fo foVar = nVar.F;
                if (foVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    foVar.w9();
                    if (foVar.J8 != null) {
                        foVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                q0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                vi1 vi1Var = (vi1) obj;
                vi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = vi1Var.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * vi1Var.E));
                z0Var.requestLayout();
                break;
            case 3:
                h1 h1Var = (h1) obj;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                s1 s1Var = (s1) obj;
                s1Var.getClass();
                s1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 5:
                org.telegram.ui.Components.voip.k2 k2Var2 = (org.telegram.ui.Components.voip.k2) obj;
                k2Var2.getClass();
                k2Var2.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var2.b.invalidate();
                break;
            case 6:
                b4 b4Var = (b4) obj;
                ((k5) b4Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                b4Var.invalidate();
                break;
            case 7:
                v1 v1Var = (v1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.U = floatValue;
                v1Var.V.setAlpha(floatValue);
                v1Var.invalidate();
                break;
            case 8:
                m0 m0Var = (m0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.a0 = floatValue2;
                m0Var.j(floatValue2);
                m0Var.b0.setAlpha(m0Var.a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.a0);
                m0Var.invalidate();
                break;
            case 9:
                ((fu0) ((y0) obj)).K.e0.invalidate();
                break;
            case 10:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                t1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            case 11:
                a2 a2Var = (a2) obj;
                a2Var.getClass();
                a2Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.invalidate();
                break;
            case 12:
                qg.n nVar2 = (qg.n) obj;
                nVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.invalidate();
                break;
            case 13:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                p2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 14:
                v2 v2Var = (v2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.y = floatValue3;
                ee eeVar = v2Var.c;
                eeVar.setAlpha(floatValue3);
                eeVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                eeVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                v2Var.b.invalidate();
                break;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue4 < 0.5f ? (floatValue4 / 0.5f) * (-7.0f) : (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 16:
                sg.q0 q0Var2 = (sg.q0) obj;
                q0Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var2.d.invalidate();
                o0 o0Var = q0Var2.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            case 17:
                ((x1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 18:
                ((tg.f) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 19:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 20:
                yg.i iVar = (yg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 21:
                r3 r3Var = (r3) obj;
                r3Var.Z0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.U1();
                break;
            case 22:
                ((s2) obj).h.invalidate();
                break;
            case 23:
                l2 l2Var = (l2) obj;
                l2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (k2Var = l2Var.H) != null && (z10 = k2Var.l) && z10) {
                    k2Var.l = false;
                    k2Var.b();
                }
                l2Var.invalidate();
                break;
            case 24:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 25:
                v3 v3Var = (v3) obj;
                v3Var.getClass();
                v3Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                break;
            case 26:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x00 x00Var = ((d7) obj).c;
                x00Var.setScaleX(floatValue6);
                x00Var.setScaleY(floatValue6);
                break;
            default:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                break;
        }
    }
}
