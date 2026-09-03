package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ ox0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.a = i10;
        this.b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                px0 px0Var = privacySettingsActivity.a;
                if (px0Var != null && (i10 = privacySettingsActivity.s) >= 0) {
                    px0Var.m(i10);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.U(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String string;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.a.Q = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new ox0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.a);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                privacySettingsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.b;
                boolean[] zArr = privacySettingsActivity2.W;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new nh.p5(4));
                boolean z4 = zArr[0];
                if (z4 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z4) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                }
                org.telegram.ui.Components.qc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                break;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.b;
                org.telegram.ui.ActionBar.d2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.c = o10;
                o10.d0 = false;
                if (privacySettingsActivity3.P != privacySettingsActivity3.Q) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z10 = privacySettingsActivity3.Q;
                    userConfig.syncContacts = z10;
                    privacySettingsActivity3.P = z10;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new nx0(privacySettingsActivity3, 1));
                break;
            case 4:
                pg0 pg0Var = new pg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.b;
                nx0 nx0Var = new nx0(privacySettingsActivity4, 2);
                pg0Var.C = 3;
                pg0Var.a = 12;
                pg0Var.a0 = nx0Var;
                privacySettingsActivity4.presentFragment(pg0Var);
                break;
        }
    }
}
