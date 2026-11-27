// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o67 extends bb2 {
    public Runnable W;

    @Override // bb2, zb3
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        n67 n67Var = new n67(this, (byte) 0);
        this.W = n67Var;
        hl.c3(n67Var);
    }

    @Override // bb2
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        if (f11.a) {
            cc4.b("chatItemAnimator disable notifications");
        }
    }

    @Override // bb2, zb3, o79
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
        }
        n67 n67Var = new n67(this, (byte) 1);
        this.W = n67Var;
        hl.c3(n67Var);
    }

    @Override // zb3
    public final void F() {
    }
}
