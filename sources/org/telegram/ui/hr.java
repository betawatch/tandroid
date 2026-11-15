package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ hr(pr prVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = prVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && prVar.N == null && prVar.O == null) {
                    if (user.phone == null && (str = prVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    prVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = prVar.b.d;
                    i3Var.setSelection(i3Var.length());
                    prVar.c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.I);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        prVar.d.setText(tL_textWithEntities);
                    } else {
                        prVar.d.setText("");
                    }
                }
                if (prVar.K) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.J3(prVar.d.d);
                    break;
                }
                break;
            default:
                pr.a0(this.b, this.c);
                break;
        }
    }
}
