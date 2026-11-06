package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.a = i7;
        this.b = c20Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Long.valueOf(this.c));
                break;
            default:
                this.b.a(Long.valueOf(this.c));
                break;
        }
    }
}
