package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                u21 u21Var = (u21) this.b;
                u21Var.y = AndroidUtilities.lerp(u21Var.E, valueAnimator.getAnimatedFraction());
                u21Var.h.setTextColor(i0.a.d(u21Var.y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                u21Var.r.setAlpha((u21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((k31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                j31 j31Var = (j31) this.b;
                j31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j31Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((c51) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((c51) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.om0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                n51 n51Var = (n51) this.b;
                n51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((b61) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                a71 a71Var = (a71) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var.r = floatValue;
                View view = a71Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.sg0 sg0Var = a71Var.d;
                    if (sg0Var != null) {
                        sg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                h71 h71Var = (h71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wr.g.getInterpolation(h71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(h71Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                k91.a0((k91) this.b, valueAnimator);
                break;
            case 12:
                pa1 pa1Var = (pa1) this.b;
                pa1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa1Var.e.setAlpha(1.0f - floatValue3);
                hg.g gVar = pa1Var.b;
                gVar.z0.f = floatValue3;
                pa1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                ae1 ae1Var = (ae1) this.b;
                ae1Var.getClass();
                ae1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var.x0.invalidate();
                ae1Var.C0.invalidate();
                ae1Var.R1.setAlpha(ae1Var.o1);
                ae1Var.Q1.invalidate();
                ae1Var.V0();
                break;
            case 14:
                ae1 ae1Var2 = ((od1) this.b).a;
                ae1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var2.x0.invalidate();
                ae1Var2.C0.invalidate();
                ae1Var2.R1.setAlpha(ae1Var2.o1);
                ae1Var2.Q1.invalidate();
                ae1Var2.V0();
                break;
            case 15:
                xe1 xe1Var = (xe1) this.b;
                xe1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = xe1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(xe1Var.a.getChildAt(i11));
                    int i12 = xe1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        xe1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        xe1Var.a.getChildAt(i11).setAlpha(xe1Var.E);
                    }
                }
                break;
            case 16:
                cf1 cf1Var = (cf1) this.b;
                cf1Var.getClass();
                cf1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cf1Var.invalidate();
                break;
            case 17:
                ig1 ig1Var = (ig1) this.b;
                ig1Var.getClass();
                ig1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                fg1 fg1Var = (fg1) this.b;
                fg1Var.getClass();
                fg1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg1Var.f0();
                break;
            case 19:
                gg1 gg1Var = (gg1) this.b;
                gg1Var.getClass();
                gg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zi1 zi1Var = (zi1) this.b;
                zi1Var.getClass();
                zi1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi1Var.G();
                break;
        }
    }
}
