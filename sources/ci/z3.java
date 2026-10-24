package ci;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ z3(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((q9) this.b.l.Q1).g(false);
                break;
            case 1:
                p4 p4Var = this.b.l;
                i4 i4Var = p4Var.Q1;
                if (i4Var != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Z0 = false;
                    z9Var.P();
                }
                p4Var.e1(false);
                p4Var.h3 = true;
                p4Var.K0.E(true);
                break;
            case 2:
                p4 p4Var2 = this.b.l;
                p4Var2.U3 = true;
                p4Var2.setActive(false);
                break;
            default:
                p4 p4Var3 = this.b.l;
                p4Var3.U3 = true;
                p4Var3.setActive(false);
                break;
        }
    }
}
