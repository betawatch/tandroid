package ei;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.b2 c;

    public /* synthetic */ m4(f6 f6Var, rg.b2 b2Var, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = b2Var;
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
