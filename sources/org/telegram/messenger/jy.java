package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class jy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ jy(ez ezVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez ezVar = this.b;
                ezVar.getMessagesController().O3(this.c, false);
                g0.h3(new qw(ezVar, this.d, this.e, 0));
                break;
            default:
                ez ezVar2 = this.b;
                ezVar2.getMessagesController().O3(this.c, false);
                g0.h3(new qw(ezVar2, this.d, this.e, 1));
                break;
        }
    }
}
