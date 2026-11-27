// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c0c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0c b;

    public /* synthetic */ c0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x46 x46Var;
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                n0cVar.P = null;
                n0cVar.j();
                break;
            default:
                long j = n0cVar.b;
                if (!n0cVar.d && n0cVar.y > 0.0f && (x46Var = (x46) n0cVar.r.getLayoutManager()) != null && x46Var.M0() >= n0cVar.s.c.size() - 3) {
                    if (!n0cVar.i()) {
                        qyb qybVar = uc7.s1(n0cVar.a).h4;
                        long j2 = -j;
                        if (!qybVar.e(j2)) {
                            qybVar.o(j2);
                            break;
                        }
                    } else {
                        n0cVar.j();
                        break;
                    }
                }
                break;
        }
    }
}
