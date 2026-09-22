package ci;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;
    public final /* synthetic */ qg.e2 c;

    public /* synthetic */ v4(r6 r6Var, qg.e2 e2Var, int i10) {
        this.a = i10;
        this.b = r6Var;
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
