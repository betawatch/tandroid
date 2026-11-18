package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ mw(zy zyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = tL_error;
        this.d = h2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.b5.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
            default:
                org.telegram.ui.Components.b5.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
        }
    }
}
