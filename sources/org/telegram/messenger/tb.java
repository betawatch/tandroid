package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ tb(ub ubVar, long j10, long j11, int i3) {
        this.a = i3;
        this.b = ubVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ub ubVar = this.b;
                ConcurrentHashMap concurrentHashMap = ubVar.h.u;
                String str = ubVar.a.e;
                long j10 = this.c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                g0.h3(new tb(ubVar, j10, j11, 1));
                break;
            default:
                nb nbVar = this.b.a;
                hs.f(nbVar.o).k(hs.X1, nbVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
