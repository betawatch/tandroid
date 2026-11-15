package bi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ s5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                z5 z5Var = this.b;
                z5Var.e2.O(true);
                org.telegram.messenger.g0.i3(new s5(z5Var, 0), 150L);
                break;
        }
    }
}
