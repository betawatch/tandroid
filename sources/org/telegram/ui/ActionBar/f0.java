package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f0(u0 u0Var, int i10, int i11) {
        this.a = i11;
        this.b = u0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.b.getSwipeBack() != null) {
                    u0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                u0 u0Var2 = this.b;
                if (u0Var2.b.getSwipeBack() != null) {
                    u0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}
