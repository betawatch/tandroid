package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ff.u c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ ia(MessagesController messagesController, ff.u uVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i9) {
        this.a = i9;
        this.b = messagesController;
        this.c = uVar;
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
