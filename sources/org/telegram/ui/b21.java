package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                SecretMediaViewer secretMediaViewer = ((r41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((r41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.wm0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                c51 c51Var = (c51) this.b;
                c51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c51Var.S) {
                    c51Var.N.invalidate();
                    break;
                }
                break;
            case 7:
                ((q51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                p61 p61Var = (p61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.r = floatValue;
                View view = p61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.vg0 vg0Var = p61Var.d;
                    if (vg0Var != null) {
                        vg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                w61 w61Var = (w61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 10:
                y81 y81Var = (y81) this.b;
                y81Var.getClass();
                y81Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                da1 da1Var = (da1) this.b;
                da1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = da1Var.b;
                gVar.z0.f = floatValue3;
                da1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 12:
                pd1 pd1Var = (pd1) this.b;
                pd1Var.getClass();
                pd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.x0.invalidate();
                pd1Var.C0.invalidate();
                pd1Var.R1.setAlpha(pd1Var.o1);
                pd1Var.Q1.invalidate();
                pd1Var.V0();
                break;
            case 13:
                pd1 pd1Var2 = ((dd1) this.b).a;
                pd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var2.x0.invalidate();
                pd1Var2.C0.invalidate();
                pd1Var2.R1.setAlpha(pd1Var2.o1);
                pd1Var2.Q1.invalidate();
                pd1Var2.V0();
                break;
            case 14:
                le1 le1Var = (le1) this.b;
                le1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = le1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(le1Var.a.getChildAt(i11));
                    int i12 = le1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        le1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        le1Var.a.getChildAt(i11).setAlpha(le1Var.E);
                    }
                }
                break;
            case 15:
                qe1 qe1Var = (qe1) this.b;
                qe1Var.getClass();
                qe1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                break;
            case 16:
                wf1 wf1Var = (wf1) this.b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                tf1 tf1Var = (tf1) this.b;
                tf1Var.getClass();
                tf1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                break;
            case 18:
                uf1 uf1Var = (uf1) this.b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ki1 ki1Var = (ki1) this.b;
                ki1Var.getClass();
                ki1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki1Var.G();
                break;
        }
    }
}
