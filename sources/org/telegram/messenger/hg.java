package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ hg(si siVar, long j3, long j10, int[] iArr, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int[] iArr = this.e;
        long j3 = this.d;
        long j10 = this.c;
        si siVar = this.b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            case 1:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            default:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
        }
    }
}
