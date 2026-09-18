package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;

    public /* synthetic */ g80(n80 n80Var, int i10) {
        this.a = i10;
        this.b = n80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n80 n80Var = this.b;
                n80Var.h.postOnAnimation(new g80(n80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
