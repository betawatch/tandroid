package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ zm(xo xoVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = xoVar;
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
