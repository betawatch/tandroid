package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm0 implements org.telegram.ui.ActionBar.z1, eu, hn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un0 b;

    public /* synthetic */ hm0(un0 un0Var, int i10) {
        this.a = i10;
        this.b = un0Var;
    }

    @Override // org.telegram.ui.eu
    public void a1(au auVar) {
        switch (this.a) {
            case 2:
                un0 un0Var = this.b;
                un0Var.Y[5].setText(auVar.a);
                un0Var.s = auVar.d;
                break;
            default:
                un0 un0Var2 = this.b;
                un0Var2.Y[0].setText(auVar.a);
                if (un0Var2.U0.indexOf(auVar.a) != -1) {
                    un0Var2.Z0 = true;
                    String str = (String) un0Var2.V0.get(auVar.a);
                    un0Var2.Y[1].setText(str);
                    String str2 = (String) un0Var2.X0.get(str);
                    un0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    un0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new em0(un0Var2, 3), 300L);
                un0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = un0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                un0 un0Var = this.b;
                un0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    un0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                un0.a0(this.b);
                break;
            case 4:
                pf.d.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }

    @Override // org.telegram.ui.hn0
    public void o(String str, String str2) {
        this.b.w1();
    }
}
