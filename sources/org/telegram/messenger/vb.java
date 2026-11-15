package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ vb(wb wbVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = wbVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb wbVar = this.b;
                ConcurrentHashMap concurrentHashMap = wbVar.i.u;
                String str = wbVar.a;
                long j3 = this.c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new vb(wbVar, j3, j10, 1));
                break;
            default:
                wb wbVar2 = this.b;
                ns.f(wbVar2.h).k(ns.X1, wbVar2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
