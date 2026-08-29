package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements org.telegram.ui.ActionBar.b2, qt, jm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ hl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // org.telegram.ui.jm0
    public void M(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.qt
    public void Z0(lt ltVar) {
        switch (this.a) {
            case 2:
                vm0 vm0Var = this.b;
                vm0Var.U[5].setText(ltVar.a);
                vm0Var.s = ltVar.d;
                break;
            default:
                vm0 vm0Var2 = this.b;
                vm0Var2.U[0].setText(ltVar.a);
                if (vm0Var2.Q0.indexOf(ltVar.a) != -1) {
                    vm0Var2.V0 = true;
                    String str = (String) vm0Var2.R0.get(ltVar.a);
                    vm0Var2.U[1].setText(str);
                    String str2 = (String) vm0Var2.T0.get(str);
                    vm0Var2.U[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    vm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new el0(vm0Var2, 3), 300L);
                vm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = vm0Var2.U[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                vm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vm0Var.getParentActivity().startActivity(intent);
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
                vm0.a0(this.b);
                break;
            case 4:
                ye.d.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
