package org.telegram.tgnet;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ g(int i3, TLRPC.Updates updates, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.b, this.c);
                break;
            case 1:
                hp.s1(this.b).O3(this.c, false);
                break;
            default:
                hp.s1(this.b).O3(this.c, false);
                break;
        }
    }
}
