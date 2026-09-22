package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class ma implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ r c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ ma(MessagesController messagesController, r rVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = rVar;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$400(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$processUpdateArray$401(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$processUpdateArray$405(this.c, this.d, this.e);
                break;
        }
    }
}
