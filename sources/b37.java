// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b37 extends la2 {
    public int W;
    public Runnable X;
    public final /* synthetic */ f37 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b37(f37 f37Var, fu fuVar, wjb wjbVar) {
        super(null, fuVar, wjbVar);
        this.Y = f37Var;
        this.W = -1;
    }

    @Override // la2, gb3
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
        }
        a37 a37Var = new a37(this, (byte) 0);
        this.X = a37Var;
        gl.d3(a37Var);
        f37 f37Var = this.Y;
        if (f37Var.W) {
            f37Var.W = false;
            gl.d3(new a37(this, (byte) 1));
        }
    }

    @Override // la2
    public final void V() {
        l37 l37Var = this.Y.d0;
        gl.r(l37Var.E);
        l37Var.E.run();
        if (this.W == -1) {
            this.W = kk7.f(l37Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
            this.X = null;
        }
    }

    @Override // la2, gb3, b49
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
        }
        a37 a37Var = new a37(this, (byte) 2);
        this.X = a37Var;
        gl.d3(a37Var);
    }
}
