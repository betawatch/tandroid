package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bn b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ ah(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = bnVar;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn.j0(this.b, this.c, this.d, this.e);
                break;
            default:
                bn.x0(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ ah(bn bnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = bnVar;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
