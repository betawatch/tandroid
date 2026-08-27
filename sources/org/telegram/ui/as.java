package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ as(js jsVar, TLRPC.User user, int i10) {
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
                if (user != null && jsVar.I == null && jsVar.J == null) {
                    if (user.phone == null && (str = jsVar.H) != null) {
                        user.phone = oe.b.d(str, false);
                    }
                    jsVar.b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = jsVar.b.b;
                    e3Var.setSelection(e3Var.length());
                    jsVar.c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        jsVar.d.setText(tL_textWithEntities);
                    } else {
                        jsVar.d.setText("");
                    }
                }
                if (jsVar.F) {
                    jsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.b);
                    break;
                }
                break;
            default:
                js.V(this.b, this.c);
                break;
        }
    }
}
