package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class wk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = updates;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.O3(this.c, this.d);
                break;
            default:
                Utilities.d.c(new wk(this.b, this.c, this.d, 0));
                break;
        }
    }
}
