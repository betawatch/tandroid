package lh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ e5(p5 p5Var, int i10) {
        this.a = i10;
        this.b = p5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b.c;
                if (!b5Var.j.isEmpty()) {
                    b5Var.j.clear();
                    b5Var.h();
                    break;
                }
                break;
            case 1:
                b5 b5Var2 = this.b.c;
                if (!b5Var2.k.isEmpty()) {
                    b5Var2.k.clear();
                    b5Var2.h();
                    break;
                }
                break;
            case 2:
                b5 b5Var3 = this.b.c;
                if (!b5Var3.l.isEmpty()) {
                    b5Var3.l.clear();
                    b5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(a5.b);
                break;
            case 4:
                this.b.c.i(a5.c);
                break;
            default:
                this.b.c.i(a5.d);
                break;
        }
    }
}
