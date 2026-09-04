package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm0 implements org.telegram.ui.ActionBar.a2, au, dn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ cm0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    @Override // org.telegram.ui.au
    public void a1(vt vtVar) {
        switch (this.a) {
            case 2:
                pn0 pn0Var = this.b;
                pn0Var.Y[5].setText(vtVar.a);
                pn0Var.s = vtVar.d;
                break;
            default:
                pn0 pn0Var2 = this.b;
                pn0Var2.Y[0].setText(vtVar.a);
                if (pn0Var2.U0.indexOf(vtVar.a) != -1) {
                    pn0Var2.Z0 = true;
                    String str = (String) pn0Var2.V0.get(vtVar.a);
                    pn0Var2.Y[1].setText(str);
                    String str2 = (String) pn0Var2.X0.get(str);
                    pn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    pn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new zl0(pn0Var2, 3), 300L);
                pn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = pn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.dn0
    public void b(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.b;
                pn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pn0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                pn0.a0(this.b);
                break;
            case 4:
                of.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
