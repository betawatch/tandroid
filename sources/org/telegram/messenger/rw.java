package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ rw(ez ezVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = tL_error;
        this.d = e2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.t4.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
            default:
                org.telegram.ui.Components.t4.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
        }
    }
}
