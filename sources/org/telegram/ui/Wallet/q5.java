package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ q5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                s5 s5Var = this.b;
                s5Var.h.invalidate();
                s5Var.n.invalidate();
                s5Var.e.invalidate();
                break;
        }
    }
}
