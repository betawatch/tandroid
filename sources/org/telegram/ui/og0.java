package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class og0 {
    public final /* synthetic */ pg0 a;

    public og0(pg0 pg0Var) {
        this.a = pg0Var;
    }

    public final void a(eg0 eg0Var) {
        int i10;
        pg0 pg0Var = this.a;
        pg0Var.L = true;
        qg0 qg0Var = pg0Var.V;
        qg0Var.J = 0;
        qg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = qg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = qg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || qg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || qg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            uj0 uj0Var = pg0Var.a;
            if (uj0Var != null && "888".equals(uj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (qg0Var.v) {
                qg0Var.r.clear();
                if (!z10) {
                    qg0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    qg0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    qg0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    qg0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!qg0Var.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !qg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !qg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            qg0Var.getParentActivity().requestPermissions((String[]) qg0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
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
                    qg0Var.h = qg0Var.showDialog(alertDialog$Builder.a);
                    pg0Var.L = true;
                    return;
                }
            }
        }
        ng0 ng0Var = new ng0(0, eg0Var, this);
        eg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(ng0Var, 400L);
    }
}
