package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ zf(li liVar, long j10, long j11, int[] iArr, int i3) {
        this.a = i3;
        this.b = liVar;
        this.c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int[] iArr = this.e;
        long j10 = this.d;
        long j11 = this.c;
        li liVar = this.b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            case 1:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            default:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
        }
    }
}
