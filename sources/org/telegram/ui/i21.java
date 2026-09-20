package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o21 o21Var = (o21) this.b;
                o21Var.y = AndroidUtilities.lerp(o21Var.E, valueAnimator.getAnimatedFraction());
                o21Var.h.setTextColor(i0.a.d(o21Var.y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                o21Var.r.setAlpha((o21Var.y / 2.0f) + 0.5f);
                break;
            case 1:
                ((f31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                e31 e31Var = (e31) this.b;
                e31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.O.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = ((a51) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((a51) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.qm0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                l51 l51Var = (l51) this.b;
                l51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                    break;
                }
                break;
            case 7:
                ((z51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                y61 y61Var = (y61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.r = floatValue;
                View view = y61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.sg0 sg0Var = y61Var.d;
                    if (sg0Var != null) {
                        sg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                f71 f71Var = (f71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 10:
                i91.a0((i91) this.b, valueAnimator);
                break;
            case 11:
                la1 la1Var = (la1) this.b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = la1Var.b;
                gVar.z0.f = floatValue3;
                la1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 12:
                xd1 xd1Var = (xd1) this.b;
                xd1Var.getClass();
                xd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                break;
            case 13:
                xd1 xd1Var2 = ((ld1) this.b).a;
                xd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                break;
            case 14:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(ue1Var.a.getChildAt(i11));
                    int i12 = ue1Var.d.e;
                    if (S < i12 || i12 <= 0) {
                        ue1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ue1Var.a.getChildAt(i11).setAlpha(ue1Var.E);
                    }
                }
                break;
            case 15:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.getClass();
                ze1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                break;
            case 16:
                fg1 fg1Var = (fg1) this.b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                cg1 cg1Var = (cg1) this.b;
                cg1Var.getClass();
                cg1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                break;
            case 18:
                dg1 dg1Var = (dg1) this.b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ti1 ti1Var = (ti1) this.b;
                ti1Var.getClass();
                ti1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.G();
                break;
        }
    }
}
