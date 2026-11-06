package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a6(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                c6 c6Var = this.b;
                c6Var.h.invalidate();
                c6Var.n.invalidate();
                c6Var.e.invalidate();
                break;
        }
    }
}
