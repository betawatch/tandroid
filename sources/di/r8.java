package di;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r8(s8 s8Var, long j3, int i7) {
        this.a = i7;
        this.b = s8Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s8 s8Var = this.b;
                s8Var.q.b0(s8Var.b, s8Var.c, this.c, true, true, s8Var.n);
                break;
            default:
                s8 s8Var2 = this.b;
                s8Var2.q.b0(s8Var2.b, s8Var2.c, this.c, true, true, s8Var2.n);
                break;
        }
    }
}
