package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.kh1;
import org.telegram.ui.ot0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((k4) obj).invalidate();
                break;
            case 1:
                i6 i6Var = (i6) obj;
                i6Var.getClass();
                i6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.e();
                break;
            case 2:
                h6 h6Var = (h6) obj;
                h6Var.getClass();
                h6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                break;
            case 3:
                b7 b7Var = (b7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var.E = floatValue;
                a7 a7Var = b7Var.a;
                a7Var.setScaleX(1.0f - floatValue);
                a7Var.setScaleY(1.0f - b7Var.E);
                b7Var.invalidate();
                break;
            case 4:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.r = floatValue2;
                Utilities.Callback callback = i8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                i8Var.a.invalidate();
                break;
            case 5:
                ((g9) obj).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                k9 k9Var = (k9) obj;
                k9Var.getClass();
                k9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                hi.p pVar = (hi.p) obj;
                pVar.getClass();
                pVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.a();
                pVar.requestLayout();
                break;
            case 8:
                kg.i iVar = (kg.i) obj;
                iVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.g.a.invalidate();
                break;
            case 9:
                li.u4 u4Var = (li.u4) obj;
                u4Var.getClass();
                u4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 10:
                mi.m mVar = (mi.m) obj;
                wn wnVar = mVar.F;
                if (wnVar == null) {
                    mVar.G.invalidate();
                    break;
                } else {
                    wnVar.C9();
                    if (wnVar.Z8 != null) {
                        wnVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj;
                q0Var.getClass();
                q0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                kh1 kh1Var = (kh1) obj;
                kh1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = kh1Var.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * kh1Var.E));
                z0Var.requestLayout();
                break;
            case 13:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) obj;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) obj;
                v1Var.getClass();
                v1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                break;
            case 15:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.getClass();
                n2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.b.invalidate();
                break;
            case 16:
                di.f3 f3Var = (di.f3) obj;
                ((di.k4) f3Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                break;
            case 17:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.U = floatValue3;
                u1Var.V.setAlpha(floatValue3);
                u1Var.invalidate();
                break;
            case 18:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.a0 = floatValue4;
                l0Var.j(floatValue4);
                l0Var.b0.setAlpha(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 19:
                ((ot0) ((sg.w0) obj)).K.e0.invalidate();
                break;
            case 20:
                sg.s1 s1Var = (sg.s1) obj;
                s1Var.getClass();
                s1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 21:
                sg.z1 z1Var = (sg.z1) obj;
                z1Var.getClass();
                z1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                break;
            case 22:
                rg.n nVar = (rg.n) obj;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 23:
                sg.o2 o2Var = (sg.o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 24:
                sg.u2 u2Var = (sg.u2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.y = floatValue5;
                bi.r rVar = u2Var.c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                u2Var.b.invalidate();
                break;
            case 25:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.o0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue6 < 0.5f ? (floatValue6 / 0.5f) * (-7.0f) : (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 26:
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f.invalidate();
                tg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            case 27:
                ((tg.x1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 28:
                ((ug.f) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                vg.b bVar = (vg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
        }
    }
}
