package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements org.telegram.ui.ActionBar.a2, nt, km0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ kl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // org.telegram.ui.nt
    public void L0(ht htVar) {
        switch (this.a) {
            case 2:
                vm0 vm0Var = this.b;
                vm0Var.Y[5].setText(htVar.a);
                vm0Var.s = htVar.d;
                break;
            default:
                vm0 vm0Var2 = this.b;
                vm0Var2.Y[0].setText(htVar.a);
                if (vm0Var2.U0.indexOf(htVar.a) != -1) {
                    vm0Var2.Z0 = true;
                    String str = (String) vm0Var2.V0.get(htVar.a);
                    vm0Var2.Y[1].setText(str);
                    String str2 = (String) vm0Var2.X0.get(str);
                    vm0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    vm0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(vm0Var2, 3), 300L);
                vm0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = vm0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                vm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vm0Var.getParentActivity().startActivity(intent);
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
                vm0.a0(this.b);
                break;
            case 4:
                pf.d.r(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }

    @Override // org.telegram.ui.km0
    public void p(String str, String str2) {
        this.b.w1();
    }
}
