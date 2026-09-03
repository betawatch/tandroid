package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ j1(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                p1Var.a = null;
                ViewGroup viewGroup = (ViewGroup) p1Var.getContentView();
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
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i11);
                    if (!(childAt instanceof m1)) {
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            default:
                p1 p1Var2 = this.b;
                p1Var2.a = null;
                p1Var2.d = false;
                p1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                p1Var2.j();
                if (p1Var2.e) {
                    p1Var2.j.unlock();
                    break;
                }
                break;
        }
    }
}
