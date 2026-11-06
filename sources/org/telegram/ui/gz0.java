package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                u71 u71Var = (u71) this.b;
                u71Var.getClass();
                u71Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.y0.invalidate();
                u71Var.D0.invalidate();
                u71Var.S1.setAlpha(u71Var.p1);
                u71Var.R1.invalidate();
                u71Var.a1();
                break;
            case 10:
                u71 u71Var2 = ((j71) this.b).a;
                u71Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var2.y0.invalidate();
                u71Var2.D0.invalidate();
                u71Var2.S1.setAlpha(u71Var2.p1);
                u71Var2.R1.invalidate();
                u71Var2.a1();
                break;
            case 11:
                m81 m81Var = (m81) this.b;
                m81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = m81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(m81Var.a.getChildAt(i10));
                    int i11 = m81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        m81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        m81Var.a.getChildAt(i10).setAlpha(m81Var.E);
                    }
                }
                break;
            case 12:
                s81 s81Var = (s81) this.b;
                s81Var.getClass();
                s81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s81Var.invalidate();
                break;
            case 13:
                v91 v91Var = (v91) this.b;
                v91Var.getClass();
                v91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                s91 s91Var = (s91) this.b;
                s91Var.getClass();
                s91Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s91Var.n0();
                break;
            case 15:
                t91 t91Var = (t91) this.b;
                t91Var.getClass();
                t91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ec1 ec1Var = (ec1) this.b;
                ec1Var.getClass();
                ec1Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.x();
                break;
        }
    }
}
