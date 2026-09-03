package oh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ x7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z7 z7Var = this.b.v;
                z7Var.s = 0;
                z7Var.requestLayout();
                a8 a8Var = z7Var.G;
                a8Var.L(a8Var.getWidth(), a8Var.getHeight());
                a8Var.requestLayout();
                break;
            case 1:
                z7 z7Var2 = this.b.v;
                z7Var2.s = 0;
                z7Var2.requestLayout();
                a8 a8Var2 = z7Var2.G;
                a8Var2.L(a8Var2.getWidth(), a8Var2.getHeight());
                a8Var2.requestLayout();
                break;
            case 2:
                y7 y7Var = this.b;
                y7Var.v.post(new x7(y7Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
