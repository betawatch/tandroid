package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ an(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = yoVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            default:
                this.b.e(this.c);
                break;
        }
    }
}
