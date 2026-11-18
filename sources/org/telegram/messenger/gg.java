package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ gg(ri riVar, long j3, long j10, int[] iArr, int i7) {
        this.a = i7;
        this.b = riVar;
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
        ri riVar = this.b;
        switch (i7) {
            case 0:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            case 1:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
            default:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                break;
        }
    }
}
