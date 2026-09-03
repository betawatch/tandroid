package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ lf.t c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ pa(MessagesController messagesController, lf.t tVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tVar;
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
