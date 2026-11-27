// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
