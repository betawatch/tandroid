package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ e1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                k1Var.a = null;
                ViewGroup viewGroup = (ViewGroup) k1Var.getContentView();
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
                    if (!(childAt instanceof h1)) {
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            default:
                k1 k1Var2 = this.b;
                k1Var2.a = null;
                k1Var2.d = false;
                k1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                k1Var2.j();
                if (k1Var2.e) {
                    k1Var2.j.e();
                    break;
                }
                break;
        }
    }
}
