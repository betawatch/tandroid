package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements org.telegram.ui.ActionBar.a2, zt, cn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ am0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // org.telegram.ui.zt
    public void a1(vt vtVar) {
        switch (this.a) {
            case 2:
                on0 on0Var = this.b;
                on0Var.Y[5].setText(vtVar.a);
                on0Var.s = vtVar.d;
                break;
            default:
                on0 on0Var2 = this.b;
                on0Var2.Y[0].setText(vtVar.a);
                if (on0Var2.U0.indexOf(vtVar.a) != -1) {
                    on0Var2.Z0 = true;
                    String str = (String) on0Var2.V0.get(vtVar.a);
                    on0Var2.Y[1].setText(str);
                    String str2 = (String) on0Var2.X0.get(str);
                    on0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    on0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new xl0(on0Var2, 3), 300L);
                on0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = on0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.cn0
    public void b(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                on0 on0Var = this.b;
                on0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    on0Var.getParentActivity().startActivity(intent);
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
                on0.a0(this.b);
                break;
            case 4:
                nf.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
