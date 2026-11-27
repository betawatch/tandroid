// default package

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k7c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o7c b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ k7c(o7c o7cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = o7cVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        o7cVar.L0(ob6.M0(2131743586, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        o7cVar.L0(ob6.M0(2131743586, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    o7cVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new g7c(o7cVar, (byte) 3));
                    String M0 = ob6.M0(2131747163, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    idVar.S = ob6.M0(2131743586, null);
                    Dialog showDialog = o7cVar.showDialog(idVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                o7cVar.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            o7cVar.L0(ob6.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            o7cVar.L0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue2 < 60 ? ob6.G(intValue2, "Seconds", new Object[0]) : ob6.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        o7cVar.D0();
                        break;
                    }
                } else if (o7cVar.getParentActivity() != null) {
                    o7cVar.k0(new f7c(o7cVar, (byte) 5));
                    break;
                }
                break;
            case 2:
                o7cVar.w0(tL_error);
                break;
            default:
                o7cVar.q0(tL_error);
                break;
        }
    }
}
