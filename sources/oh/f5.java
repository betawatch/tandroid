package oh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.bi1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                bi1 bi1Var = (bi1) this.b;
                bi1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = bi1Var.c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * bi1Var.B));
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
                qh.c2 c2Var = (qh.c2) this.b;
                c2Var.getClass();
                c2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.i();
                break;
            case 15:
                ((qh.c3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                qh.e3 e3Var = (qh.e3) this.b;
                e3Var.getClass();
                e3Var.l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e3Var.invalidate();
                break;
            case 17:
                ((qh.q3) this.b).invalidate();
                break;
            case 18:
                qh.d5 d5Var = (qh.d5) this.b;
                d5Var.getClass();
                d5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.e();
                break;
            case 19:
                qh.c5 c5Var = (qh.c5) this.b;
                c5Var.getClass();
                c5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.invalidate();
                break;
            case 20:
                qh.v5 v5Var = (qh.v5) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.B = floatValue4;
                qh.u5 u5Var = v5Var.a;
                u5Var.setScaleX(1.0f - floatValue4);
                u5Var.setScaleY(1.0f - v5Var.B);
                v5Var.invalidate();
                break;
            case 21:
                qh.d7 d7Var = (qh.d7) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7Var.r = floatValue5;
                Utilities.Callback callback = d7Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                d7Var.a.invalidate();
                break;
            case 22:
                ((qh.w7) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                qh.z7 z7Var2 = (qh.z7) this.b;
                z7Var2.getClass();
                z7Var2.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
