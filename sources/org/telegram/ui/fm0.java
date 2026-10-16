package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements org.telegram.ui.ActionBar.z1, eu, gn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn0 b;

    public /* synthetic */ fm0(sn0 sn0Var, int i10) {
        this.a = i10;
        this.b = sn0Var;
    }

    @Override // org.telegram.ui.eu
    public void Z0(au auVar) {
        switch (this.a) {
            case 2:
                sn0 sn0Var = this.b;
                sn0Var.Y[5].setText(auVar.a);
                sn0Var.s = auVar.d;
                break;
            default:
                sn0 sn0Var2 = this.b;
                sn0Var2.Y[0].setText(auVar.a);
                if (sn0Var2.U0.indexOf(auVar.a) != -1) {
                    sn0Var2.Z0 = true;
                    String str = (String) sn0Var2.V0.get(auVar.a);
                    sn0Var2.Y[1].setText(str);
                    String str2 = (String) sn0Var2.X0.get(str);
                    sn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    sn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new cm0(sn0Var2, 3), 300L);
                sn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = sn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.gn0
    public void d(String str, String str2) {
        this.b.w1();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                sn0 sn0Var = this.b;
                sn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sn0Var.getParentActivity().startActivity(intent);
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
                sn0.a0(this.b);
                break;
            case 4:
                pf.d.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
