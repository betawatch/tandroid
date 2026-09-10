package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ks(ts tsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = tsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ts tsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && tsVar.M == null && tsVar.N == null) {
                    if (user.phone == null && (str = tsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    tsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = tsVar.b.b;
                    g3Var.setSelection(g3Var.length());
                    tsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        tsVar.d.setText(tL_textWithEntities);
                    } else {
                        tsVar.d.setText("");
                    }
                }
                if (tsVar.J) {
                    tsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.b);
                    break;
                }
                break;
            default:
                ts.V(this.b, this.c);
                break;
        }
    }
}
