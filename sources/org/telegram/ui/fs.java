package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ fs(ns nsVar, TLRPC.User user, int i10) {
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
                if (user != null && nsVar.M == null && nsVar.N == null) {
                    if (user.phone == null && (str = nsVar.L) != null) {
                        user.phone = af.b.d(str, false);
                    }
                    nsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.k3 k3Var = nsVar.b.d;
                    k3Var.setSelection(k3Var.length());
                    nsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
                if (a2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = a2.note;
                    if (tL_textWithEntities != null) {
                        nsVar.d.setText(tL_textWithEntities);
                    } else {
                        nsVar.d.setText("");
                    }
                }
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    break;
                }
                break;
            default:
                ns.Z(this.b, this.c);
                break;
        }
    }
}
