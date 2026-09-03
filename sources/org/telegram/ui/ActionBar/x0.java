package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                    if (!(childAt instanceof m1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(cascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 3:
                r1 r1Var = (r1) this.b;
                if (!r1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (r1Var.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float w10 = (int) e2.c.w(1.0f, floatValue3, r1Var.q, r1Var.p * floatValue3);
                    if (!(r1Var instanceof mg.o)) {
                        r1Var.a.setTranslationY(w10);
                    }
                    r1Var.e(-w10, floatValue3, r1Var.s);
                    break;
                }
                break;
            case 4:
                n3 n3Var = (n3) this.b;
                n3Var.getClass();
                n3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = n3Var.F.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                n3Var.invalidate();
                break;
            default:
                v3 v3Var = (v3) this.b;
                v3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = v3Var.b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    break;
                }
                break;
        }
    }
}
