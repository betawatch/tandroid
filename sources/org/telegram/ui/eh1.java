package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ eh1(ih1 ih1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = ih1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        ih1 ih1Var = this.b;
        switch (i10) {
            case 0:
                ih1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    }
                } else {
                    ih1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ih1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new zg1(ih1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.T = string;
                    c2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ih1Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                ih1Var.w0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            ih1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            ih1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                            break;
                        }
                    } else {
                        ih1Var.y0();
                        break;
                    }
                } else if (ih1Var.getParentActivity() != null) {
                    ih1Var.u0(new ah1(ih1Var, 5));
                    break;
                }
                break;
            case 2:
                ih1.e0(ih1Var, tL_error);
                break;
            default:
                ih1.Z(ih1Var, tL_error);
                break;
        }
    }
}
