package hh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s7(t7 t7Var, long j10, int i10) {
        this.a = i10;
        this.b = t7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t7 t7Var = this.b;
                t7Var.q.d0(t7Var.b, t7Var.c, this.c, true, true, t7Var.n);
                break;
            default:
                t7 t7Var2 = this.b;
                t7Var2.q.d0(t7Var2.b, t7Var2.c, this.c, true, true, t7Var2.n);
                break;
        }
    }
}
