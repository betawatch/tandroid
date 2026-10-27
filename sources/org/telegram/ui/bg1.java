package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ bg1(fg1 fg1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = fg1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        fg1 fg1Var = this.b;
        switch (i10) {
            case 0:
                fg1Var.x0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    }
                } else {
                    fg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wf1(fg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.T = string;
                    e2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = fg1Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                fg1Var.x0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            fg1Var.H0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            fg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                            break;
                        }
                    } else {
                        fg1Var.z0();
                        break;
                    }
                } else if (fg1Var.getParentActivity() != null) {
                    fg1Var.v0(new xf1(fg1Var, 5));
                    break;
                }
                break;
            case 2:
                fg1.f0(fg1Var, tL_error);
                break;
            default:
                fg1.a0(fg1Var, tL_error);
                break;
        }
    }
}
