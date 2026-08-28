package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements org.telegram.ui.ActionBar.b2, pt, lm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ kl0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // org.telegram.ui.lm0
    public void T(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.pt
    public void a1(lt ltVar) {
        switch (this.a) {
            case 2:
                wm0 wm0Var = this.b;
                wm0Var.U[5].setText(ltVar.a);
                wm0Var.s = ltVar.d;
                break;
            default:
                wm0 wm0Var2 = this.b;
                wm0Var2.U[0].setText(ltVar.a);
                if (wm0Var2.Q0.indexOf(ltVar.a) != -1) {
                    wm0Var2.V0 = true;
                    String str = (String) wm0Var2.R0.get(ltVar.a);
                    wm0Var2.U[1].setText(str);
                    String str2 = (String) wm0Var2.T0.get(str);
                    wm0Var2.U[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    wm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(wm0Var2, 3), 300L);
                wm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = wm0Var2.U[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                wm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wm0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                wm0.Z(this.b);
                break;
            case 4:
                ve.e.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
