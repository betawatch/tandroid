// default package

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class k3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3c b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ k3c(p3c p3cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = p3cVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.A0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        p3cVar.K0(k96.M0(2131743692, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        p3cVar.K0(k96.M0(2131743692, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    p3cVar.getMessagesController().n4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131747638, null), new g3c(p3cVar, (byte) 3));
                    String M0 = k96.M0(2131747243, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.U = M0;
                    hdVar.S = k96.M0(2131743692, null);
                    Dialog showDialog = p3cVar.showDialog(hdVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                p3cVar.A0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            p3cVar.K0(k96.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            p3cVar.K0(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue2 < 60 ? k96.G(intValue2, "Seconds", new Object[0]) : k96.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        p3cVar.C0();
                        break;
                    }
                } else if (p3cVar.getParentActivity() != null) {
                    p3cVar.k0(new f3c(p3cVar, (byte) 5));
                    break;
                }
                break;
            case 2:
                p3cVar.v0(tL_error);
                break;
            default:
                p3cVar.q0(tL_error);
                break;
        }
    }
}
