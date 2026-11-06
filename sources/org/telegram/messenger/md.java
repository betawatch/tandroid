package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ md(sd sdVar, Integer num, int i7) {
        this.a = i7;
        this.b = sdVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        Integer num = this.c;
        sd sdVar = this.b;
        switch (i7) {
            case 0:
                if (!sdVar.b.isEmpty()) {
                    g0.h3(new md(sdVar, num, i10));
                    break;
                }
                break;
            default:
                sdVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
