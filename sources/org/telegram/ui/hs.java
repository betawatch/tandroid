package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ hs(qs qsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = qsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                qs qsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    qsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.b.b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        qsVar.d.setText(tL_textWithEntities);
                    } else {
                        qsVar.d.setText("");
                    }
                }
                if (qsVar.J) {
                    qsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.b);
                    break;
                }
                break;
            default:
                qs.V(this.b, this.c);
                break;
        }
    }
}
