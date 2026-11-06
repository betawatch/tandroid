package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ hg(ui uiVar, long j3, long j10, int[] iArr, int i7) {
        this.a = i7;
        this.b = uiVar;
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
        ui uiVar = this.b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            case 1:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            default:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
        }
    }
}
