package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.bn;
import org.telegram.ui.up0;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.b;
                u3Var.getClass();
                u3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u3Var.invalidate();
                break;
            case 1:
                ((g4) this.b).invalidate();
                break;
            case 2:
                z5 z5Var = (z5) this.b;
                z5Var.getClass();
                z5Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.e();
                break;
            case 3:
                y5 y5Var = (y5) this.b;
                y5Var.getClass();
                y5Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.invalidate();
                break;
            case 4:
                s6 s6Var = (s6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.F = floatValue;
                r6 r6Var = s6Var.a;
                r6Var.setScaleX(1.0f - floatValue);
                r6Var.setScaleY(1.0f - s6Var.F);
                s6Var.invalidate();
                break;
            case 5:
                i8 i8Var = (i8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.r = floatValue2;
                w10 w10Var = i8Var.y;
                if (w10Var != null) {
                    w10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                i8Var.a.invalidate();
                break;
            case 6:
                ((f9) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                h9 h9Var = (h9) this.b;
                h9Var.getClass();
                h9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.b;
                l3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.m3 m3Var = l3Var.b;
                if (m3Var != null) {
                    m3Var.invalidate();
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
                zb1 zb1Var = (zb1) this.b;
                zb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.b1 b1Var = zb1Var.c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * zb1Var.F));
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
                ((up0) ((tg.t0) this.b)).L.f0.invalidate();
                break;
            case 27:
                tg.m1 m1Var = (tg.m1) this.b;
                m1Var.getClass();
                m1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                break;
            case 28:
                tg.t1 t1Var = (tg.t1) this.b;
                t1Var.getClass();
                t1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            default:
                sg.i iVar = (sg.i) this.b;
                iVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                break;
        }
    }
}
