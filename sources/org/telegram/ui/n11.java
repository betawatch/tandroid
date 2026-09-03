package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q11 q11Var = (q11) this.b;
                q11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q11Var.a();
                break;
            case 1:
                d21 d21Var = (d21) this.b;
                d21Var.y = AndroidUtilities.lerp(d21Var.B, valueAnimator.getAnimatedFraction());
                d21Var.h.setTextColor(i0.a.d(d21Var.y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                d21Var.r.setAlpha((d21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((u21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                t21 t21Var = (t21) this.b;
                t21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.L.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((l41) this.b).d;
                secretMediaViewer.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((l41) this.b).d;
                secretMediaViewer2.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mm0) this.b).b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                w41 w41Var = (w41) this.b;
                w41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                    break;
                }
                break;
            case 8:
                ((m51) this.b).e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                l61 l61Var = (l61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61Var.r = floatValue;
                View view = l61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    fg.y yVar = l61Var.d;
                    if (yVar != null) {
                        yVar.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                s61 s61Var = (s61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.g.getInterpolation(s61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(s61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                v81.Z((v81) this.b, valueAnimator);
                break;
            case 12:
                x91 x91Var = (x91) this.b;
                x91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x91Var.e.setAlpha(1.0f - floatValue3);
                wf.g gVar = x91Var.b;
                gVar.w0.f = floatValue3;
                x91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                jd1 jd1Var = (jd1) this.b;
                jd1Var.getClass();
                jd1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.u0.invalidate();
                jd1Var.z0.invalidate();
                jd1Var.O1.setAlpha(jd1Var.l1);
                jd1Var.N1.invalidate();
                jd1Var.V0();
                break;
            case 14:
                jd1 jd1Var2 = ((xc1) this.b).a;
                jd1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var2.u0.invalidate();
                jd1Var2.z0.invalidate();
                jd1Var2.O1.setAlpha(jd1Var2.l1);
                jd1Var2.N1.invalidate();
                jd1Var2.V0();
                break;
            case 15:
                he1 he1Var = (he1) this.b;
                he1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = he1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(he1Var.a.getChildAt(i11));
                    int i12 = he1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        he1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        he1Var.a.getChildAt(i11).setAlpha(he1Var.B);
                    }
                }
                break;
            case 16:
                me1 me1Var = (me1) this.b;
                me1Var.getClass();
                me1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me1Var.invalidate();
                break;
            case 17:
                sf1 sf1Var = (sf1) this.b;
                sf1Var.getClass();
                sf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                pf1 pf1Var = (pf1) this.b;
                pf1Var.getClass();
                pf1Var.c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf1Var.f0();
                break;
            case 19:
                qf1 qf1Var = (qf1) this.b;
                qf1Var.getClass();
                qf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ii1 ii1Var = (ii1) this.b;
                ii1Var.getClass();
                ii1Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.G();
                break;
        }
    }
}
