package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ gg(ui uiVar, long j10, long j11, int[] iArr, int i10) {
        this.a = i10;
        this.b = uiVar;
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
        ui uiVar = this.b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            case 1:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
            default:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                break;
        }
    }
}
