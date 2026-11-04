package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ la1(ra1 ra1Var, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.b = ra1Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.TL_error tL_error = this.c;
        ra1 ra1Var = this.b;
        switch (i3) {
            case 0:
                ra1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    ra1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ha1(ra1Var, 3));
                    String M0 = org.telegram.messenger.bd.M0(2131747444, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.U = M0;
                    s1Var.S = org.telegram.messenger.bd.M0(2131743941, null);
                    Dialog showDialog = ra1Var.showDialog(s1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                ra1Var.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        ra1Var.D0();
                        break;
                    }
                } else if (ra1Var.getParentActivity() != null) {
                    ra1Var.z0(new ga1(ra1Var, 5));
                    break;
                }
                break;
            case 2:
                ra1.j0(ra1Var, tL_error);
                break;
            default:
                ra1.e0(ra1Var, tL_error);
                break;
        }
    }
}
