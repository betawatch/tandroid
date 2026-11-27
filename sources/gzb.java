// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gzb extends zb3 {
    public Runnable F;
    public int G;
    public final /* synthetic */ tzb H;

    public gzb(tzb tzbVar) {
        this.H = tzbVar;
    }

    @Override // zb3
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().p(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                hl.r(runnable);
                this.F = null;
            }
        }
    }

    @Override // zb3
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            hl.r(runnable);
            this.F = null;
        }
        fzb fzbVar = new fzb(this, (byte) 0);
        this.F = fzbVar;
        hl.c3(fzbVar);
    }

    @Override // zb3, o79
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            hl.r(runnable);
        }
        fzb fzbVar = new fzb(this, (byte) 1);
        this.F = fzbVar;
        hl.c3(fzbVar);
    }

    @Override // zb3
    public final void z(f89 f89Var) {
        tzb tzbVar = this.H;
        qzb qzbVar = tzbVar.d1;
        if (qzbVar == f89Var.a) {
            qzbVar.setTranslationX(0.0f);
            wyb wybVar = tzbVar.P;
            if (wybVar != null) {
                wybVar.G.clear();
            }
            qzb qzbVar2 = tzbVar.d1;
            if (ik8.A(qzbVar2)) {
                qzbVar2.setTopicIcon(qzbVar2.d5);
            }
            tzbVar.d1 = null;
        }
    }
}
