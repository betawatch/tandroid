package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z80 b;
    public final /* synthetic */ d90 c;

    public /* synthetic */ y80(z80 z80Var, d90 d90Var, int i10) {
        this.a = i10;
        this.b = z80Var;
        this.c = d90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
