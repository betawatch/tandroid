package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ls(us usVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = usVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                us usVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && usVar.M == null && usVar.N == null) {
                    if (user.phone == null && (str = usVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    usVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = usVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    usVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        usVar.d.setText(tL_textWithEntities);
                    } else {
                        usVar.d.setText("");
                    }
                }
                if (usVar.J) {
                    usVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.b);
                    break;
                }
                break;
            default:
                us.V(this.b, this.c);
                break;
        }
    }
}
