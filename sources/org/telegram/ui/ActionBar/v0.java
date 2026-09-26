package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                b1Var.getClass();
                b1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.invalidate();
                break;
            case 1:
                e1 e1Var = (e1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.setTextColor(i0.a.d(floatValue, -1, -9194260));
                e1Var.setIconColor(i0.a.d(floatValue, -1, -9194260));
                break;
            case 2:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof j1)) {
                        float cascade = AndroidUtilities.cascade(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.v ? (itemsCount - 1) - i10 : i10, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(cascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 3:
                o1 o1Var = (o1) this.b;
                if (!o1Var.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (o1Var.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue3, o1Var.q, o1Var.p * floatValue3);
                    if (!(o1Var instanceof zg.n)) {
                        o1Var.a.setTranslationY(z10);
                    }
                    o1Var.e(-z10, floatValue3, o1Var.s);
                    break;
                }
                break;
            case 4:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                m3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = m3Var.I.iterator();
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
