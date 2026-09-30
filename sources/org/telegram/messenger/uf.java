package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkMessageByRandomId$153(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$isMigratedChat$141(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$hasInviteMeMessage$143(this.c, this.d, this.e);
                break;
        }
    }
}
