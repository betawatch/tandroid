package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ an(bp bpVar, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = bpVar;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
