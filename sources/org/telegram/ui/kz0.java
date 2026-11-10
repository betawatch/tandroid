package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((lz0) this.b).d;
                secretMediaViewer.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((lz0) this.b).d;
                secretMediaViewer2.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.b).b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                vz0 vz0Var = (vz0) this.b;
                vz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                ((k01) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                l01 l01Var = (l01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l01Var.r = floatValue;
                View view = l01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    fi.r3 r3Var = l01Var.d;
                    if (r3Var != null) {
                        r3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                p11 p11Var = (p11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                e61 e61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wq.g.getInterpolation(p11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(p11Var.L, i7, itemsCount, 4.0f);
                    e61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    e61Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                o31 o31Var = (o31) this.b;
                o31Var.getClass();
                o31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                n41 n41Var = (n41) this.b;
                n41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = n41Var.b;
                gVar.z0.f = floatValue3;
                n41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                x71 x71Var = (x71) this.b;
                x71Var.getClass();
                x71Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.y0.invalidate();
                x71Var.D0.invalidate();
                x71Var.S1.setAlpha(x71Var.p1);
                x71Var.R1.invalidate();
                x71Var.a1();
                break;
            case 10:
                x71 x71Var2 = ((m71) this.b).a;
                x71Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var2.y0.invalidate();
                x71Var2.D0.invalidate();
                x71Var2.S1.setAlpha(x71Var2.p1);
                x71Var2.R1.invalidate();
                x71Var2.a1();
                break;
            case 11:
                p81 p81Var = (p81) this.b;
                p81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = p81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(p81Var.a.getChildAt(i10));
                    int i11 = p81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        p81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        p81Var.a.getChildAt(i10).setAlpha(p81Var.E);
                    }
                }
                break;
            case 12:
                v81 v81Var = (v81) this.b;
                v81Var.getClass();
                v81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var.invalidate();
                break;
            case 13:
                z91 z91Var = (z91) this.b;
                z91Var.getClass();
                z91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                w91 w91Var = (w91) this.b;
                w91Var.getClass();
                w91Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w91Var.n0();
                break;
            case 15:
                x91 x91Var = (x91) this.b;
                x91Var.getClass();
                x91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jc1 jc1Var = (jc1) this.b;
                jc1Var.getClass();
                jc1Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc1Var.x();
                break;
        }
    }
}
