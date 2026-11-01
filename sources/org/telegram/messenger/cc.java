package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class cc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ cc(dc dcVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = dcVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dc dcVar = this.b;
                ConcurrentHashMap concurrentHashMap = dcVar.h.u;
                String str = dcVar.a.e;
                long j10 = this.c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new cc(dcVar, j10, j11, 1));
                break;
            default:
                wb wbVar = this.b.a;
                at.f(wbVar.o).k(at.X1, wbVar.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
