package m4;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ m1 c;

    public /* synthetic */ j0(p0 p0Var, m1 m1Var, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                n4.s sVar = p0Var.m;
                m1 m1Var = this.c;
                sVar.J(p0Var.G(m1Var));
                p0Var.i.s(m1Var.s().a(17) ? m1Var.y0() : b2.o1.a);
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.m.J(p0Var2.G(this.c));
                break;
        }
    }
}
