package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                d21 d21Var = (d21) this.b;
                d21Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d21Var.a();
                break;
            case 1:
                q21 q21Var = (q21) this.b;
                q21Var.y = AndroidUtilities.lerp(q21Var.E, valueAnimator.getAnimatedFraction());
                q21Var.h.setTextColor(i0.a.d(q21Var.y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                q21Var.r.setAlpha((q21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((g31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                f31 f31Var = (f31) this.b;
                f31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((z41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((z41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.em0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                k51 k51Var = (k51) this.b;
                k51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((z51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                y61 y61Var = (y61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.r = floatValue;
                View view = y61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.ig0 ig0Var = y61Var.d;
                    if (ig0Var != null) {
                        ig0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                f71 f71Var = (f71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                i91.a0((i91) this.b, valueAnimator);
                break;
            case 12:
                la1 la1Var = (la1) this.b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = la1Var.b;
                gVar.z0.f = floatValue3;
                la1Var.c.invalidate();
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
