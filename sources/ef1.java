// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ef1 extends la2 {
    public int W;
    public nv0 X;
    public final /* synthetic */ nf1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(nf1 nf1Var, o39 o39Var, wjb wjbVar) {
        super(null, o39Var, wjbVar);
        this.Y = nf1Var;
        this.W = -1;
    }

    @Override // la2, gb3
    public final void N() {
        super.N();
        nv0 nv0Var = this.X;
        if (nv0Var != null) {
            gl.r(nv0Var);
        }
        nv0 nv0Var2 = new nv0(this, (byte) 21);
        this.X = nv0Var2;
        gl.c3(nv0Var2);
    }

    @Override // la2
    public final void V() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(nf1.R0, this.W, false);
        }
        nv0 nv0Var = this.X;
        if (nv0Var != null) {
            gl.r(nv0Var);
            this.X = null;
        }
        if (w01.a) {
            fa4.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
