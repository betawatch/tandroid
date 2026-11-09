package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((kz0) this.b).d;
                secretMediaViewer.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((kz0) this.b).d;
                secretMediaViewer2.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.ok0) this.b).b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                uz0 uz0Var = (uz0) this.b;
                uz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                ((j01) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                k01 k01Var = (k01) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.r = floatValue;
                View view = k01Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    fi.r3 r3Var = k01Var.d;
                    if (r3Var != null) {
                        r3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                o11 o11Var = (o11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.g.getInterpolation(o11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.L, i7, itemsCount, 4.0f);
                    d61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    d61Var.getChildAt(i7).setAlpha(s5);
                }
                break;
            case 7:
                n31 n31Var = (n31) this.b;
                n31Var.getClass();
                n31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                m41 m41Var = (m41) this.b;
                m41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.e.setAlpha(1.0f - floatValue3);
                lg.g gVar = m41Var.b;
                gVar.z0.f = floatValue3;
                m41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                w71 w71Var = (w71) this.b;
                w71Var.getClass();
                w71Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.y0.invalidate();
                w71Var.D0.invalidate();
                w71Var.S1.setAlpha(w71Var.p1);
                w71Var.R1.invalidate();
                w71Var.a1();
                break;
            case 10:
                w71 w71Var2 = ((l71) this.b).a;
                w71Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var2.y0.invalidate();
                w71Var2.D0.invalidate();
                w71Var2.S1.setAlpha(w71Var2.p1);
                w71Var2.R1.invalidate();
                w71Var2.a1();
                break;
            case 11:
                o81 o81Var = (o81) this.b;
                o81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = o81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(o81Var.a.getChildAt(i10));
                    int i11 = o81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        o81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        o81Var.a.getChildAt(i10).setAlpha(o81Var.E);
                    }
                }
                break;
            case 12:
                u81 u81Var = (u81) this.b;
                u81Var.getClass();
                u81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.invalidate();
                break;
            case 13:
                y91 y91Var = (y91) this.b;
                y91Var.getClass();
                y91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                v91 v91Var = (v91) this.b;
                v91Var.getClass();
                v91Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var.n0();
                break;
            case 15:
                w91 w91Var = (w91) this.b;
                w91Var.getClass();
                w91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ic1 ic1Var = (ic1) this.b;
                ic1Var.getClass();
                ic1Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ic1Var.x();
                break;
        }
    }
}
