package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ bs(js jsVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = jsVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                js jsVar = this.b;
                TLRPC.User user = this.c;
                if (user != null && jsVar.M == null && jsVar.N == null) {
                    if (user.phone == null && (str = jsVar.L) != null) {
                        user.phone = kf.b.d(str, false);
                    }
                    jsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = jsVar.b.d;
                    e3Var.setSelection(e3Var.length());
                    jsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        jsVar.d.setText(tL_textWithEntities);
                    } else {
                        jsVar.d.setText("");
                    }
                }
                if (jsVar.J) {
                    jsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.d);
                    break;
                }
                break;
            default:
                js.W(this.b, this.c);
                break;
        }
    }
}
