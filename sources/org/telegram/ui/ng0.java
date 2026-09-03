package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ng0 {
    public final /* synthetic */ og0 a;

    public ng0(og0 og0Var) {
        this.a = og0Var;
    }

    public final void a(dg0 dg0Var) {
        int i10;
        og0 og0Var = this.a;
        og0Var.I = true;
        pg0 pg0Var = og0Var.S;
        pg0Var.G = 0;
        pg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z4 = pg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z10 = pg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z11 = i11 < 28 || pg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z12 = i11 < 26 || pg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            sj0 sj0Var = og0Var.a;
            if (sj0Var != null && "888".equals(sj0Var.getText())) {
                z4 = true;
                z10 = true;
                z11 = true;
                z12 = true;
            }
            if (pg0Var.v) {
                pg0Var.r.clear();
                if (!z4) {
                    pg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z10) {
                    pg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z11) {
                    pg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z12 && i11 >= 26) {
                    pg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!pg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !pg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !pg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            pg0Var.getParentActivity().requestPermissions((String[]) pg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
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
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    pg0Var.h = pg0Var.showDialog(alertDialog$Builder.a);
                    og0Var.I = true;
                    return;
                }
            }
        }
        mg0 mg0Var = new mg0(0, dg0Var, this);
        dg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(mg0Var, 400L);
    }
}
