package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                g0.g3(new vb(wbVar, j3, j10, 1));
                break;
            default:
                wb wbVar2 = this.b;
                ls.f(wbVar2.h).k(ls.X1, wbVar2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
