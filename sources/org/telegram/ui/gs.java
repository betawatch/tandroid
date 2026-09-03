package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ gs(ps psVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = psVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ps psVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && psVar.J == null && psVar.K == null) {
                    if (user.phone == null && (str = psVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    psVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.f3 f3Var = psVar.b.b;
                    f3Var.setSelection(f3Var.length());
                    psVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        psVar.d.setText(tL_textWithEntities);
                    } else {
                        psVar.d.setText("");
                    }
                }
                if (psVar.G) {
                    psVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.b);
                    break;
                }
                break;
            default:
                ps.V(this.b, this.c);
                break;
        }
    }
}
