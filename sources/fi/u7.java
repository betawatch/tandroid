package fi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;

    public /* synthetic */ u7(v7 v7Var, int i7) {
        this.a = i7;
        this.b = v7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w7 w7Var = this.b.v;
                w7Var.s = 0;
                w7Var.requestLayout();
                x7 x7Var = w7Var.K;
                x7Var.L(x7Var.getWidth(), x7Var.getHeight());
                x7Var.requestLayout();
                break;
            case 1:
                w7 w7Var2 = this.b.v;
                w7Var2.s = 0;
                w7Var2.requestLayout();
                x7 x7Var2 = w7Var2.K;
                x7Var2.L(x7Var2.getWidth(), x7Var2.getHeight());
                x7Var2.requestLayout();
                break;
            case 2:
                v7 v7Var = this.b;
                v7Var.v.post(new u7(v7Var, 3));
                break;
            default:
                this.b.v.y = true;
                break;
        }
    }
}
