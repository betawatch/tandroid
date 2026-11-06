package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ uw(gz gzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = tL_error;
        this.d = f2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.v4.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
            default:
                org.telegram.ui.Components.v4.c0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
        }
    }
}
