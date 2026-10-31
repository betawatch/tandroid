package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ pc1(tc1 tc1Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = tc1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_error tL_error = this.c;
        tc1 tc1Var = this.b;
        switch (i10) {
            case 0:
                tc1Var.A0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        tc1Var.K0(org.telegram.messenger.cd.L0(2131743956, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        tc1Var.K0(org.telegram.messenger.cd.L0(2131743956, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new lc1(tc1Var, 3));
                    String L0 = org.telegram.messenger.cd.L0(2131747452, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.T = L0;
                    x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
                    Dialog showDialog = tc1Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                tc1Var.A0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        tc1Var.C0();
                        break;
                    }
                } else if (tc1Var.getParentActivity() != null) {
                    tc1Var.y0(new kc1(tc1Var, 5));
                    break;
                }
                break;
            case 2:
                tc1.i0(tc1Var, tL_error);
                break;
            default:
                tc1.d0(tc1Var, tL_error);
                break;
        }
    }
}
