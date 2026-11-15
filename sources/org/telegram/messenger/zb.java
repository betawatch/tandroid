package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ zb(ac acVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = acVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac acVar = this.b;
                ConcurrentHashMap concurrentHashMap = acVar.h.u;
                String str = acVar.a.e;
                long j3 = this.c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new zb(acVar, j3, j10, 1));
                break;
            default:
                tb tbVar = this.b.a;
                ns.f(tbVar.o).k(ns.X1, tbVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
