package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ ly(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz.a0(this.b);
                break;
            default:
                gz.b0(this.b);
                break;
        }
    }
}
