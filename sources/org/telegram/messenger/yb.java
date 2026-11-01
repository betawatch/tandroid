package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ yb(zb zbVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = zbVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb zbVar = this.b;
                ConcurrentHashMap concurrentHashMap = zbVar.i.u;
                String str = zbVar.a;
                long j10 = this.c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new yb(zbVar, j10, j11, 1));
                break;
            default:
                zb zbVar2 = this.b;
                at.f(zbVar2.h).k(at.X1, zbVar2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
