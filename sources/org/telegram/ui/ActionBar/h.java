package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setLayerType(0, null);
                break;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof l1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 2:
                q1 q1Var = (q1) this.b;
                if (!q1Var.e) {
                    q1Var.j();
                    break;
                }
                break;
            case 3:
                p3 p3Var = (p3) this.b;
                if (p3Var.F == animator) {
                    p3Var.G = p3Var.H;
                    Iterator it = p3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            default:
                y3 y3Var = (y3) this.b;
                p3 p3Var2 = y3Var.a;
                if (p3Var2 != null) {
                    p3Var2.b = true;
                    p3Var2.invalidate();
                }
                y3Var.V = y3Var.U ? 1.0f : 0.0f;
                y3Var.invalidate();
                if (!y3Var.U) {
                    y3Var.R.clear();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setLayerType(2, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
