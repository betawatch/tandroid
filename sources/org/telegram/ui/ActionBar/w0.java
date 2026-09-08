package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                c1Var.getClass();
                c1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                break;
            case 1:
                f1 f1Var = (f1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                f1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                break;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof k1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(cascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 3:
                p1 p1Var = (p1) this.b;
                if (!p1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (p1Var.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, p1Var.q, p1Var.p * floatValue3);
                    if (!(p1Var instanceof ah.v)) {
                        p1Var.a.setTranslationY(z10);
                    }
                    p1Var.e(-z10, floatValue3, p1Var.s);
                    break;
                }
                break;
            case 4:
                o3 o3Var = (o3) this.b;
                o3Var.getClass();
                o3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = o3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                o3Var.invalidate();
                break;
            default:
                w3 w3Var = (w3) this.b;
                w3Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3 x3Var = w3Var.b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    break;
                }
                break;
        }
    }
}
