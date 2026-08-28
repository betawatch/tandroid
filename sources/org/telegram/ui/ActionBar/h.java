package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i9) {
        this.a = i9;
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
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
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
                m3 m3Var = (m3) this.b;
                if (m3Var.B == animator) {
                    m3Var.C = m3Var.D;
                    Iterator it = m3Var.E.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            default:
                v3 v3Var = (v3) this.b;
                m3 m3Var2 = v3Var.a;
                if (m3Var2 != null) {
                    m3Var2.b = true;
                    m3Var2.invalidate();
                }
                v3Var.R = v3Var.Q ? 1.0f : 0.0f;
                v3Var.invalidate();
                if (!v3Var.Q) {
                    v3Var.N.clear();
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
