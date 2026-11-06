package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ wb(xb xbVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = xbVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb xbVar = this.b;
                ConcurrentHashMap concurrentHashMap = xbVar.i.u;
                String str = xbVar.a;
                long j3 = this.c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new wb(xbVar, j3, j10, 1));
                break;
            default:
                xb xbVar2 = this.b;
                qs.f(xbVar2.h).k(qs.X1, xbVar2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
