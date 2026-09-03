package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mg0 {
    public final /* synthetic */ ng0 a;

    public mg0(ng0 ng0Var) {
        this.a = ng0Var;
    }

    public final void a(cg0 cg0Var) {
        int i10;
        ng0 ng0Var = this.a;
        ng0Var.I = true;
        og0 og0Var = ng0Var.S;
        og0Var.G = 0;
        og0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z4 = og0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z10 = og0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z11 = i11 < 28 || og0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z12 = i11 < 26 || og0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            rj0 rj0Var = ng0Var.a;
            if (rj0Var != null && "888".equals(rj0Var.getText())) {
                z4 = true;
                z10 = true;
                z11 = true;
                z12 = true;
            }
            if (og0Var.v) {
                og0Var.r.clear();
                if (!z4) {
                    og0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z10) {
                    og0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z11) {
                    og0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z12 && i11 >= 26) {
                    og0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!og0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !og0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !og0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            og0Var.getParentActivity().requestPermissions((String[]) og0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z4 && (!z10 || !z11)) {
                        alertDialog$Builder.a.Q = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z10 && z11) {
                        alertDialog$Builder.a.Q = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.Q = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
                    og0Var.h = og0Var.showDialog(alertDialog$Builder.a);
                    ng0Var.I = true;
                    return;
                }
            }
        }
        lg0 lg0Var = new lg0(0, cg0Var, this);
        cg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(lg0Var, 400L);
    }
}
