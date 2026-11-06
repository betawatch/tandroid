package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng b;
    public final /* synthetic */ dd c;

    public /* synthetic */ tc(ng ngVar, dd ddVar, int i7) {
        this.a = i7;
        this.b = ngVar;
        this.c = ddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.a();
                break;
            default:
                this.b.run();
                this.c.a();
                break;
        }
    }
}
