package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h21 h21Var = (h21) this.b;
                h21Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.a();
                break;
            case 1:
                v21 v21Var = (v21) this.b;
                v21Var.y = AndroidUtilities.lerp(v21Var.E, valueAnimator.getAnimatedFraction());
                v21Var.h.setTextColor(i0.a.d(v21Var.y, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.z6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                v21Var.r.setAlpha((v21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((l31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                k31 k31Var = (k31) this.b;
                k31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((g51) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((g51) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.gn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                r51 r51Var = (r51) this.b;
                r51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r51Var.S) {
                    r51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((h61) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                g71 g71Var = (g71) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.r = floatValue;
                View view = g71Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.jh0 jh0Var = g71Var.d;
                    if (jh0Var != null) {
                        jh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                n71 n71Var = (n71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.es.g.getInterpolation(n71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n71Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                o91.a0((o91) this.b, valueAnimator);
                break;
            case 12:
                ra1 ra1Var = (ra1) this.b;
                ra1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ra1Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = ra1Var.b;
                gVar.z0.f = floatValue3;
                ra1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                ce1 ce1Var = (ce1) this.b;
                ce1Var.getClass();
                ce1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var.x0.invalidate();
                ce1Var.C0.invalidate();
                ce1Var.R1.setAlpha(ce1Var.o1);
                ce1Var.Q1.invalidate();
                ce1Var.V0();
                break;
            case 14:
                ce1 ce1Var2 = ((qd1) this.b).a;
                ce1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var2.x0.invalidate();
                ce1Var2.C0.invalidate();
                ce1Var2.R1.setAlpha(ce1Var2.o1);
                ce1Var2.Q1.invalidate();
                ce1Var2.V0();
                break;
            case 15:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ze1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ze1Var.a.getChildAt(i11));
                    int i12 = ze1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ze1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ze1Var.a.getChildAt(i11).setAlpha(ze1Var.E);
                    }
                }
                break;
            case 16:
                ef1 ef1Var = (ef1) this.b;
                ef1Var.getClass();
                ef1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef1Var.invalidate();
                break;
            case 17:
                kg1 kg1Var = (kg1) this.b;
                kg1Var.getClass();
                kg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                hg1 hg1Var = (hg1) this.b;
                hg1Var.getClass();
                hg1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg1Var.f0();
                break;
            case 19:
                ig1 ig1Var = (ig1) this.b;
                ig1Var.getClass();
                ig1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cj1 cj1Var = (cj1) this.b;
                cj1Var.getClass();
                cj1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj1Var.F();
                break;
        }
    }
}
