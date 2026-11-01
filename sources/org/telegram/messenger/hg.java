package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ hg(vi viVar, long j10, long j11, int[] iArr, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int[] iArr = this.e;
        long j10 = this.d;
        long j11 = this.c;
        vi viVar = this.b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            case 1:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            default:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
        }
    }
}
