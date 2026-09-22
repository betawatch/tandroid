package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c21 c21Var = (c21) this.b;
                c21Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.a();
                break;
            case 1:
                p21 p21Var = (p21) this.b;
                p21Var.y = AndroidUtilities.lerp(p21Var.E, valueAnimator.getAnimatedFraction());
                p21Var.h.setTextColor(i0.a.d(p21Var.y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                p21Var.r.setAlpha((p21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((f31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                e31 e31Var = (e31) this.b;
                e31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((x41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((x41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.em0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                i51 i51Var = (i51) this.b;
                i51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((x51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                w61 w61Var = (w61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.r = floatValue;
                View view = w61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.ig0 ig0Var = w61Var.d;
                    if (ig0Var != null) {
                        ig0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                d71 d71Var = (d71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(d71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(d71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                f91.a0((f91) this.b, valueAnimator);
                break;
            case 12:
                ja1 ja1Var = (ja1) this.b;
                ja1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ja1Var.b;
                gVar.z0.f = floatValue3;
                ja1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                wd1 wd1Var = (wd1) this.b;
                wd1Var.getClass();
                wd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.x0.invalidate();
                wd1Var.C0.invalidate();
                wd1Var.R1.setAlpha(wd1Var.o1);
                wd1Var.Q1.invalidate();
                wd1Var.V0();
                break;
            case 14:
                wd1 wd1Var2 = ((kd1) this.b).a;
                wd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var2.x0.invalidate();
                wd1Var2.C0.invalidate();
                wd1Var2.R1.setAlpha(wd1Var2.o1);
                wd1Var2.Q1.invalidate();
                wd1Var2.V0();
                break;
            case 15:
                te1 te1Var = (te1) this.b;
                te1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = te1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(te1Var.a.getChildAt(i11));
                    int i12 = te1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        te1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        te1Var.a.getChildAt(i11).setAlpha(te1Var.E);
                    }
                }
                break;
            case 16:
                ye1 ye1Var = (ye1) this.b;
                ye1Var.getClass();
                ye1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye1Var.invalidate();
                break;
            case 17:
                eg1 eg1Var = (eg1) this.b;
                eg1Var.getClass();
                eg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                bg1 bg1Var = (bg1) this.b;
                bg1Var.getClass();
                bg1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg1Var.f0();
                break;
            case 19:
                cg1 cg1Var = (cg1) this.b;
                cg1Var.getClass();
                cg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ui1 ui1Var = (ui1) this.b;
                ui1Var.getClass();
                ui1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.G();
                break;
        }
    }
}
