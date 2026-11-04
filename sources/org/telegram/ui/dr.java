package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ dr(lr lrVar, TLRPC.User user, int i3) {
        this.a = i3;
        this.b = lrVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && lrVar.N == null && lrVar.O == null) {
                    if (user.phone == null && (str = lrVar.M) != null) {
                        user.phone = mf.b.d(str, false);
                    }
                    lrVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = lrVar.b.d;
                    i3Var.setSelection(i3Var.length());
                    lrVar.c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = lrVar.getMessagesController().b2(lrVar.I);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        lrVar.d.setText(tL_textWithEntities);
                    } else {
                        lrVar.d.setText("");
                    }
                }
                if (lrVar.K) {
                    lrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(lrVar.d.d);
                    break;
                }
                break;
            default:
                lr.a0(this.b, this.c);
                break;
        }
    }
}
