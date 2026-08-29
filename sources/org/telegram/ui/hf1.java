package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ hf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i11) {
                            case 0:
                                twoStepVerificationActivity2.o0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity2.w0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, currentTime > 86400 ? LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]) : currentTime > 3600 ? LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]) : currentTime > 60 ? LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity2.E.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity2.y0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.N = string;
                                    c2Var.P = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity2.showDialog(c2Var, new s5(twoStepVerificationActivity2, 18));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity2.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity2.E.pending_reset_date = 0;
                                    twoStepVerificationActivity2.y0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i112) {
                            case 0:
                                twoStepVerificationActivity22.o0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity22.w0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, currentTime > 86400 ? LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]) : currentTime > 3600 ? LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]) : currentTime > 60 ? LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity22.E.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity22.y0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.N = string;
                                    c2Var.P = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity22.showDialog(c2Var, new s5(twoStepVerificationActivity22, 18));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity22.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity22.E.pending_reset_date = 0;
                                    twoStepVerificationActivity22.y0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i14 = 2;
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i15 = 3;
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i16 = 4;
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
