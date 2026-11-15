package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ tg.r1 c;

    public /* synthetic */ y3(m5 m5Var, tg.r1 r1Var, int i7) {
        this.a = i7;
        this.b = m5Var;
        this.c = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0(this.c, true);
                break;
            default:
                this.b.z0(this.c);
                break;
        }
    }
}
