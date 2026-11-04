package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ mw(yy yyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i3) {
        this.a = i3;
        this.b = yyVar;
        this.c = tL_error;
        this.d = d2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.t4.e0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
            default:
                org.telegram.ui.Components.t4.e0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
        }
    }
}
