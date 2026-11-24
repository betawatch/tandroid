// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ul9 b;
    public final /* synthetic */ ql9 c;

    public /* synthetic */ hl9(ul9 ul9Var, ql9 ql9Var, Exception exc) {
        this.a = (byte) 1;
        this.b = ul9Var;
        this.c = ql9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ul9 ul9Var = this.b;
                ql9 ql9Var = this.c;
                ((lgb) ul9Var.e).c(ql9Var.a);
                return;
            case 1:
                ul9 ul9Var2 = this.b;
                ql9 ql9Var2 = this.c;
                rl9 rl9Var = ul9Var2.e;
                long j = ql9Var2.a;
                lgb lgbVar = (lgb) rl9Var;
                synchronized (lgbVar) {
                    lgbVar.c(j);
                }
                return;
            default:
                ul9 ul9Var3 = this.b;
                ql9 ql9Var3 = this.c;
                ((lgb) ul9Var3.e).c(ql9Var3.a);
                return;
        }
    }

    public /* synthetic */ hl9(ul9 ul9Var, ql9 ql9Var, int i, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = ql9Var;
    }
}
