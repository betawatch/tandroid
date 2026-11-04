package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.Components.t;
import org.telegram.ui.Components.yj;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public boolean a;
    public Object b;

    public a(Context context, e6 e6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, e6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yj(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        k(actionBarPopupWindow$ActionBarPopupWindowLayout);
        f1 f1Var = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.b = f1Var;
        f1Var.b = false;
        f1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        f1Var.setOutsideTouchable(true);
        f1Var.setClippingEnabled(true);
        f1Var.setInputMethodMode(2);
        f1Var.setSoftInputMode(0);
        f1Var.getContentView().setFocusableInTouchMode(true);
        if (g0.C1()) {
            f1Var.setFocusable(true);
        }
        f1Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.cr
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                k.a aVar = k.a.this;
                aVar.l();
                aVar.a = false;
            }
        });
    }

    public void a() {
        f1 f1Var = (f1) this.b;
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    public abstract void c();

    public abstract View d();

    public abstract l.k e();

    public abstract h f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void l();

    public abstract void m(View view);

    public abstract void n(int i3);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i3);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z10);
}
