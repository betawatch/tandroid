package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i11 i11Var = (i11) this.b;
                i11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i11Var.b();
                break;
            case 1:
                w11 w11Var = (w11) this.b;
                w11Var.y = AndroidUtilities.lerp(w11Var.E, valueAnimator.getAnimatedFraction());
                w11Var.h.setTextColor(i0.a.f(w11Var.y, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                w11Var.r.setAlpha((w11Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                SecretMediaViewer secretMediaViewer = ((q31) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((q31) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.gn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                b41 b41Var = (b41) this.b;
                b41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (b41Var.S) {
                    b41Var.N.invalidate();
                    break;
                }
                break;
            case 6:
                ((r41) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 7:
                q51 q51Var = (q51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.r = floatValue;
                View view = q51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.hh0 hh0Var = q51Var.d;
                    if (hh0Var != null) {
                        hh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                x51 x51Var = (x51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(x51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(x51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 9:
                c81.a0((c81) this.b, valueAnimator);
                break;
            case 10:
                e91 e91Var = (e91) this.b;
                e91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e91Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = e91Var.b;
                gVar.z0.f = floatValue3;
                e91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 11:
                qc1 qc1Var = (qc1) this.b;
                qc1Var.getClass();
                qc1Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.y0.invalidate();
                qc1Var.D0.invalidate();
                qc1Var.S1.setAlpha(qc1Var.p1);
                qc1Var.R1.invalidate();
                qc1Var.V0();
                break;
            case 12:
                qc1 qc1Var2 = ((ec1) this.b).a;
                qc1Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var2.y0.invalidate();
                qc1Var2.D0.invalidate();
                qc1Var2.S1.setAlpha(qc1Var2.p1);
                qc1Var2.R1.invalidate();
                qc1Var2.V0();
                break;
            case 13:
                md1 md1Var = (md1) this.b;
                md1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = md1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(md1Var.a.getChildAt(i11));
                    int i12 = md1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        md1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        md1Var.a.getChildAt(i11).setAlpha(md1Var.E);
                    }
                }
                break;
            case 14:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.getClass();
                rd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.invalidate();
                break;
            case 15:
                ye1 ye1Var = (ye1) this.b;
                ye1Var.getClass();
                ye1Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.getClass();
                ue1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue1Var.e0();
                break;
            case 17:
                we1 we1Var = (we1) this.b;
                we1Var.getClass();
                we1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                oh1 oh1Var = (oh1) this.b;
                oh1Var.getClass();
                oh1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.F();
                break;
        }
    }
}
