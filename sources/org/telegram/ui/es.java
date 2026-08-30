package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ es(ns nsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = nsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ns nsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && nsVar.J == null && nsVar.K == null) {
                    if (user.phone == null && (str = nsVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    nsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = nsVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    nsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        nsVar.d.setText(tL_textWithEntities);
                    } else {
                        nsVar.d.setText("");
                    }
                }
                if (nsVar.G) {
                    nsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.b);
                    break;
                }
                break;
            default:
                ns.V(this.b, this.c);
                break;
        }
    }
}
