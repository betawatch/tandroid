package ei;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ m4(f6 f6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0(this.c, true);
                break;
            default:
                this.b.A0(this.c);
                break;
        }
    }
}
