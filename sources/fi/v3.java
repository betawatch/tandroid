package fi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.an;
import org.telegram.ui.tp0;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((b4) this.b).invalidate();
                break;
            case 1:
                s5 s5Var = (s5) this.b;
                s5Var.getClass();
                s5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.e();
                break;
            case 2:
                r5 r5Var = (r5) this.b;
                r5Var.getClass();
                r5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.invalidate();
                break;
            case 3:
                l6 l6Var = (l6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.E = floatValue;
                k6 k6Var = l6Var.a;
                k6Var.setScaleX(1.0f - floatValue);
                k6Var.setScaleY(1.0f - l6Var.E);
                l6Var.invalidate();
                break;
            case 4:
                p7 p7Var = (p7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.r = floatValue2;
                c20 c20Var = p7Var.y;
                if (c20Var != null) {
                    c20Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                p7Var.a.invalidate();
                break;
            case 5:
                ((n8) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                p8 p8Var = (p8) this.b;
                p8Var.getClass();
                p8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                lg.h hVar = (lg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 8:
                li.s4 s4Var = (li.s4) this.b;
                s4Var.getClass();
                s4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.requestLayout();
                s4Var.invalidate();
                break;
            case 9:
                mi.l lVar = (mi.l) this.b;
                an anVar = lVar.F;
                if (anVar != null) {
                    anVar.M9();
                    if (anVar.X8 != null) {
                        anVar.fragmentView.invalidate();
                        break;
                    }
                } else {
                    lVar.G.invalidate();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.b;
                w0Var.getClass();
                w0Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                break;
            case 11:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                z0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                break;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-6.0f));
                        childAt.setAlpha(s5 * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.b;
                if (!i1Var.e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (i1Var.r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z9 = (int) com.google.android.recaptcha.internal.a.z(1.0f, floatValue5, i1Var.q, i1Var.p * floatValue5);
                    if (!(i1Var instanceof ch.k)) {
                        i1Var.a.setTranslationY(z9);
                    }
                    i1Var.e(-z9, floatValue5, i1Var.s);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.b;
                d3Var.getClass();
                d3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = d3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                d3Var.invalidate();
                break;
            case 15:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.b;
                j3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.k3 k3Var = j3Var.b;
                if (k3Var != null) {
                    k3Var.invalidate();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.b;
                a0Var.getClass();
                a0Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.e();
                break;
            case 17:
                org.telegram.ui.Components.voip.o0 o0Var = (org.telegram.ui.Components.voip.o0) this.b;
                o0Var.getClass();
                o0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 18:
                zb1 zb1Var = (zb1) this.b;
                zb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.x0 x0Var = zb1Var.c;
                x0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * zb1Var.E));
                x0Var.requestLayout();
                break;
            case 19:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                n1Var.getClass();
                n1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                break;
            case 20:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.b;
                e2Var.getClass();
                e2Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.b.invalidate();
                break;
            case 21:
                di.z2 z2Var = (di.z2) this.b;
                ((di.c4) z2Var.K1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                break;
            case 22:
                org.telegram.ui.web.k1 k1Var = (org.telegram.ui.web.k1) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.U = floatValue6;
                k1Var.V.setAlpha(floatValue6);
                k1Var.invalidate();
                break;
            case 23:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.a0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.b0.setAlpha(l0Var.a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 24:
                ((tp0) ((tg.o0) this.b)).K.e0.invalidate();
                break;
            case 25:
                tg.h1 h1Var = (tg.h1) this.b;
                h1Var.getClass();
                h1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                break;
            case 26:
                tg.o1 o1Var = (tg.o1) this.b;
                o1Var.getClass();
                o1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                break;
            case 27:
                sg.i iVar = (sg.i) this.b;
                iVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                break;
            case 28:
                tg.c2 c2Var = (tg.c2) this.b;
                c2Var.getClass();
                c2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                tg.i2 i2Var = (tg.i2) this.b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2Var.D = floatValue8;
                bi.t tVar = i2Var.c;
                tVar.setAlpha(floatValue8);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.b.invalidate();
                break;
        }
    }
}
