package gi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.kp0;
import org.telegram.ui.sb1;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i3) {
        this.a = i3;
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
                ((y3) this.b).invalidate();
                break;
            case 2:
                q5 q5Var = (q5) this.b;
                q5Var.getClass();
                q5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.e();
                break;
            case 3:
                p5 p5Var = (p5) this.b;
                p5Var.getClass();
                p5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                break;
            case 4:
                m6 m6Var = (m6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.F = floatValue;
                l6 l6Var = m6Var.a;
                l6Var.setScaleX(1.0f - floatValue);
                l6Var.setScaleY(1.0f - m6Var.F);
                m6Var.invalidate();
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.r = floatValue2;
                u10 u10Var = p7Var.y;
                if (u10Var != null) {
                    u10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                p7Var.a.invalidate();
                break;
            case 6:
                ((o8) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                q8 q8Var = (q8) this.b;
                q8Var.getClass();
                q8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                mg.h hVar = (mg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 9:
                mi.t4 t4Var = (mi.t4) this.b;
                t4Var.getClass();
                t4Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t4Var.requestLayout();
                t4Var.invalidate();
                break;
            case 10:
                ni.l lVar = (ni.l) this.b;
                wm wmVar = lVar.F;
                if (wmVar != null) {
                    wmVar.M9();
                    if (wmVar.Y8 != null) {
                        wmVar.fragmentView.invalidate();
                        break;
                    }
                } else {
                    lVar.G.invalidate();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.b;
                v0Var.getClass();
                v0Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
            case 12:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                y0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                break;
            case 13:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.c1)) {
                        float s6 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.w ? (itemsCount - 1) - i3 : i3, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-6.0f));
                        childAt.setAlpha(s6 * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.b;
                if (!h1Var.e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (h1Var.r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float y9 = (int) com.google.android.recaptcha.internal.a.y(1.0f, floatValue5, h1Var.q, h1Var.p * floatValue5);
                    if (!(h1Var instanceof dh.k)) {
                        h1Var.a.setTranslationY(y9);
                    }
                    h1Var.e(-y9, floatValue5, h1Var.s);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.b;
                b3Var.getClass();
                b3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = b3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                b3Var.invalidate();
                break;
            case 16:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) this.b;
                i3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.j3 j3Var = i3Var.b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.b;
                b0Var.getClass();
                b0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 18:
                sb1 sb1Var = (sb1) this.b;
                sb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.j0 j0Var = sb1Var.c;
                j0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * sb1Var.F));
                j0Var.requestLayout();
                break;
            case 19:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                s0Var.getClass();
                s0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.b;
                c1Var.getClass();
                c1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                break;
            case 21:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.b;
                u1Var.getClass();
                u1Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.b.invalidate();
                break;
            case 22:
                ei.c3 c3Var = (ei.c3) this.b;
                ((ei.d4) c3Var.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c3Var.invalidate();
                break;
            case 23:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var.V = floatValue6;
                i1Var.W.setAlpha(floatValue6);
                i1Var.invalidate();
                break;
            case 24:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.b0 = floatValue7;
                m0Var.j(floatValue7);
                m0Var.c0.setAlpha(m0Var.b0);
                m0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * m0Var.b0);
                m0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * m0Var.b0);
                m0Var.invalidate();
                break;
            case 25:
                ((kp0) ((ug.n0) this.b)).L.f0.invalidate();
                break;
            case 26:
                ug.g1 g1Var = (ug.g1) this.b;
                g1Var.getClass();
                g1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.invalidate();
                break;
            case 27:
                ug.o1 o1Var = (ug.o1) this.b;
                o1Var.getClass();
                o1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                break;
            case 28:
                tg.i iVar = (tg.i) this.b;
                iVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                break;
            default:
                ug.c2 c2Var = (ug.c2) this.b;
                c2Var.getClass();
                c2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
