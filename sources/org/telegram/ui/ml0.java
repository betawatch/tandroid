package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements org.telegram.ui.ActionBar.a2, pt, mm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ ml0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        switch (this.a) {
            case 2:
                xm0 xm0Var = this.b;
                xm0Var.Y[5].setText(ktVar.a);
                xm0Var.s = ktVar.d;
                break;
            default:
                xm0 xm0Var2 = this.b;
                xm0Var2.Y[0].setText(ktVar.a);
                if (xm0Var2.U0.indexOf(ktVar.a) != -1) {
                    xm0Var2.Z0 = true;
                    String str = (String) xm0Var2.V0.get(ktVar.a);
                    xm0Var2.Y[1].setText(str);
                    String str2 = (String) xm0Var2.X0.get(str);
                    xm0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    xm0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new jl0(xm0Var2, 3), 300L);
                xm0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = xm0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                xm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    xm0Var.getParentActivity().startActivity(intent);
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
                xm0.a0(this.b);
                break;
            case 4:
                pf.d.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }

    @Override // org.telegram.ui.mm0
    public void p(String str, String str2) {
        this.b.w1();
    }
}
