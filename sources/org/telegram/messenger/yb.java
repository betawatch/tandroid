package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ yb(zb zbVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = zbVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb zbVar = this.b;
                ConcurrentHashMap concurrentHashMap = zbVar.h.u;
                String str = zbVar.a.e;
                long j3 = this.c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new yb(zbVar, j3, j10, 1));
                break;
            default:
                sb sbVar = this.b.a;
                ks.f(sbVar.o).k(ks.X1, sbVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
