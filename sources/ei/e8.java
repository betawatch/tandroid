package ei;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ e8(f8 f8Var, int i3) {
        this.a = i3;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b.v;
                g8Var.s = 0;
                g8Var.requestLayout();
                h8 h8Var = g8Var.K;
                h8Var.L(h8Var.getWidth(), h8Var.getHeight());
                h8Var.requestLayout();
                break;
            case 1:
                g8 g8Var2 = this.b.v;
                g8Var2.s = 0;
                g8Var2.requestLayout();
                h8 h8Var2 = g8Var2.K;
                h8Var2.L(h8Var2.getWidth(), h8Var2.getHeight());
                h8Var2.requestLayout();
                break;
            case 2:
                f8 f8Var = this.b;
                f8Var.v.post(new e8(f8Var, 3));
                break;
            default:
                this.b.v.y = true;
                break;
        }
    }
}
