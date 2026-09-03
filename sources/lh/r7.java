package lh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r7(s7 s7Var, long j10, int i10) {
        this.a = i10;
        this.b = s7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7 s7Var = this.b;
                s7Var.q.d0(s7Var.b, s7Var.c, this.c, true, true, s7Var.n);
                break;
            default:
                s7 s7Var2 = this.b;
                s7Var2.q.d0(s7Var2.b, s7Var2.c, this.c, true, true, s7Var2.n);
                break;
        }
    }
}
