package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ms b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ds(ms msVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = msVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ms msVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && msVar.M == null && msVar.N == null) {
                    if (user.phone == null && (str = msVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    msVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = msVar.b.b;
                    h3Var.setSelection(h3Var.length());
                    msVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = msVar.getMessagesController().getUserFull(msVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        msVar.d.setText(tL_textWithEntities);
                    } else {
                        msVar.d.setText("");
                    }
                }
                if (msVar.J) {
                    msVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.b);
                    break;
                }
                break;
            default:
                ms.V(this.b, this.c);
                break;
        }
    }
}
