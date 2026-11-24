// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iw4 implements eec {
    public int a;
    public final /* synthetic */ iz3 b;
    public final /* synthetic */ qw4 c;

    public iw4(qw4 qw4Var, iz3 iz3Var) {
        this.c = qw4Var;
        this.b = iz3Var;
        this.a = iz3Var.getScrollX();
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // eec
    public final void c(int i) {
        this.c.g++;
    }

    @Override // eec
    public final void a(int i) {
    }
}
