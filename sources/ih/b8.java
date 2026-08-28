package ih;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ b8(c8 c8Var, int i9) {
        this.a = i9;
        this.b = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d8 d8Var = this.b.v;
                d8Var.s = 0;
                d8Var.requestLayout();
                e8 e8Var = d8Var.F;
                e8Var.L(e8Var.getWidth(), e8Var.getHeight());
                e8Var.requestLayout();
                break;
            case 1:
                d8 d8Var2 = this.b.v;
                d8Var2.s = 0;
                d8Var2.requestLayout();
                e8 e8Var2 = d8Var2.F;
                e8Var2.L(e8Var2.getWidth(), e8Var2.getHeight());
                e8Var2.requestLayout();
                break;
            case 2:
                c8 c8Var = this.b;
                c8Var.v.post(new b8(c8Var, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
