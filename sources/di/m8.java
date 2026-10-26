package di;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ m8(n8 n8Var, int i10) {
        this.a = i10;
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b.v;
                o8Var.s = 0;
                o8Var.requestLayout();
                p8 p8Var = o8Var.J;
                p8Var.L(p8Var.getWidth(), p8Var.getHeight());
                p8Var.requestLayout();
                break;
            case 1:
                o8 o8Var2 = this.b.v;
                o8Var2.s = 0;
                o8Var2.requestLayout();
                p8 p8Var2 = o8Var2.J;
                p8Var2.L(p8Var2.getWidth(), p8Var2.getHeight());
                p8Var2.requestLayout();
                break;
            case 2:
                n8 n8Var = this.b;
                n8Var.v.post(new m8(n8Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
