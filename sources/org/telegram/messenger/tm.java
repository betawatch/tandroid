package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tm(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = updates;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.d.c(new tm(this.b, this.c, this.d, 1));
                break;
            default:
                this.b.V3(this.c, this.d);
                break;
        }
    }
}
