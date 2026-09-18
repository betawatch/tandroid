package ci;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
