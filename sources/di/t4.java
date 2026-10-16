package di;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ t4(o6 o6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = o6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c, true);
                break;
            default:
                this.b.B0(this.c);
                break;
        }
    }
}
