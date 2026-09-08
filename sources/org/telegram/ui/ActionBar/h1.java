package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ h1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                n1Var.a = null;
                ViewGroup viewGroup = (ViewGroup) n1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                } else {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i11 = 0; i11 < itemsCount; i11++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
                    if (!(childAt instanceof k1)) {
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            default:
                n1 n1Var2 = this.b;
                n1Var2.a = null;
                n1Var2.d = false;
                n1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                n1Var2.j();
                if (n1Var2.e) {
                    n1Var2.j.unlock();
                    break;
                }
                break;
        }
    }
}
