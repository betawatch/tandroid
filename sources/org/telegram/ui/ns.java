package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ns(ws wsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = wsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ws wsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && wsVar.M == null && wsVar.N == null) {
                    if (user.phone == null && (str = wsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    wsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = wsVar.b.b;
                    h3Var.setSelection(h3Var.length());
                    wsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        wsVar.d.setText(tL_textWithEntities);
                    } else {
                        wsVar.d.setText("");
                    }
                }
                if (wsVar.J) {
                    wsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.b);
                    break;
                }
                break;
            default:
                ws.V(this.b, this.c);
                break;
        }
    }
}
