package bg;

import ag.c2;
import ag.d2;
import android.animation.ValueAnimator;
import android.view.View;
import bi.f5;
import java.util.Iterator;
import jg.a1;
import jg.d3;
import jg.f2;
import jg.v2;
import jg.y1;
import jg.z2;
import kg.g2;
import kg.w0;
import kg.x0;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.voip.a0;
import org.telegram.ui.Components.voip.j0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.dr0;
import org.telegram.ui.m0;
import org.telegram.ui.ud1;
import org.telegram.ui.un;
import org.telegram.ui.web.l1;
import qh.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                lVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.g.a.invalidate();
                break;
            case 1:
                f5 f5Var = (f5) obj;
                f5Var.getClass();
                f5Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.requestLayout();
                f5Var.invalidate();
                break;
            case 2:
                ci.o oVar = (ci.o) obj;
                un unVar = oVar.F;
                if (unVar != null) {
                    unVar.C9();
                    if (unVar.X8 != null) {
                        unVar.fragmentView.invalidate();
                        break;
                    }
                } else {
                    oVar.G.invalidate();
                    break;
                }
                break;
            case 3:
                ((dr0) ((a1) obj)).K.e0.invalidate();
                break;
            case 4:
                y1 y1Var = (y1) obj;
                y1Var.getClass();
                y1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 5:
                f2 f2Var = (f2) obj;
                f2Var.getClass();
                f2Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.invalidate();
                break;
            case 6:
                ig.j jVar = (ig.j) obj;
                jVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.invalidate();
                break;
            case 7:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                d3 d3Var = (d3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.D = floatValue;
                z2 z2Var = d3Var.c;
                z2Var.setAlpha(floatValue);
                z2Var.setScaleX(i0.T1(0.9f, 1.0f, d3Var.D));
                z2Var.setScaleY(i0.T1(0.9f, 1.0f, d3Var.D));
                d3Var.b.invalidate();
                break;
            case 9:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.o0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 10:
                x0 x0Var = (x0) obj;
                x0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.f.invalidate();
                w0 w0Var = x0Var.h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((g2) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                ((lg.g) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                mg.b bVar = (mg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 14:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                y0Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.invalidate();
                break;
            case 15:
                b1 b1Var = (b1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.setTextColor(i0.b.f(floatValue3, -1, -9194260));
                b1Var.setIconColor(i0.b.f(floatValue3, -1, -9194260));
                break;
            case 16:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                    if (!(childAt instanceof h1)) {
                        float s10 = i0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.w ? (itemsCount - 1) - i12 : i12, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s10) * i0.L(-6.0f));
                        childAt.setAlpha(s10 * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 17:
                m1 m1Var = (m1) obj;
                if (!m1Var.e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (m1Var.r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) c3.i0.z(1.0f, floatValue5, m1Var.q, m1Var.p * floatValue5);
                    if (!(m1Var instanceof sg.k)) {
                        m1Var.a.setTranslationY(z10);
                    }
                    m1Var.e(-z10, floatValue5, m1Var.s);
                    break;
                }
                break;
            case 18:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                i3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = i3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                i3Var.invalidate();
                break;
            case 19:
                p3 p3Var = (p3) obj;
                p3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3 q3Var = p3Var.b;
                if (q3Var != null) {
                    q3Var.invalidate();
                    break;
                }
                break;
            case 20:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                a0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 21:
                ud1 ud1Var = (ud1) obj;
                ud1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (i0.q.x - i0.L(36.0f)) - i0.L(52.0f);
                j0 j0Var = ud1Var.c;
                j0Var.getLayoutParams().width = i0.L(52.0f) + ((int) (L * ud1Var.E));
                j0Var.requestLayout();
                break;
            case 22:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                org.telegram.ui.Components.voip.b1 b1Var2 = (org.telegram.ui.Components.voip.b1) obj;
                b1Var2.getClass();
                b1Var2.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var2.invalidate();
                break;
            case 24:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                t1Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.b.invalidate();
                break;
            case 25:
                c2 c2Var = (c2) obj;
                ((d2) c2Var.K1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c2Var.invalidate();
                break;
            case 26:
                l1 l1Var = (l1) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.U = floatValue6;
                l1Var.V.setAlpha(floatValue6);
                l1Var.invalidate();
                break;
            case 27:
                m0 m0Var = (m0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.a0 = floatValue7;
                m0Var.j(floatValue7);
                m0Var.b0.setAlpha(m0Var.a0);
                m0Var.R.setTranslationX(i0.L(56.0f) * m0Var.a0);
                m0Var.O.setTranslationX(i0.L(112.0f) * m0Var.a0);
                m0Var.invalidate();
                break;
            case 28:
                qg.h hVar = (qg.h) obj;
                hVar.getClass();
                hVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                y yVar = (y) obj;
                yVar.getClass();
                yVar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.invalidate();
                break;
        }
    }
}
