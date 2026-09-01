package oh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vh1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(ja.c cVar, View view) {
        this.a = 24;
        this.b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n5 n5Var = (n5) this.b;
                n5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.e.setTranslationY(((-n5Var.d) + n5Var.getMeasuredHeight()) - n5Var.v);
                break;
            case 1:
                x6 x6Var = (x6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = x6Var.a;
                w6 w6Var = (w6) arrayList.get(x6Var.d);
                w6Var.n = floatValue;
                w6Var.invalidate();
                int i10 = x6Var.c;
                if (i10 != -1) {
                    w6 w6Var2 = (w6) arrayList.get(i10);
                    w6Var2.n = 1.0f - floatValue;
                    w6Var2.invalidate();
                    break;
                }
                break;
            case 2:
                z7 z7Var = (z7) this.b;
                z7Var.getClass();
                z7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                break;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                q0Var.getClass();
                q0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                vh1 vh1Var = (vh1) this.b;
                vh1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = vh1Var.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * vh1Var.B));
                z0Var.requestLayout();
                break;
            case 5:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.b;
                t1Var.getClass();
                t1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            case 7:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                n2Var.getClass();
                n2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.b.invalidate();
                break;
            case 8:
                z2 z2Var = (z2) this.b;
                ((a4) z2Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                break;
            case 9:
                org.telegram.ui.web.t1 t1Var2 = (org.telegram.ui.web.t1) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var2.R = floatValue2;
                t1Var2.S.setAlpha(floatValue2);
                t1Var2.invalidate();
                break;
            case 10:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U = floatValue3;
                m0Var.j(floatValue3);
                m0Var.V.setAlpha(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                break;
            case 11:
                ph.p pVar = (ph.p) this.b;
                pVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, pVar.w));
                pVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), pVar.w));
                break;
            case 12:
                qh.k kVar = (qh.k) this.b;
                kVar.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh.f fVar = kVar.f;
                fVar.getEditText().setTranslationX(AndroidUtilities.lerp(kVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), kVar.l0));
                FrameLayout frameLayout = kVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), kVar.l0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, kVar.l0));
                fVar.getEmojiButton().setAlpha(kVar.l0);
                kVar.r.setAlpha((float) Math.pow(kVar.l0, 16.0d));
                kVar.u(kVar.l0);
                zh zhVar = kVar.J;
                if (zhVar != null) {
                    zhVar.setAlpha((float) Math.pow(kVar.l0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                break;
            case 13:
                qh.u uVar = (qh.u) this.b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.a.invalidate();
                break;
            case 14:
                qh.d2 d2Var = (qh.d2) this.b;
                d2Var.getClass();
                d2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.i();
                break;
            case 15:
                ((qh.d3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                qh.f3 f3Var = (qh.f3) this.b;
                f3Var.getClass();
                f3Var.l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                break;
            case 17:
                ((qh.r3) this.b).invalidate();
                break;
            case 18:
                qh.e5 e5Var = (qh.e5) this.b;
                e5Var.getClass();
                e5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.e();
                break;
            case 19:
                qh.d5 d5Var = (qh.d5) this.b;
                d5Var.getClass();
                d5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.invalidate();
                break;
            case 20:
                qh.w5 w5Var = (qh.w5) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.B = floatValue4;
                qh.v5 v5Var = w5Var.a;
                v5Var.setScaleX(1.0f - floatValue4);
                v5Var.setScaleY(1.0f - w5Var.B);
                w5Var.invalidate();
                break;
            case 21:
                qh.e7 e7Var = (qh.e7) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.r = floatValue5;
                Utilities.Callback callback = e7Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                e7Var.a.invalidate();
                break;
            case 22:
                ((qh.x7) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                qh.a8 a8Var = (qh.a8) this.b;
                a8Var.getClass();
                a8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ((View) ((g.a0) ((ja.c) this.b).a).d.getParent()).invalidate();
                break;
            case 25:
                wf.h hVar = (wf.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 26:
                wh.o4 o4Var = (wh.o4) this.b;
                o4Var.getClass();
                o4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.requestLayout();
                o4Var.invalidate();
                break;
            default:
                xh.n nVar = (xh.n) this.b;
                xn xnVar = nVar.F;
                if (xnVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    xnVar.r9();
                    if (xnVar.G8 != null) {
                        xnVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
