package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements org.telegram.ui.ActionBar.u1, qt, zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ ak0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // org.telegram.ui.qt
    public void c(nt ntVar) {
        switch (this.a) {
            case 2:
                ll0 ll0Var = this.b;
                ll0Var.Y[5].setText(ntVar.a);
                ll0Var.s = ntVar.d;
                break;
            default:
                ll0 ll0Var2 = this.b;
                ll0Var2.Y[0].setText(ntVar.a);
                if (ll0Var2.U0.indexOf(ntVar.a) != -1) {
                    ll0Var2.Z0 = true;
                    String str = (String) ll0Var2.V0.get(ntVar.a);
                    ll0Var2.Y[1].setText(str);
                    String str2 = (String) ll0Var2.X0.get(str);
                    ll0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    ll0Var2.Z0 = false;
                }
                org.telegram.messenger.i0.h3(new xj0(ll0Var2, 3), 300L);
                ll0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = ll0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.zk0
    public void d(String str, String str2) {
        this.b.A1();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    ll0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                ll0.e0(this.b);
                break;
            case 4:
                gf.f.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.d20.i(this.b.currentAccount).d());
                break;
        }
    }
}
