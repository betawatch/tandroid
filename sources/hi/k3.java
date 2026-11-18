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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                m3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m3Var.invalidate();
                break;
            case 1:
                ((x3) this.b).invalidate();
                break;
            case 2:
                p5 p5Var = (p5) this.b;
                p5Var.getClass();
                p5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.e();
                break;
            case 3:
                o5 o5Var = (o5) this.b;
                o5Var.getClass();
                o5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                break;
            case 4:
                j6 j6Var = (j6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.F = floatValue;
                i6 i6Var = j6Var.a;
                i6Var.setScaleX(1.0f - floatValue);
                i6Var.setScaleY(1.0f - j6Var.F);
                j6Var.invalidate();
                break;
            case 5:
                o7 o7Var = (o7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.r = floatValue2;
                x10 x10Var = o7Var.y;
                if (x10Var != null) {
                    x10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                o7Var.a.invalidate();
                break;
            case 6:
                ((l8) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                n8 n8Var = (n8) this.b;
                n8Var.getClass();
                n8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                lg.h hVar = (lg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 9:
                oi.r4 r4Var = (oi.r4) this.b;
                r4Var.getClass();
                r4Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r4Var.requestLayout();
                r4Var.invalidate();
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
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.e1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-6.0f));
                        childAt.setAlpha(s5 * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.j1 j1Var = (org.telegram.ui.ActionBar.j1) this.b;
                if (!j1Var.e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (j1Var.r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, j1Var.q, j1Var.p * floatValue5);
                    if (!(j1Var instanceof ch.l)) {
                        j1Var.a.setTranslationY(z10);
                    }
                    j1Var.e(-z10, floatValue5, j1Var.s);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                g3Var.getClass();
                g3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = g3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                g3Var.invalidate();
                break;
            case 15:
                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) this.b;
                m3Var2.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.n3 n3Var = m3Var2.b;
                if (n3Var != null) {
                    n3Var.invalidate();
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
                org.telegram.ui.web.j1 j1Var2 = (org.telegram.ui.web.j1) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var2.V = floatValue6;
                j1Var2.W.setAlpha(floatValue6);
                j1Var2.invalidate();
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
                ((up0) ((tg.o0) this.b)).L.f0.invalidate();
                break;
            case 27:
                tg.h1 h1Var = (tg.h1) this.b;
                h1Var.getClass();
                h1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                break;
            case 28:
                tg.o1 o1Var = (tg.o1) this.b;
                o1Var.getClass();
                o1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                break;
            default:
                sg.i iVar = (sg.i) this.b;
                iVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                break;
        }
    }
}
