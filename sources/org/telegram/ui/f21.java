package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                af1 af1Var = (af1) this.b;
                af1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = af1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(af1Var.a.getChildAt(i11));
                    int i12 = af1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        af1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        af1Var.a.getChildAt(i11).setAlpha(af1Var.E);
                    }
                }
                break;
            case 16:
                ff1 ff1Var = (ff1) this.b;
                ff1Var.getClass();
                ff1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ff1Var.invalidate();
                break;
            case 17:
                lg1 lg1Var = (lg1) this.b;
                lg1Var.getClass();
                lg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ig1 ig1Var = (ig1) this.b;
                ig1Var.getClass();
                ig1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig1Var.f0();
                break;
            case 19:
                jg1 jg1Var = (jg1) this.b;
                jg1Var.getClass();
                jg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dj1 dj1Var = (dj1) this.b;
                dj1Var.getClass();
                dj1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj1Var.F();
                break;
        }
    }
}
