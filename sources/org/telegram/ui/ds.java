package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ds(ls lsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = lsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ls lsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && lsVar.M == null && lsVar.N == null) {
                    if (user.phone == null && (str = lsVar.L) != null) {
                        user.phone = kf.b.d(str, false);
                    }
                    lsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = lsVar.b.d;
                    e3Var.setSelection(e3Var.length());
                    lsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        lsVar.d.setText(tL_textWithEntities);
                    } else {
                        lsVar.d.setText("");
                    }
                }
                if (lsVar.J) {
                    lsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(lsVar.d.d);
                    break;
                }
                break;
            default:
                ls.W(this.b, this.c);
                break;
        }
    }
}
