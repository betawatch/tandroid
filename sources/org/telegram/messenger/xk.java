package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
