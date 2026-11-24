// default package

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5c b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ l5c(p5c p5cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = p5cVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                p5cVar.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        p5cVar.L0(jb6.M0(2131743618, null), tL_error.text);
                        break;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        p5cVar.L0(jb6.M0(2131743618, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    }
                } else {
                    p5cVar.getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new h5c(p5cVar, (byte) 3));
                    String M0 = jb6.M0(2131747169, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    heVar.S = jb6.M0(2131743618, null);
                    Dialog showDialog = p5cVar.showDialog(heVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                }
                break;
            case 1:
                p5cVar.B0();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            p5cVar.L0(jb6.M0(R.string.AppName, null), tL_error.text);
                            break;
                        } else {
                            int intValue2 = Utilities.z(tL_error.text).intValue();
                            p5cVar.L0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue2 < 60 ? jb6.G(intValue2, "Seconds", new Object[0]) : jb6.G(intValue2 / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        p5cVar.D0();
                        break;
                    }
                } else if (p5cVar.getParentActivity() != null) {
                    p5cVar.l0(new g5c(p5cVar, (byte) 5));
                    break;
                }
                break;
            case 2:
                p5cVar.w0(tL_error);
                break;
            default:
                p5cVar.r0(tL_error);
                break;
        }
    }
}
