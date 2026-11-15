package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ xm(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = yoVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(this.c);
                break;
            default:
                this.b.d(this.c);
                break;
        }
    }
}
