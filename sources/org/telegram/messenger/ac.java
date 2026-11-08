package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ac(bc bcVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = bcVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bc bcVar = this.b;
                ConcurrentHashMap concurrentHashMap = bcVar.h.u;
                String str = bcVar.a.e;
                long j3 = this.c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new ac(bcVar, j3, j10, 1));
                break;
            default:
                ub ubVar = this.b.a;
                qs.f(ubVar.o).k(qs.X1, ubVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
