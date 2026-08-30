package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j11 j11Var = (j11) this.b;
                j11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j11Var.a();
                break;
            case 1:
                w11 w11Var = (w11) this.b;
                w11Var.B = AndroidUtilities.lerp(w11Var.C, valueAnimator.getAnimatedFraction());
                w11Var.h.setTextColor(i0.a.d(w11Var.B, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                w11Var.r.setAlpha((w11Var.B / 2.0f) + 0.5f);
                break;
            case 2:
                ((m21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                l21 l21Var = (l21) this.b;
                l21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l21Var.L.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((e41) this.b).d;
                secretMediaViewer.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((e41) this.b).d;
                secretMediaViewer2.X.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mm0) this.b).b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                p41 p41Var = (p41) this.b;
                p41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (p41Var.P) {
                    p41Var.K.invalidate();
                    break;
                }
                break;
            case 8:
                ((f51) this.b).e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                e61 e61Var = (e61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e61Var.r = floatValue;
                View view = e61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    eg.y yVar = e61Var.d;
                    if (yVar != null) {
                        yVar.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                m61 m61Var = (m61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.g.getInterpolation(m61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(m61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                o81.Z((o81) this.b, valueAnimator);
                break;
            case 12:
                q91 q91Var = (q91) this.b;
                q91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q91Var.e.setAlpha(1.0f - floatValue3);
                vf.g gVar = q91Var.b;
                gVar.w0.f = floatValue3;
                q91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                cd1 cd1Var = (cd1) this.b;
                cd1Var.getClass();
                cd1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var.u0.invalidate();
                cd1Var.z0.invalidate();
                cd1Var.O1.setAlpha(cd1Var.l1);
                cd1Var.N1.invalidate();
                cd1Var.V0();
                break;
            case 14:
                cd1 cd1Var2 = ((qc1) this.b).a;
                cd1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var2.u0.invalidate();
                cd1Var2.z0.invalidate();
                cd1Var2.O1.setAlpha(cd1Var2.l1);
                cd1Var2.N1.invalidate();
                cd1Var2.V0();
                break;
            case 15:
                yd1 yd1Var = (yd1) this.b;
                yd1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = yd1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(yd1Var.a.getChildAt(i11));
                    int i12 = yd1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        yd1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        yd1Var.a.getChildAt(i11).setAlpha(yd1Var.B);
                    }
                }
                break;
            case 16:
                de1 de1Var = (de1) this.b;
                de1Var.getClass();
                de1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de1Var.invalidate();
                break;
            case 17:
                kf1 kf1Var = (kf1) this.b;
                kf1Var.getClass();
                kf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                hf1 hf1Var = (hf1) this.b;
                hf1Var.getClass();
                hf1Var.c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf1Var.f0();
                break;
            case 19:
                if1 if1Var = (if1) this.b;
                if1Var.getClass();
                if1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ai1 ai1Var = (ai1) this.b;
                ai1Var.getClass();
                ai1Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ai1Var.G();
                break;
        }
    }
}
