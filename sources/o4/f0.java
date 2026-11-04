package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ f0(o0 o0Var, int i3) {
        this.a = i3;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                g2.n0.W(o0Var.h.l, new f0(o0Var, 1));
                break;
            default:
                this.b.o0();
                break;
        }
    }
}
