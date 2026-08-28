package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.b;
                d1Var.getClass();
                d1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                break;
            case 1:
                g1 g1Var = (g1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                g1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                break;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
                    if (!(childAt instanceof l1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i9 : i9, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(cascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 3:
                q1 q1Var = (q1) this.b;
                if (!q1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (q1Var.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) e2.c.z(1.0f, floatValue3, q1Var.q, q1Var.p * floatValue3);
                    if (!(q1Var instanceof hg.o)) {
                        q1Var.a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.s);
                    break;
                }
                break;
            case 4:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                m3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = m3Var.E.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                m3Var.invalidate();
                break;
            default:
                u3 u3Var = (u3) this.b;
                u3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = u3Var.b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    break;
                }
                break;
        }
    }
}
