package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class nr {
    public final org.telegram.ui.ActionBar.o1 a;
    public boolean b;

    public nr(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, b6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new lr(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new s(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.a = o1Var;
        o1Var.b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        o1Var.setOutsideTouchable(true);
        o1Var.setClippingEnabled(true);
        o1Var.setInputMethodMode(2);
        o1Var.setSoftInputMode(0);
        o1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            o1Var.setFocusable(true);
        }
        o1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.mr
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                nr nrVar = nr.this;
                nrVar.c();
                nrVar.b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
