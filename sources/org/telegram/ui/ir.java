package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ir(qr qrVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = qrVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && qrVar.N == null && qrVar.O == null) {
                    if (user.phone == null && (str = qrVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    qrVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = qrVar.b.d;
                    i3Var.setSelection(i3Var.length());
                    qrVar.c.setText(user.last_name);
                }
                TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                if (d2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = d2.note;
                    if (tL_textWithEntities != null) {
                        qrVar.d.setText(tL_textWithEntities);
                    } else {
                        qrVar.d.setText("");
                    }
                }
                if (qrVar.K) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.I3(qrVar.d.d);
                    break;
                }
                break;
            default:
                qr.a0(this.b, this.c);
                break;
        }
    }
}
