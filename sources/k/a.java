package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a {
    public boolean a;
    public Object b;

    public a(Context context, p6 p6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, p6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new bk(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        j(actionBarPopupWindow$ActionBarPopupWindowLayout);
        k1 k1Var = new k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.b = k1Var;
        k1Var.b = false;
        k1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        k1Var.setOutsideTouchable(true);
        k1Var.setClippingEnabled(true);
        k1Var.setInputMethodMode(2);
        k1Var.setSoftInputMode(0);
        k1Var.getContentView().setFocusableInTouchMode(true);
        if (i0.C1()) {
            k1Var.setFocusable(true);
        }
        k1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.mr
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                k.a aVar = k.a.this;
                aVar.k();
                aVar.a = false;
            }
        });
    }

    public void a() {
        k1 k1Var = (k1) this.b;
        if (k1Var != null) {
            k1Var.dismiss();
        }
    }

    public abstract void b();

    public abstract View c();

    public abstract l.l d();

    public abstract h e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract void h();

    public abstract boolean i();

    public abstract void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void k();

    public abstract void l(View view);

    public abstract void m(int i10);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i10);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z10);
}
