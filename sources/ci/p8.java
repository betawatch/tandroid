package ci;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ p8(q8 q8Var, int i10) {
        this.a = i10;
        this.b = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r8 r8Var = this.b.v;
                r8Var.s = 0;
                r8Var.requestLayout();
                s8 s8Var = r8Var.J;
                s8Var.L(s8Var.getWidth(), s8Var.getHeight());
                s8Var.requestLayout();
                break;
            case 1:
                r8 r8Var2 = this.b.v;
                r8Var2.s = 0;
                r8Var2.requestLayout();
                s8 s8Var2 = r8Var2.J;
                s8Var2.L(s8Var2.getWidth(), s8Var2.getHeight());
                s8Var2.requestLayout();
                break;
            case 2:
                q8 q8Var = this.b;
                q8Var.v.post(new p8(q8Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
