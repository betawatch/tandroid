// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
