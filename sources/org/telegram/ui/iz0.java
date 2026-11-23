package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((jz0) this.b).d;
                secretMediaViewer.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((jz0) this.b).d;
                secretMediaViewer2.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cl0) this.b).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                uz0 uz0Var = (uz0) this.b;
                uz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uz0Var.T) {
                    uz0Var.O.invalidate();
                    break;
                }
                break;
            case 4:
                ((j01) this.b).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                k01 k01Var = (k01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.r = floatValue;
                View view = k01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    hi.p3 p3Var = k01Var.d;
                    if (p3Var != null) {
                        p3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                o11 o11Var = (o11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.g.getInterpolation(o11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.M, i7, itemsCount, 4.0f);
                    d61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    d61Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                o31 o31Var = (o31) this.b;
                o31Var.getClass();
                o31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                m41 m41Var = (m41) this.b;
                m41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = m41Var.b;
                gVar.A0.f = floatValue3;
                m41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                x71 x71Var = (x71) this.b;
                x71Var.getClass();
                x71Var.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.z0.invalidate();
                x71Var.E0.invalidate();
                x71Var.T1.setAlpha(x71Var.q1);
                x71Var.S1.invalidate();
                x71Var.a1();
                break;
            case 10:
                x71 x71Var2 = ((m71) this.b).a;
                x71Var2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var2.z0.invalidate();
                x71Var2.E0.invalidate();
                x71Var2.T1.setAlpha(x71Var2.q1);
                x71Var2.S1.invalidate();
                x71Var2.a1();
                break;
            case 11:
                p81 p81Var = (p81) this.b;
                p81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = p81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(p81Var.a.getChildAt(i10));
                    int i11 = p81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        p81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        p81Var.a.getChildAt(i10).setAlpha(p81Var.F);
                    }
                }
                break;
            case 12:
                u81 u81Var = (u81) this.b;
                u81Var.getClass();
                u81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.invalidate();
                break;
            case 13:
                y91 y91Var = (y91) this.b;
                y91Var.getClass();
                y91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                v91 v91Var = (v91) this.b;
                v91Var.getClass();
                v91Var.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var.n0();
                break;
            case 15:
                w91 w91Var = (w91) this.b;
                w91Var.getClass();
                w91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hc1 hc1Var = (hc1) this.b;
                hc1Var.getClass();
                hc1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.x();
                break;
        }
    }
}
