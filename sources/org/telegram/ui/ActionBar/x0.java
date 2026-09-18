package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
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
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
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
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, q1Var.q, q1Var.p * floatValue3);
                    if (!(q1Var instanceof zg.n)) {
                        q1Var.a.setTranslationY(z10);
                    }
                    q1Var.e(-z10, floatValue3, q1Var.s);
                    break;
                }
                break;
            case 4:
                p3 p3Var = (p3) this.b;
                p3Var.getClass();
                p3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = p3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                p3Var.invalidate();
                break;
            default:
                x3 x3Var = (x3) this.b;
                x3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = x3Var.b;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
        }
    }
}
