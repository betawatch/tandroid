package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class yr {
    public final org.telegram.ui.ActionBar.m1 a;
    public boolean b;

    public yr(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, d6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new wr(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new s(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.a = m1Var;
        m1Var.b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        m1Var.setOutsideTouchable(true);
        m1Var.setClippingEnabled(true);
        m1Var.setInputMethodMode(2);
        m1Var.setSoftInputMode(0);
        m1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            m1Var.setFocusable(true);
        }
        m1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.xr
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                yr yrVar = yr.this;
                yrVar.c();
                yrVar.b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
