package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.an;
import org.telegram.ui.sp0;
import org.telegram.ui.yb1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
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
                ((x3) this.b).invalidate();
                break;
            case 2:
                r5 r5Var = (r5) this.b;
                r5Var.getClass();
                r5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.e();
                break;
            case 3:
                q5 q5Var = (q5) this.b;
                q5Var.getClass();
                q5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                break;
            case 4:
                k6 k6Var = (k6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.F = floatValue;
                j6 j6Var = k6Var.a;
                j6Var.setScaleX(1.0f - floatValue);
                j6Var.setScaleY(1.0f - k6Var.F);
                k6Var.invalidate();
                break;
            case 5:
                o7 o7Var = (o7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.r = floatValue2;
                z10 z10Var = o7Var.y;
                if (z10Var != null) {
                    z10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
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
                oi.p4 p4Var = (oi.p4) this.b;
                p4Var.getClass();
                p4Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.requestLayout();
                p4Var.invalidate();
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
                    if (!(i1Var instanceof ch.k)) {
                        i1Var.a.setTranslationY(z10);
                    }
                    i1Var.e(-z10, floatValue5, i1Var.s);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.b;
                c3Var.getClass();
                c3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = c3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                c3Var.invalidate();
                break;
            case 15:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) this.b;
                i3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.j3 j3Var = i3Var.b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.b;
                b0Var.getClass();
                b0Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.e();
                break;
            case 17:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.b;
                p0Var.getClass();
                p0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 18:
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) this.b;
                r0Var.getClass();
                r0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.invalidateSelf();
                break;
            case 19:
                yb1 yb1Var = (yb1) this.b;
                yb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.b1 b1Var = yb1Var.c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * yb1Var.F));
                b1Var.requestLayout();
                break;
            case 20:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.b;
                r1Var.getClass();
                r1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 21:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.b;
                i2Var.getClass();
                i2Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2Var.b.invalidate();
                break;
            case 22:
                fi.u2 u2Var = (fi.u2) this.b;
                ((fi.v3) u2Var.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u2Var.invalidate();
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
                an anVar = kVar.F;
                if (anVar != null) {
                    anVar.O9();
                    if (anVar.Y8 != null) {
                        anVar.fragmentView.invalidate();
                        break;
                    }
                } else {
                    kVar.G.invalidate();
                    break;
                }
                break;
            case 26:
                ((sp0) ((tg.o0) this.b)).L.f0.invalidate();
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
