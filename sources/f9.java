// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class f9 {
    public boolean a;
    public Object b;

    public f9(Context context, f53 f53Var, boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z ? 1 : 0, f53Var, context);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        byte b = 4;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new a7(this, b));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vu2(this, (byte) 10));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        j(actionBarPopupWindow$ActionBarPopupWindowLayout);
        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.b = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(R.style.PopupContextAnimation2);
        m8Var.setOutsideTouchable(true);
        m8Var.setClippingEnabled(true);
        m8Var.setInputMethodMode(2);
        m8Var.setSoftInputMode(0);
        m8Var.getContentView().setFocusableInTouchMode(true);
        if (gl.A1()) {
            m8Var.setFocusable(true);
        }
        m8Var.setOnDismissListener(new x6(this, b));
    }

    public final void a() {
        m8 m8Var = (m8) this.b;
        if (m8Var != null) {
            m8Var.d(true);
        }
    }

    public abstract void b();

    public abstract View c();

    public abstract yz6 d();

    public abstract xbb e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract void h();

    public abstract boolean i();

    public abstract void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void l(View view);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(boolean z);

    public void k() {
    }
}
