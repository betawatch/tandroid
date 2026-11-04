package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ pb(qb qbVar, long j10, long j11, int i3) {
        this.a = i3;
        this.b = qbVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb qbVar = this.b;
                ConcurrentHashMap concurrentHashMap = qbVar.i.u;
                String str = qbVar.a;
                long j10 = this.c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                g0.h3(new pb(qbVar, j10, j11, 1));
                break;
            default:
                qb qbVar2 = this.b;
                hs.f(qbVar2.h).k(hs.X1, qbVar2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
