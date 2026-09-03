package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.bi1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(bb.b bVar, View view) {
        this.a = 24;
        this.b = bVar;
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
                bi1 bi1Var = (bi1) this.b;
                bi1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = bi1Var.c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * bi1Var.B));
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
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.R = floatValue2;
                u1Var.S.setAlpha(floatValue2);
                u1Var.invalidate();
                break;
            case 11:
                org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.U = floatValue3;
                o0Var.j(floatValue3);
                o0Var.V.setAlpha(o0Var.U);
                o0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.U);
                o0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.U);
                o0Var.invalidate();
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
                ph.x5 x5Var = (ph.x5) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.B = floatValue4;
                ph.w5 w5Var = x5Var.a;
                w5Var.setScaleX(1.0f - floatValue4);
                w5Var.setScaleY(1.0f - x5Var.B);
                x5Var.invalidate();
                break;
            case 21:
                ph.f7 f7Var = (ph.f7) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var.r = floatValue5;
                Utilities.Callback callback = f7Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                f7Var.a.invalidate();
                break;
            case 22:
                ((ph.y7) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                ph.b8 b8Var = (ph.b8) this.b;
                b8Var.getClass();
                b8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ((View) ((g.a0) ((bb.b) this.b).b).d.getParent()).invalidate();
                break;
            case 25:
                vf.h hVar = (vf.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 26:
                vh.p4 p4Var = (vh.p4) this.b;
                p4Var.getClass();
                p4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.requestLayout();
                p4Var.invalidate();
                break;
            default:
                wh.n nVar = (wh.n) this.b;
                zn znVar = nVar.F;
                if (znVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    znVar.r9();
                    if (znVar.G8 != null) {
                        znVar.fragmentView.invalidate();
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
