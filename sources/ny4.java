// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ny4 implements dic {
    public int a;
    public final /* synthetic */ d04 b;
    public final /* synthetic */ vy4 c;

    public ny4(vy4 vy4Var, d04 d04Var) {
        this.c = vy4Var;
        this.b = d04Var;
        this.a = d04Var.getScrollX();
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // dic
    public final void c(int i) {
        this.c.g++;
    }

    @Override // dic
    public final void a(int i) {
    }
}
