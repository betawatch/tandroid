package di;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s8(t8 t8Var, long j3, int i7) {
        this.a = i7;
        this.b = t8Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8 t8Var = this.b;
                t8Var.q.b0(t8Var.b, t8Var.c, this.c, true, true, t8Var.n);
                break;
            default:
                t8 t8Var2 = this.b;
                t8Var2.q.b0(t8Var2.b, t8Var2.c, this.c, true, true, t8Var2.n);
                break;
        }
    }
}
