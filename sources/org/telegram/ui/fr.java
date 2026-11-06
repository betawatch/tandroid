package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ fr(nr nrVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = nrVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                nr nrVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && nrVar.M == null && nrVar.N == null) {
                    if (user.phone == null && (str = nrVar.L) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    nrVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = nrVar.b.d;
                    i3Var.setSelection(i3Var.length());
                    nrVar.c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = nrVar.getMessagesController().b2(nrVar.H);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        nrVar.d.setText(tL_textWithEntities);
                    } else {
                        nrVar.d.setText("");
                    }
                }
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    break;
                }
                break;
            default:
                nr.a0(this.b, this.c);
                break;
        }
    }
}
