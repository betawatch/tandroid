// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h47 extends la2 {
    public Runnable W;

    @Override // la2, gb3
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        g47 g47Var = new g47(this, (byte) 0);
        this.W = g47Var;
        gl.d3(g47Var);
    }

    @Override // la2
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        if (w01.a) {
            fa4.b("chatItemAnimator disable notifications");
        }
    }

    @Override // la2, gb3, b49
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
        }
        g47 g47Var = new g47(this, (byte) 1);
        this.W = g47Var;
        gl.d3(g47Var);
    }

    @Override // gb3
    public final void F() {
    }
}
