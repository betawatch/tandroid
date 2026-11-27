// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ hd2(pd2 pd2Var, long j, byte b) {
        this.a = b;
        this.b = pd2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pd2 pd2Var = this.b;
        switch (b) {
            case 0:
                pd2Var.n = j;
                pd2Var.r = true;
                pd2Var.c0();
                break;
            default:
                pd2Var.h0(j);
                break;
        }
    }
}
