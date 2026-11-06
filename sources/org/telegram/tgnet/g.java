package org.telegram.tgnet;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ g(int i7, TLRPC.Updates updates, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.b, this.c);
                break;
            case 1:
                qp.s1(this.b).O3(this.c, false);
                break;
            default:
                qp.s1(this.b).O3(this.c, false);
                break;
        }
    }
}
