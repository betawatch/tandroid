package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((iz0) this.b).d;
                secretMediaViewer.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((iz0) this.b).d;
                secretMediaViewer2.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cl0) this.b).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                sz0 sz0Var = (sz0) this.b;
                sz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                    break;
                }
                break;
            case 4:
                ((h01) this.b).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                i01 i01Var = (i01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.r = floatValue;
                View view = i01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    hi.y3 y3Var = i01Var.d;
                    if (y3Var != null) {
                        y3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                m11 m11Var = (m11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                b61 b61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.kr.g.getInterpolation(m11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.M, i7, itemsCount, 4.0f);
                    b61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    b61Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                n31 n31Var = (n31) this.b;
                n31Var.getClass();
                n31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                l41 l41Var = (l41) this.b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.b;
                gVar.A0.f = floatValue3;
                l41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                v71 v71Var = (v71) this.b;
                v71Var.getClass();
                v71Var.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.z0.invalidate();
                v71Var.E0.invalidate();
                v71Var.T1.setAlpha(v71Var.q1);
                v71Var.S1.invalidate();
                v71Var.a1();
                break;
            case 10:
                v71 v71Var2 = ((k71) this.b).a;
                v71Var2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var2.z0.invalidate();
                v71Var2.E0.invalidate();
                v71Var2.T1.setAlpha(v71Var2.q1);
                v71Var2.S1.invalidate();
                v71Var2.a1();
                break;
            case 11:
                n81 n81Var = (n81) this.b;
                n81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = n81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(n81Var.a.getChildAt(i10));
                    int i11 = n81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        n81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        n81Var.a.getChildAt(i10).setAlpha(n81Var.F);
                    }
                }
                break;
            case 12:
                s81 s81Var = (s81) this.b;
                s81Var.getClass();
                s81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s81Var.invalidate();
                break;
            case 13:
                w91 w91Var = (w91) this.b;
                w91Var.getClass();
                w91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                t91 t91Var = (t91) this.b;
                t91Var.getClass();
                t91Var.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.o0();
                break;
            case 15:
                u91 u91Var = (u91) this.b;
                u91Var.getClass();
                u91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fc1 fc1Var = (fc1) this.b;
                fc1Var.getClass();
                fc1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.x();
                break;
        }
    }
}
