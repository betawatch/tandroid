package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;
    public final /* synthetic */ tg.r1 c;

    public /* synthetic */ y3(l5 l5Var, tg.r1 r1Var, int i7) {
        this.a = i7;
        this.b = l5Var;
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
