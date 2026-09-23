package ci;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ qg.e2 c;

    public /* synthetic */ u4(q6 q6Var, qg.e2 e2Var, int i10) {
        this.a = i10;
        this.b = q6Var;
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D0(this.c, true);
                break;
            default:
                this.b.C0(this.c);
                break;
        }
    }
}
