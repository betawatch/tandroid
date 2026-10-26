package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class eg0 {
    public final /* synthetic */ fg0 a;

    public eg0(fg0 fg0Var) {
        this.a = fg0Var;
    }

    public final void a(tf0 tf0Var) {
        boolean z10;
        int i10;
        fg0 fg0Var = this.a;
        fg0Var.N = true;
        gg0 gg0Var = fg0Var.a0;
        gg0Var.J = 0;
        gg0Var.s1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            boolean z11 = gg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = gg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i11 < 28 || gg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i11 < 26 || gg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            mj0 mj0Var = fg0Var.a;
            if (mj0Var != null && "888".equals(mj0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (gg0Var.v) {
                gg0Var.r.clear();
                if (!z11) {
                    gg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    gg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    gg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    gg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!gg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !gg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !gg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            gg0Var.getParentActivity().requestPermissions((String[]) gg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
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
                    int i12 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    gg0Var.h = gg0Var.showDialog(alertDialog$Builder.a);
                    fg0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        dg0 dg0Var = new dg0(0, tf0Var, this);
        tf0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(dg0Var, 400L);
    }
}
