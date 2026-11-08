package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((hz0) this.b).d;
                secretMediaViewer.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((hz0) this.b).d;
                secretMediaViewer2.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.b).b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                rz0 rz0Var = (rz0) this.b;
                rz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                ((h01) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                i01 i01Var = (i01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.r = floatValue;
                View view = i01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    fi.r3 r3Var = i01Var.d;
                    if (r3Var != null) {
                        r3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                m11 m11Var = (m11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i7, itemsCount, 4.0f);
                    c61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    c61Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                m31 m31Var = (m31) this.b;
                m31Var.getClass();
                m31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                l41 l41Var = (l41) this.b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.b;
                gVar.z0.f = floatValue3;
                l41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                v71 v71Var = (v71) this.b;
                v71Var.getClass();
                v71Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.y0.invalidate();
                v71Var.D0.invalidate();
                v71Var.S1.setAlpha(v71Var.p1);
                v71Var.R1.invalidate();
                v71Var.a1();
                break;
            case 10:
                v71 v71Var2 = ((k71) this.b).a;
                v71Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var2.y0.invalidate();
                v71Var2.D0.invalidate();
                v71Var2.S1.setAlpha(v71Var2.p1);
                v71Var2.R1.invalidate();
                v71Var2.a1();
                break;
            case 11:
                n81 n81Var = (n81) this.b;
                n81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = n81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(n81Var.a.getChildAt(i10));
                    int i11 = n81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        n81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        n81Var.a.getChildAt(i10).setAlpha(n81Var.E);
                    }
                }
                break;
            case 12:
                t81 t81Var = (t81) this.b;
                t81Var.getClass();
                t81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t81Var.invalidate();
                break;
            case 13:
                w91 w91Var = (w91) this.b;
                w91Var.getClass();
                w91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                t91 t91Var = (t91) this.b;
                t91Var.getClass();
                t91Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.n0();
                break;
            case 15:
                u91 u91Var = (u91) this.b;
                u91Var.getClass();
                u91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fc1 fc1Var = (fc1) this.b;
                fc1Var.getClass();
                fc1Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.x();
                break;
        }
    }
}
