package di;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ e8(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b.v;
                g8Var.s = 0;
                g8Var.requestLayout();
                h8 h8Var = g8Var.J;
                h8Var.L(h8Var.getWidth(), h8Var.getHeight());
                h8Var.requestLayout();
                break;
            case 1:
                g8 g8Var2 = this.b.v;
                g8Var2.s = 0;
                g8Var2.requestLayout();
                h8 h8Var2 = g8Var2.J;
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
