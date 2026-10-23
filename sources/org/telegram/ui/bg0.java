package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bg0 {
    public final /* synthetic */ cg0 a;

    public bg0(cg0 cg0Var) {
        this.a = cg0Var;
    }

    public final void a(rf0 rf0Var) {
        boolean z10;
        int i10;
        cg0 cg0Var = this.a;
        cg0Var.L = true;
        dg0 dg0Var = cg0Var.V;
        dg0Var.J = 0;
        dg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            boolean z11 = dg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = dg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i11 < 28 || dg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i11 < 26 || dg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            kj0 kj0Var = cg0Var.a;
            if (kj0Var != null && "888".equals(kj0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (dg0Var.v) {
                dg0Var.r.clear();
                if (!z11) {
                    dg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    dg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    dg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    dg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!dg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !dg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !dg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            dg0Var.getParentActivity().requestPermissions((String[]) dg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                    dg0Var.h = dg0Var.showDialog(alertDialog$Builder.a);
                    cg0Var.L = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ag0 ag0Var = new ag0(0, rf0Var, this);
        rf0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(ag0Var, 400L);
    }
}
