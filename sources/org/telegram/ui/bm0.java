package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements org.telegram.ui.ActionBar.a2, yt, bn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public /* synthetic */ bm0(nn0 nn0Var, int i10) {
        this.a = i10;
        this.b = nn0Var;
    }

    @Override // org.telegram.ui.yt
    public void U0(ut utVar) {
        switch (this.a) {
            case 2:
                nn0 nn0Var = this.b;
                nn0Var.Y[5].setText(utVar.a);
                nn0Var.s = utVar.d;
                break;
            default:
                nn0 nn0Var2 = this.b;
                nn0Var2.Y[0].setText(utVar.a);
                if (nn0Var2.U0.indexOf(utVar.a) != -1) {
                    nn0Var2.Z0 = true;
                    String str = (String) nn0Var2.V0.get(utVar.a);
                    nn0Var2.Y[1].setText(str);
                    String str2 = (String) nn0Var2.X0.get(str);
                    nn0Var2.Y[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    nn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new yl0(nn0Var2, 3), 300L);
                nn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = nn0Var2.Y[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.bn0
    public void c(String str, String str2) {
        this.b.w1();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                nn0 nn0Var = this.b;
                nn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    nn0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                nn0.a0(this.b);
                break;
            case 4:
                of.f.s(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(this.b.currentAccount).getClientPhone());
                break;
        }
    }
}
