// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ g8(m8 m8Var, byte b) {
        this.a = b;
        this.b = m8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        byte b = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
        m8 m8Var = this.b;
        switch (b) {
            case 0:
                m8Var.a = null;
                ViewGroup viewGroup = (ViewGroup) m8Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                } else {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i2 = 0; i2 < itemsCount; i2++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
                    if (!(childAt instanceof j8)) {
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            default:
                m8Var.a = null;
                m8Var.d = false;
                m8Var.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                m8Var.j();
                if (m8Var.e) {
                    m8Var.j.e();
                    break;
                }
                break;
        }
    }
}
