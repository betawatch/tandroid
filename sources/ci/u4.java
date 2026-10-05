package ci;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ qg.b2 c;

    public /* synthetic */ u4(q6 q6Var, qg.b2 b2Var, int i10) {
        this.a = i10;
        this.b = q6Var;
        this.c = b2Var;
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
