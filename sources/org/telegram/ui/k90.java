package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p90 b;

    public /* synthetic */ k90(p90 p90Var, int i7) {
        this.a = i7;
        this.b = p90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
