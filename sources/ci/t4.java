package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ qg.c2 c;

    public /* synthetic */ t4(q6 q6Var, qg.c2 c2Var, int i10) {
        this.a = i10;
        this.b = q6Var;
        this.c = c2Var;
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
