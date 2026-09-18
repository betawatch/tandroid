package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class xr {
    public final org.telegram.ui.ActionBar.o1 a;
    public boolean b;

    public xr(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, f6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new vr(this, 0));
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
        o1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.wr
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                xr xrVar = xr.this;
                xrVar.c();
                xrVar.b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a;
        if (o1Var != null) {
            o1Var.d(true);
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
