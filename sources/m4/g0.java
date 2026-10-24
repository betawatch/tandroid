package m4;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ g0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                e2.m0.W(p0Var.g.l, new g0(p0Var, 1));
                break;
            default:
                this.b.N();
                break;
        }
    }
}
