package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm0 implements org.telegram.ui.ActionBar.b2, bu, en0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ cm0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // org.telegram.ui.bu
    public void a1(xt xtVar) {
        switch (this.a) {
            case 2:
                qn0 qn0Var = this.b;
                qn0Var.Y[5].setText(xtVar.a);
                qn0Var.s = xtVar.d;
                break;
            default:
                qn0 qn0Var2 = this.b;
                qn0Var2.Y[0].setText(xtVar.a);
                if (qn0Var2.U0.indexOf(xtVar.a) != -1) {
                    qn0Var2.Z0 = true;
                    String str = (String) qn0Var2.V0.get(xtVar.a);
                    qn0Var2.Y[1].setText(str);
                    String str2 = (String) qn0Var2.X0.get(str);
                    qn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    qn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new zl0(qn0Var2, 3), 300L);
                qn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = qn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.en0
    public void b(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.b;
                qn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    qn0Var.getParentActivity().startActivity(intent);
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
                qn0.a0(this.b);
                break;
            case 4:
                nf.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
