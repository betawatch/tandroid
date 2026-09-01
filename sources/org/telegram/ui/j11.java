package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m11 m11Var = (m11) this.b;
                m11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.a();
                break;
            case 1:
                z11 z11Var = (z11) this.b;
                z11Var.y = AndroidUtilities.lerp(z11Var.B, valueAnimator.getAnimatedFraction());
                z11Var.h.setTextColor(i0.a.d(z11Var.y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                z11Var.r.setAlpha((z11Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((o21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                n21 n21Var = (n21) this.b;
                n21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n21Var.L.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((g41) this.b).d;
                secretMediaViewer.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((g41) this.b).d;
                secretMediaViewer2.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nm0) this.b).b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                r41 r41Var = (r41) this.b;
                r41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r41Var.P) {
                    r41Var.K.invalidate();
                    break;
                }
                break;
            case 8:
                ((h51) this.b).e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                g61 g61Var = (g61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g61Var.r = floatValue;
                View view = g61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    fg.y yVar = g61Var.d;
                    if (yVar != null) {
                        yVar.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                n61 n61Var = (n61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.g.getInterpolation(n61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                p81.Z((p81) this.b, valueAnimator);
                break;
            case 12:
                r91 r91Var = (r91) this.b;
                r91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r91Var.e.setAlpha(1.0f - floatValue3);
                wf.g gVar = r91Var.b;
                gVar.w0.f = floatValue3;
                r91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                ed1 ed1Var = (ed1) this.b;
                ed1Var.getClass();
                ed1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var.u0.invalidate();
                ed1Var.z0.invalidate();
                ed1Var.O1.setAlpha(ed1Var.l1);
                ed1Var.N1.invalidate();
                ed1Var.V0();
                break;
            case 14:
                ed1 ed1Var2 = ((sc1) this.b).a;
                ed1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var2.u0.invalidate();
                ed1Var2.z0.invalidate();
                ed1Var2.O1.setAlpha(ed1Var2.l1);
                ed1Var2.N1.invalidate();
                ed1Var2.V0();
                break;
            case 15:
                be1 be1Var = (be1) this.b;
                be1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = be1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(be1Var.a.getChildAt(i11));
                    int i12 = be1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        be1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        be1Var.a.getChildAt(i11).setAlpha(be1Var.B);
                    }
                }
                break;
            case 16:
                ge1 ge1Var = (ge1) this.b;
                ge1Var.getClass();
                ge1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge1Var.invalidate();
                break;
            case 17:
                mf1 mf1Var = (mf1) this.b;
                mf1Var.getClass();
                mf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                jf1 jf1Var = (jf1) this.b;
                jf1Var.getClass();
                jf1Var.c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf1Var.f0();
                break;
            case 19:
                kf1 kf1Var = (kf1) this.b;
                kf1Var.getClass();
                kf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ci1 ci1Var = (ci1) this.b;
                ci1Var.getClass();
                ci1Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci1Var.G();
                break;
        }
    }
}
