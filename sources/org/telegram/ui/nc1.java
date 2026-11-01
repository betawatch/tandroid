package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ nc1(rc1 rc1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = rc1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        rc1 rc1Var = this.b;
        switch (i10) {
            case 0:
                rc1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        rc1Var.L0(org.telegram.messenger.dd.L0(2131743956, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        rc1Var.L0(org.telegram.messenger.dd.L0(2131743956, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    rc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new jc1(rc1Var, 3));
                    String L0 = org.telegram.messenger.dd.L0(2131747452, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.T = L0;
                    x1Var.R = org.telegram.messenger.dd.L0(2131743956, null);
                    Dialog showDialog = rc1Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                rc1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            rc1Var.L0(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            rc1Var.L0(org.telegram.messenger.dd.L0(R.string.AppName, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        rc1Var.D0();
                        break;
                    }
                } else if (rc1Var.getParentActivity() != null) {
                    rc1Var.z0(new ic1(rc1Var, 5));
                    break;
                }
                break;
            case 2:
                rc1.j0(rc1Var, tL_error);
                break;
            default:
                rc1.e0(rc1Var, tL_error);
                break;
        }
    }
}
