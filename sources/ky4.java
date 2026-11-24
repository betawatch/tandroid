// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ky4 implements egc {
    public int a;
    public final /* synthetic */ s04 b;
    public final /* synthetic */ sy4 c;

    public ky4(sy4 sy4Var, s04 s04Var) {
        this.c = sy4Var;
        this.b = s04Var;
        this.a = s04Var.getScrollX();
    }

    @Override // egc
    public final void b(float f, int i, int i2) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // egc
    public final void c(int i) {
        this.c.g++;
    }

    @Override // egc
    public final void a(int i) {
    }
}
