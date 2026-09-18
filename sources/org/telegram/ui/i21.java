package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                ((e31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                d31 d31Var = (d31) this.b;
                d31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.O.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = ((x41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((x41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rm0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                i51 i51Var = (i51) this.b;
                i51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    break;
                }
                break;
            case 7:
                ((w51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                v61 v61Var = (v61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.r = floatValue;
                View view = v61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.tg0 tg0Var = v61Var.d;
                    if (tg0Var != null) {
                        tg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 9:
                c71 c71Var = (c71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(c71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(c71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 10:
                f91.a0((f91) this.b, valueAnimator);
                break;
            case 11:
                ja1 ja1Var = (ja1) this.b;
                ja1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ja1Var.b;
                gVar.z0.f = floatValue3;
                ja1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 12:
                vd1 vd1Var = (vd1) this.b;
                vd1Var.getClass();
                vd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var.x0.invalidate();
                vd1Var.C0.invalidate();
                vd1Var.R1.setAlpha(vd1Var.o1);
                vd1Var.Q1.invalidate();
                vd1Var.V0();
                break;
            case 13:
                vd1 vd1Var2 = ((jd1) this.b).a;
                vd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var2.x0.invalidate();
                vd1Var2.C0.invalidate();
                vd1Var2.R1.setAlpha(vd1Var2.o1);
                vd1Var2.Q1.invalidate();
                vd1Var2.V0();
                break;
            case 14:
                se1 se1Var = (se1) this.b;
                se1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = se1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(se1Var.a.getChildAt(i11));
                    int i12 = se1Var.d.e;
                    if (S < i12 || i12 <= 0) {
                        se1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        se1Var.a.getChildAt(i11).setAlpha(se1Var.E);
                    }
                }
                break;
            case 15:
                xe1 xe1Var = (xe1) this.b;
                xe1Var.getClass();
                xe1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe1Var.invalidate();
                break;
            case 16:
                dg1 dg1Var = (dg1) this.b;
                dg1Var.getClass();
                dg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                ag1 ag1Var = (ag1) this.b;
                ag1Var.getClass();
                ag1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag1Var.f0();
                break;
            case 18:
                bg1 bg1Var = (bg1) this.b;
                bg1Var.getClass();
                bg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                si1 si1Var = (si1) this.b;
                si1Var.getClass();
                si1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si1Var.G();
                break;
        }
    }
}
