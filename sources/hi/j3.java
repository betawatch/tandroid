package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.b;
                l3Var.getClass();
                l3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l3Var.invalidate();
                break;
            case 1:
                ((w3) this.b).invalidate();
                break;
            case 2:
                o5 o5Var = (o5) this.b;
                o5Var.getClass();
                o5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.e();
                break;
            case 3:
                n5 n5Var = (n5) this.b;
                n5Var.getClass();
                n5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.invalidate();
                break;
            case 4:
                i6 i6Var = (i6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.F = floatValue;
                h6 h6Var = i6Var.a;
                h6Var.setScaleX(1.0f - floatValue);
                h6Var.setScaleY(1.0f - i6Var.F);
                i6Var.invalidate();
                break;
            case 5:
                n7 n7Var = (n7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.r = floatValue2;
                x10 x10Var = n7Var.y;
                if (x10Var != null) {
                    x10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                n7Var.a.invalidate();
                break;
            case 6:
                ((k8) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                m8 m8Var = (m8) this.b;
                m8Var.getClass();
                m8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                lg.h hVar = (lg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 9:
                oi.s4 s4Var = (oi.s4) this.b;
                s4Var.getClass();
                s4Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.requestLayout();
                s4Var.invalidate();
                break;
            case 10:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.b;
                v0Var.getClass();
                v0Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
            case 11:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                y0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                break;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
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
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, i1Var.q, i1Var.p * floatValue5);
                    if (!(i1Var instanceof ch.l)) {
                        i1Var.a.setTranslationY(z10);
                    }
                    i1Var.e(-z10, floatValue5, i1Var.s);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.getClass();
                f3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = f3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                f3Var.invalidate();
                break;
            case 15:
                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) this.b;
                l3Var2.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.m3 m3Var = l3Var2.b;
                if (m3Var != null) {
                    m3Var.invalidate();
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
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                q0Var.getClass();
                q0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.invalidateSelf();
                break;
            case 19:
                bc1 bc1Var = (bc1) this.b;
                bc1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.a1 a1Var = bc1Var.c;
                a1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * bc1Var.F));
                a1Var.requestLayout();
                break;
            case 20:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.b;
                q1Var.getClass();
                q1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 21:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.b;
                h2Var.getClass();
                h2Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.b.invalidate();
                break;
            case 22:
                fi.s2 s2Var = (fi.s2) this.b;
                ((fi.t3) s2Var.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                s2Var.invalidate();
                break;
            case 23:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.V = floatValue6;
                j1Var.W.setAlpha(floatValue6);
                j1Var.invalidate();
                break;
            case 24:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.b0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.c0.setAlpha(l0Var.b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.b0);
                l0Var.invalidate();
                break;
            case 25:
                pi.k kVar = (pi.k) this.b;
                bn bnVar = kVar.F;
                if (bnVar != null) {
                    bnVar.O9();
                    if (bnVar.Z8 != null) {
                        bnVar.fragmentView.invalidate();
                        break;
                    }
                } else {
                    kVar.G.invalidate();
                    break;
                }
                break;
            case 26:
                ((up0) ((tg.p0) this.b)).L.f0.invalidate();
                break;
            case 27:
                tg.i1 i1Var2 = (tg.i1) this.b;
                i1Var2.getClass();
                i1Var2.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var2.invalidate();
                break;
            case 28:
                tg.q1 q1Var2 = (tg.q1) this.b;
                q1Var2.getClass();
                q1Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var2.invalidate();
                break;
            default:
                sg.i iVar = (sg.i) this.b;
                iVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                break;
        }
    }
}
