package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements org.telegram.ui.ActionBar.z1, qt, om0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ nl0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
    }

    @Override // org.telegram.ui.qt
    public void L0(lt ltVar) {
        switch (this.a) {
            case 2:
                an0 an0Var = this.b;
                an0Var.Y[5].setText(ltVar.a);
                an0Var.s = ltVar.d;
                break;
            default:
                an0 an0Var2 = this.b;
                an0Var2.Y[0].setText(ltVar.a);
                if (an0Var2.U0.indexOf(ltVar.a) != -1) {
                    an0Var2.Z0 = true;
                    String str = (String) an0Var2.V0.get(ltVar.a);
                    an0Var2.Y[1].setText(str);
                    String str2 = (String) an0Var2.X0.get(str);
                    an0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    an0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new kl0(an0Var2, 3), 300L);
                an0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = an0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.om0
    public void a(String str, String str2) {
        this.b.w1();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                an0 an0Var = this.b;
                an0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    an0Var.getParentActivity().startActivity(intent);
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
                an0.a0(this.b);
                break;
            case 4:
                pf.d.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
