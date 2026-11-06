package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ xk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
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
                Utilities.d.c(new xk(this.b, this.c, this.d, 0));
                break;
        }
    }
}
