package org.telegram.tgnet;

import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ h(int i10, TLRPC.Updates updates, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.b, this.c);
                break;
            case 1:
                vp.r1(this.b).L3(this.c, false);
                break;
            default:
                vp.r1(this.b).L3(this.c, false);
                break;
        }
    }
}
