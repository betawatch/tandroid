// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
