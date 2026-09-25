package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s11 s11Var = (s11) this.b;
                s11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var.a();
                break;
            case 1:
                f21 f21Var = (f21) this.b;
                f21Var.y = AndroidUtilities.lerp(f21Var.E, valueAnimator.getAnimatedFraction());
                f21Var.h.setTextColor(i0.a.d(f21Var.y, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                f21Var.r.setAlpha((f21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((w21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                v21 v21Var = (v21) this.b;
                v21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((q41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((q41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.qm0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                b51 b51Var = (b51) this.b;
                b51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (b51Var.S) {
                    b51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((q51) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                p61 p61Var = (p61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.r = floatValue;
                View view = p61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.sg0 sg0Var = p61Var.d;
                    if (sg0Var != null) {
                        sg0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                w61 w61Var = (w61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.rr.g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                z81.a0((z81) this.b, valueAnimator);
                break;
            case 12:
                ca1 ca1Var = (ca1) this.b;
                ca1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ca1Var.b;
                gVar.z0.f = floatValue3;
                ca1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                od1 od1Var = (od1) this.b;
                od1Var.getClass();
                od1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.x0.invalidate();
                od1Var.C0.invalidate();
                od1Var.R1.setAlpha(od1Var.o1);
                od1Var.Q1.invalidate();
                od1Var.V0();
                break;
            case 14:
                od1 od1Var2 = ((cd1) this.b).a;
                od1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var2.x0.invalidate();
                od1Var2.C0.invalidate();
                od1Var2.R1.setAlpha(od1Var2.o1);
                od1Var2.Q1.invalidate();
                od1Var2.V0();
                break;
            case 15:
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
            case 16:
                qe1 qe1Var = (qe1) this.b;
                qe1Var.getClass();
                qe1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                break;
            case 17:
                wf1 wf1Var = (wf1) this.b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                tf1 tf1Var = (tf1) this.b;
                tf1Var.getClass();
                tf1Var.f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                break;
            case 19:
                uf1 uf1Var = (uf1) this.b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                mi1 mi1Var = (mi1) this.b;
                mi1Var.getClass();
                mi1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.G();
                break;
        }
    }
}
