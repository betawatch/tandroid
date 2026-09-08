package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import yf.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
