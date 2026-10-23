package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e11 e11Var = (e11) this.b;
                e11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e11Var.b();
                break;
            case 1:
                s11 s11Var = (s11) this.b;
                s11Var.y = AndroidUtilities.lerp(s11Var.E, valueAnimator.getAnimatedFraction());
                s11Var.h.setTextColor(i0.a.f(s11Var.y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                s11Var.r.setAlpha((s11Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                SecretMediaViewer secretMediaViewer = ((m31) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((m31) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.dn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                x31 x31Var = (x31) this.b;
                x31Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (x31Var.S) {
                    x31Var.N.invalidate();
                    break;
                }
                break;
            case 6:
                ((n41) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 7:
                m51 m51Var = (m51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.r = floatValue;
                View view = m51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.eh0 eh0Var = m51Var.d;
                    if (eh0Var != null) {
                        eh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                t51 t51Var = (t51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(t51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 9:
                x71.a0((x71) this.b, valueAnimator);
                break;
            case 10:
                z81 z81Var = (z81) this.b;
                z81Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z81Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = z81Var.b;
                gVar.z0.f = floatValue3;
                z81Var.c.invalidate();
                gVar.invalidate();
                break;
            case 11:
                kc1 kc1Var = (kc1) this.b;
                kc1Var.getClass();
                kc1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var.x0.invalidate();
                kc1Var.C0.invalidate();
                kc1Var.R1.setAlpha(kc1Var.o1);
                kc1Var.Q1.invalidate();
                kc1Var.V0();
                break;
            case 12:
                kc1 kc1Var2 = ((yb1) this.b).a;
                kc1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var2.x0.invalidate();
                kc1Var2.C0.invalidate();
                kc1Var2.R1.setAlpha(kc1Var2.o1);
                kc1Var2.Q1.invalidate();
                kc1Var2.V0();
                break;
            case 13:
                gd1 gd1Var = (gd1) this.b;
                gd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = gd1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(gd1Var.a.getChildAt(i11));
                    int i12 = gd1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        gd1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        gd1Var.a.getChildAt(i11).setAlpha(gd1Var.E);
                    }
                }
                break;
            case 14:
                ld1 ld1Var = (ld1) this.b;
                ld1Var.getClass();
                ld1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ld1Var.invalidate();
                break;
            case 15:
                re1 re1Var = (re1) this.b;
                re1Var.getClass();
                re1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                oe1 oe1Var = (oe1) this.b;
                oe1Var.getClass();
                oe1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oe1Var.f0();
                break;
            case 17:
                pe1 pe1Var = (pe1) this.b;
                pe1Var.getClass();
                pe1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hh1 hh1Var = (hh1) this.b;
                hh1Var.getClass();
                hh1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh1Var.F();
                break;
        }
    }
}
