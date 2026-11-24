// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un9 b;
    public final /* synthetic */ qn9 c;

    public /* synthetic */ hn9(un9 un9Var, qn9 qn9Var, Exception exc) {
        this.a = (byte) 1;
        this.b = un9Var;
        this.c = qn9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un9 un9Var = this.b;
                qn9 qn9Var = this.c;
                ((mib) un9Var.e).c(qn9Var.a);
                return;
            case 1:
                un9 un9Var2 = this.b;
                qn9 qn9Var2 = this.c;
                rn9 rn9Var = un9Var2.e;
                long j = qn9Var2.a;
                mib mibVar = (mib) rn9Var;
                synchronized (mibVar) {
                    mibVar.c(j);
                }
                return;
            default:
                un9 un9Var3 = this.b;
                qn9 qn9Var3 = this.c;
                ((mib) un9Var3.e).c(qn9Var3.a);
                return;
        }
    }

    public /* synthetic */ hn9(un9 un9Var, qn9 qn9Var, int i, byte b) {
        this.a = b;
        this.b = un9Var;
        this.c = qn9Var;
    }
}
