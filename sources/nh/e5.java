package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.th1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(a3.c cVar, View view) {
        this.a = 24;
        this.b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                m5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.e.setTranslationY(((-m5Var.d) + m5Var.getMeasuredHeight()) - m5Var.v);
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
                oh.v vVar = (oh.v) this.b;
                vVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.w));
                vVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.w));
                break;
            case 4:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.b;
                p0Var.getClass();
                p0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                th1 th1Var = (th1) this.b;
                th1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = th1Var.c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * th1Var.B));
                y0Var.requestLayout();
                break;
            case 6:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                s1Var.getClass();
                s1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 8:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.b;
                m2Var.getClass();
                m2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.b.invalidate();
                break;
            case 9:
                y2 y2Var = (y2) this.b;
                ((y3) y2Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y2Var.invalidate();
                break;
            case 10:
                org.telegram.ui.web.s1 s1Var2 = (org.telegram.ui.web.s1) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var2.R = floatValue2;
                s1Var2.S.setAlpha(floatValue2);
                s1Var2.invalidate();
                break;
            case 11:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U = floatValue3;
                m0Var.j(floatValue3);
                m0Var.V.setAlpha(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                break;
            case 12:
                ph.k kVar = (ph.k) this.b;
                kVar.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph.f fVar = kVar.f;
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
                ph.u uVar = (ph.u) this.b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.a.invalidate();
                break;
            case 14:
                ph.d2 d2Var = (ph.d2) this.b;
                d2Var.getClass();
                d2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.i();
                break;
            case 15:
                ((ph.d3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                ph.f3 f3Var = (ph.f3) this.b;
                f3Var.getClass();
                f3Var.l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                break;
            case 17:
                ((ph.r3) this.b).invalidate();
                break;
            case 18:
                ph.f5 f5Var = (ph.f5) this.b;
                f5Var.getClass();
                f5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.e();
                break;
            case 19:
                ph.e5 e5Var = (ph.e5) this.b;
                e5Var.getClass();
                e5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.invalidate();
                break;
            case 20:
                ph.y5 y5Var = (ph.y5) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.B = floatValue4;
                ph.x5 x5Var = y5Var.a;
                x5Var.setScaleX(1.0f - floatValue4);
                x5Var.setScaleY(1.0f - y5Var.B);
                y5Var.invalidate();
                break;
            case 21:
                ph.g7 g7Var = (ph.g7) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g7Var.r = floatValue5;
                Utilities.Callback callback = g7Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                g7Var.a.invalidate();
                break;
            case 22:
                ((ph.z7) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                ph.c8 c8Var = (ph.c8) this.b;
                c8Var.getClass();
                c8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ((View) ((g.a0) ((a3.c) this.b).b).d.getParent()).invalidate();
                break;
            case 25:
                vf.h hVar = (vf.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 26:
                vh.o4 o4Var = (vh.o4) this.b;
                o4Var.getClass();
                o4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.requestLayout();
                o4Var.invalidate();
                break;
            default:
                wh.n nVar = (wh.n) this.b;
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

    public /* synthetic */ e5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
