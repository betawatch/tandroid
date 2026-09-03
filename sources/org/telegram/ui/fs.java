package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ fs(os osVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = osVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                os osVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && osVar.J == null && osVar.K == null) {
                    if (user.phone == null && (str = osVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    osVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = osVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    osVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        osVar.d.setText(tL_textWithEntities);
                    } else {
                        osVar.d.setText("");
                    }
                }
                if (osVar.G) {
                    osVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.b);
                    break;
                }
                break;
            default:
                os.V(this.b, this.c);
                break;
        }
    }
}
