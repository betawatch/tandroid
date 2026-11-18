package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ sm(mp mpVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = updates;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.d.c(new sm(this.b, this.c, this.d, 1));
                break;
            default:
                this.b.V3(this.c, this.d);
                break;
        }
    }
}
