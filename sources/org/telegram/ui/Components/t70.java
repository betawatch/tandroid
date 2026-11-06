package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2.n0 b;
    public final /* synthetic */ x70 c;

    public /* synthetic */ t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = x70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c, false);
                break;
            default:
                this.b.m(this.c, false);
                break;
        }
    }
}
