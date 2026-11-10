package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
