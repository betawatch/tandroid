package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ na(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = updates;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdates$380(this.c, this.d);
                break;
            default:
                this.b.lambda$processUpdates$379(this.c, this.d);
                break;
        }
    }
}
