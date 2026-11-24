// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ll0 implements ml0, x56, sv6, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ll0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // us2
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((ad8) obj).J(this.b, this.c);
                break;
            default:
                ((ad8) obj).s0(this.b, this.c);
                break;
        }
    }

    @Override // sv6
    public final void f(ru6 ru6Var, int i) {
        ru6Var.c(i, this.b, this.c);
    }

    @Override // x56
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((mc8) obj).M(this.b, this.c);
                break;
            default:
                ((mc8) obj).M(this.b, this.c);
                break;
        }
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        return z ? this.b : this.c;
    }
}
