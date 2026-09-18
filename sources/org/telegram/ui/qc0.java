package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qc0(kd0 kd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = kd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                kd0 kd0Var = this.b;
                if (!z10) {
                    kd0Var.b.setVisibility(8);
                    break;
                } else {
                    kd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
