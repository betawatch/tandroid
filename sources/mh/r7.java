package mh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
