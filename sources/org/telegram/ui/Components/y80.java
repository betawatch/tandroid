package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
