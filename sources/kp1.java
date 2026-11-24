// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kp1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t09 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ h19 n;
    public final /* synthetic */ k27 r;
    public final /* synthetic */ mu1 s;

    public kp1(mu1 mu1Var, boolean z, boolean z2, int i, boolean z3, t09 t09Var, float f, float f2, h19 h19Var, k27 k27Var) {
        this.s = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = t09Var;
        this.f = f;
        this.h = f2;
        this.n = h19Var;
        this.r = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        mu1 mu1Var = this.s;
        if (mu1Var.Kc != null) {
            mu1Var.Kc = null;
            if (this.b) {
                mu1Var.s6(new jp1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
            } else {
                mu1Var.s6(new aj1(this, this.r, (byte) 20));
            }
            mu1Var.G5(true);
        }
    }
}
