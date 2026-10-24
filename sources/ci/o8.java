package ci;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;

    public /* synthetic */ o8(p8 p8Var, int i10) {
        this.a = i10;
        this.b = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q8 q8Var = this.b.v;
                q8Var.s = 0;
                q8Var.requestLayout();
                r8 r8Var = q8Var.J;
                r8Var.L(r8Var.getWidth(), r8Var.getHeight());
                r8Var.requestLayout();
                break;
            case 1:
                q8 q8Var2 = this.b.v;
                q8Var2.s = 0;
                q8Var2.requestLayout();
                r8 r8Var2 = q8Var2.J;
                r8Var2.L(r8Var2.getWidth(), r8Var2.getHeight());
                r8Var2.requestLayout();
                break;
            case 2:
                p8 p8Var = this.b;
                p8Var.v.post(new o8(p8Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
