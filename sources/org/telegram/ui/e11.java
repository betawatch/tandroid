package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g11 g11Var = (g11) this.b;
                g11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.b();
                break;
            case 1:
                u11 u11Var = (u11) this.b;
                u11Var.y = AndroidUtilities.lerp(u11Var.E, valueAnimator.getAnimatedFraction());
                u11Var.h.setTextColor(i0.a.f(u11Var.y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                u11Var.r.setAlpha((u11Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                SecretMediaViewer secretMediaViewer = ((o31) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((o31) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                z31 z31Var = (z31) this.b;
                z31Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z31Var.S) {
                    z31Var.N.invalidate();
                    break;
                }
                break;
            case 6:
                ((p41) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 7:
                o51 o51Var = (o51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.r = floatValue;
                View view = o51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.dh0 dh0Var = o51Var.d;
                    if (dh0Var != null) {
                        dh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                v51 v51Var = (v51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(v51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 9:
                z71.a0((z71) this.b, valueAnimator);
                break;
            case 10:
                b91 b91Var = (b91) this.b;
                b91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b91Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = b91Var.b;
                gVar.z0.f = floatValue3;
                b91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 11:
                mc1 mc1Var = (mc1) this.b;
                mc1Var.getClass();
                mc1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var.x0.invalidate();
                mc1Var.C0.invalidate();
                mc1Var.R1.setAlpha(mc1Var.o1);
                mc1Var.Q1.invalidate();
                mc1Var.V0();
                break;
            case 12:
                mc1 mc1Var2 = ((ac1) this.b).a;
                mc1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var2.x0.invalidate();
                mc1Var2.C0.invalidate();
                mc1Var2.R1.setAlpha(mc1Var2.o1);
                mc1Var2.Q1.invalidate();
                mc1Var2.V0();
                break;
            case 13:
                id1 id1Var = (id1) this.b;
                id1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = id1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(id1Var.a.getChildAt(i11));
                    int i12 = id1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        id1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        id1Var.a.getChildAt(i11).setAlpha(id1Var.E);
                    }
                }
                break;
            case 14:
                nd1 nd1Var = (nd1) this.b;
                nd1Var.getClass();
                nd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd1Var.invalidate();
                break;
            case 15:
                te1 te1Var = (te1) this.b;
                te1Var.getClass();
                te1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                qe1 qe1Var = (qe1) this.b;
                qe1Var.getClass();
                qe1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.f0();
                break;
            case 17:
                re1 re1Var = (re1) this.b;
                re1Var.getClass();
                re1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jh1 jh1Var = (jh1) this.b;
                jh1Var.getClass();
                jh1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jh1Var.F();
                break;
        }
    }
}
