package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class js implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ js(ss ssVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = ssVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ss ssVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = ssVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    ssVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        ssVar.d.setText(tL_textWithEntities);
                    } else {
                        ssVar.d.setText("");
                    }
                }
                if (ssVar.J) {
                    ssVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.b);
                    break;
                }
                break;
            default:
                ss.V(this.b, this.c);
                break;
        }
    }
}
