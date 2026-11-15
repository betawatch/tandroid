package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ez0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((fz0) this.b).d;
                secretMediaViewer.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((fz0) this.b).d;
                secretMediaViewer2.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sk0) this.b).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                pz0 pz0Var = (pz0) this.b;
                pz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                    break;
                }
                break;
            case 4:
                ((e01) this.b).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                f01 f01Var = (f01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f01Var.r = floatValue;
                View view = f01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    hi.q3 q3Var = f01Var.d;
                    if (q3Var != null) {
                        q3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                j11 j11Var = (j11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                z51 z51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.g.getInterpolation(j11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(j11Var.M, i7, itemsCount, 4.0f);
                    z51Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    z51Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                k31 k31Var = (k31) this.b;
                k31Var.getClass();
                k31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                j41 j41Var = (j41) this.b;
                j41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = j41Var.b;
                gVar.A0.f = floatValue3;
                j41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                t71 t71Var = (t71) this.b;
                t71Var.getClass();
                t71Var.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.z0.invalidate();
                t71Var.E0.invalidate();
                t71Var.T1.setAlpha(t71Var.q1);
                t71Var.S1.invalidate();
                t71Var.a1();
                break;
            case 10:
                t71 t71Var2 = ((i71) this.b).a;
                t71Var2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var2.z0.invalidate();
                t71Var2.E0.invalidate();
                t71Var2.T1.setAlpha(t71Var2.q1);
                t71Var2.S1.invalidate();
                t71Var2.a1();
                break;
            case 11:
                l81 l81Var = (l81) this.b;
                l81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = l81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(l81Var.a.getChildAt(i10));
                    int i11 = l81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        l81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        l81Var.a.getChildAt(i10).setAlpha(l81Var.F);
                    }
                }
                break;
            case 12:
                q81 q81Var = (q81) this.b;
                q81Var.getClass();
                q81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q81Var.invalidate();
                break;
            case 13:
                u91 u91Var = (u91) this.b;
                u91Var.getClass();
                u91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                r91 r91Var = (r91) this.b;
                r91Var.getClass();
                r91Var.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r91Var.o0();
                break;
            case 15:
                s91 s91Var = (s91) this.b;
                s91Var.getClass();
                s91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ec1 ec1Var = (ec1) this.b;
                ec1Var.getClass();
                ec1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.x();
                break;
        }
    }
}
