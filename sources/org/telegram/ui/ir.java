package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (user != null && qrVar.M == null && qrVar.N == null) {
                    if (user.phone == null && (str = qrVar.L) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    qrVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = qrVar.b.d;
                    i3Var.setSelection(i3Var.length());
                    qrVar.c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = qrVar.getMessagesController().b2(qrVar.H);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        qrVar.d.setText(tL_textWithEntities);
                    } else {
                        qrVar.d.setText("");
                    }
                }
                if (qrVar.J) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(qrVar.d.d);
                    break;
                }
                break;
            default:
                qr.a0(this.b, this.c);
                break;
        }
    }
}
