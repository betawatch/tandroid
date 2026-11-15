package fi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ p6(r6 r6Var, int i7) {
        this.a = i7;
        this.b = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
