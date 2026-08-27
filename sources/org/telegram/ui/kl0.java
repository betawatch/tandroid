package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements org.telegram.ui.ActionBar.a2, st, mm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ kl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // org.telegram.ui.mm0
    public void S(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.st
    public void Z0(nt ntVar) {
        switch (this.a) {
            case 2:
                xm0 xm0Var = this.b;
                xm0Var.U[5].setText(ntVar.a);
                xm0Var.s = ntVar.d;
                break;
            default:
                xm0 xm0Var2 = this.b;
                xm0Var2.U[0].setText(ntVar.a);
                if (xm0Var2.Q0.indexOf(ntVar.a) != -1) {
                    xm0Var2.V0 = true;
                    String str = (String) xm0Var2.R0.get(ntVar.a);
                    xm0Var2.U[1].setText(str);
                    String str2 = (String) xm0Var2.T0.get(str);
                    xm0Var2.U[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    xm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(xm0Var2, 3), 300L);
                xm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = xm0Var2.U[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                xm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    xm0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                xm0.a0(this.b);
                break;
            case 4:
                we.e.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
