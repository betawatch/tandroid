package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements org.telegram.ui.ActionBar.c2, au, cn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ bm0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // org.telegram.ui.au
    public void a1(wt wtVar) {
        switch (this.a) {
            case 2:
                on0 on0Var = this.b;
                on0Var.Y[5].setText(wtVar.a);
                on0Var.s = wtVar.d;
                break;
            default:
                on0 on0Var2 = this.b;
                on0Var2.Y[0].setText(wtVar.a);
                if (on0Var2.U0.indexOf(wtVar.a) != -1) {
                    on0Var2.Z0 = true;
                    String str = (String) on0Var2.V0.get(wtVar.a);
                    on0Var2.Y[1].setText(str);
                    String str2 = (String) on0Var2.X0.get(str);
                    on0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    on0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new yl0(on0Var2, 3), 300L);
                on0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = on0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.cn0
    public void d(String str, String str2) {
        this.b.x1();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
