package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ bc(cc ccVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = ccVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc ccVar = this.b;
                ConcurrentHashMap concurrentHashMap = ccVar.h.u;
                String str = ccVar.a.e;
                long j10 = this.c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new bc(ccVar, j10, j11, 1));
                break;
            default:
                vb vbVar = this.b.a;
                zs.f(vbVar.o).k(zs.X1, vbVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
