package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ak(vp vpVar, TLRPC.Updates updates, boolean z10, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = updates;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L3(this.c, this.d);
                break;
            default:
                Utilities.d.c(new ak(this.b, this.c, this.d, 0));
                break;
        }
    }
}
