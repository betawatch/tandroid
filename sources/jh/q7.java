package jh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ q7(r7 r7Var, long j10, int i10) {
        this.a = i10;
        this.b = r7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r7 r7Var = this.b;
                r7Var.q.d0(r7Var.b, r7Var.c, this.c, true, true, r7Var.n);
                break;
            default:
                r7 r7Var2 = this.b;
                r7Var2.q.d0(r7Var2.b, r7Var2.c, this.c, true, true, r7Var2.n);
                break;
        }
    }
}
