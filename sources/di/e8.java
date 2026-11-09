package di;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ e8(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b.v;
                h8Var.s = 0;
                h8Var.requestLayout();
                i8 i8Var = h8Var.J;
                i8Var.L(i8Var.getWidth(), i8Var.getHeight());
                i8Var.requestLayout();
                break;
            case 1:
                h8 h8Var2 = this.b.v;
                h8Var2.s = 0;
                h8Var2.requestLayout();
                i8 i8Var2 = h8Var2.J;
                i8Var2.L(i8Var2.getWidth(), i8Var2.getHeight());
                i8Var2.requestLayout();
                break;
            case 2:
                g8 g8Var = this.b;
                g8Var.v.post(new e8(g8Var, 3));
                break;
            default:
                this.b.v.y = true;
                break;
        }
    }
}
