package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                    org.telegram.ui.Cells.j3 j3Var = qrVar.b.d;
                    j3Var.setSelection(j3Var.length());
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
