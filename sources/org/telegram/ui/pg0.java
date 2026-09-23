package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pg0 {
    public final /* synthetic */ qg0 a;

    public pg0(qg0 qg0Var) {
        this.a = qg0Var;
    }

    public final void a(fg0 fg0Var) {
        int i10;
        qg0 qg0Var = this.a;
        qg0Var.L = true;
        rg0 rg0Var = qg0Var.V;
        rg0Var.J = 0;
        rg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = rg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = rg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || rg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || rg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            uj0 uj0Var = qg0Var.a;
            if (uj0Var != null && "888".equals(uj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (rg0Var.v) {
                rg0Var.r.clear();
                if (!z10) {
                    rg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    rg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    rg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    rg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!rg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !rg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !rg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            rg0Var.getParentActivity().requestPermissions((String[]) rg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                    rg0Var.h = rg0Var.showDialog(alertDialog$Builder.a);
                    qg0Var.L = true;
                    return;
                }
            }
        }
        og0 og0Var = new og0(0, fg0Var, this);
        fg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(og0Var, 400L);
    }
}
