package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ fx(qz qzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = tL_error;
        this.d = k2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.s4.e0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
            default:
                org.telegram.ui.Components.s4.e0(this.b.currentAccount, this.c, this.d, this.e, new Object[0]);
                break;
        }
    }
}
