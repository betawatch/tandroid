package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class b21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h21 h21Var = (h21) this.b;
                h21Var.y = AndroidUtilities.lerp(h21Var.E, valueAnimator.getAnimatedFraction());
                h21Var.h.setTextColor(i0.a.d(h21Var.y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                h21Var.r.setAlpha((h21Var.y / 2.0f) + 0.5f);
                break;
            case 1:
                ((y21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                x21 x21Var = (x21) this.b;
                x21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.O.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = ((t41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((t41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.wm0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                e51 e51Var = (e51) this.b;
                e51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (e51Var.S) {
                    e51Var.N.invalidate();
                    break;
                }
                break;
            case 7:
                ((s51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                r61 r61Var = (r61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61Var.r = floatValue;
                View view = r61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.vg0 vg0Var = r61Var.d;
                    if (vg0Var != null) {
                        vg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                y61 y61Var = (y61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 10:
                ((a91) this.b).actionBar.getTitlesContainer().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                fa1 fa1Var = (fa1) this.b;
                fa1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fa1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = fa1Var.b;
                gVar.z0.f = floatValue3;
                fa1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 12:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.getClass();
                rd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.x0.invalidate();
                rd1Var.C0.invalidate();
                rd1Var.R1.setAlpha(rd1Var.o1);
                rd1Var.Q1.invalidate();
                rd1Var.V0();
                break;
            case 13:
                rd1 rd1Var2 = ((fd1) this.b).a;
                rd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var2.x0.invalidate();
                rd1Var2.C0.invalidate();
                rd1Var2.R1.setAlpha(rd1Var2.o1);
                rd1Var2.Q1.invalidate();
                rd1Var2.V0();
                break;
            case 14:
                ne1 ne1Var = (ne1) this.b;
                ne1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ne1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ne1Var.a.getChildAt(i11));
                    int i12 = ne1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ne1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ne1Var.a.getChildAt(i11).setAlpha(ne1Var.E);
                    }
                }
                break;
            case 15:
                se1 se1Var = (se1) this.b;
                se1Var.getClass();
                se1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se1Var.invalidate();
                break;
            case 16:
                yf1 yf1Var = (yf1) this.b;
                yf1Var.getClass();
                yf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                vf1 vf1Var = (vf1) this.b;
                vf1Var.getClass();
                vf1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf1Var.f0();
                break;
            case 18:
                wf1 wf1Var = (wf1) this.b;
                wf1Var.getClass();
                wf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                mi1 mi1Var = (mi1) this.b;
                mi1Var.getClass();
                mi1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.G();
                break;
        }
    }
}
