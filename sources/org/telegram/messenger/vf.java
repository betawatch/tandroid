package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ vf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkMessageByRandomId$157(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$hasInviteMeMessage$147(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$isMigratedChat$145(this.c, this.d, this.e);
                break;
        }
    }
}
