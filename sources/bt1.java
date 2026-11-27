// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r47 b;

    public /* synthetic */ bt1(r7a r7aVar, r47 r47Var) {
        this.a = (byte) 2;
        this.b = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        r47 r47Var = this.b;
        switch (b) {
            case 0:
                r47Var.q = false;
                break;
            case 1:
                if (u2c.k(r47Var)) {
                    u2c.z(r47Var, false, null);
                    break;
                }
                break;
            case 2:
                if (r47Var != null && (message = r47Var.k) != null) {
                    message.reqId = 0;
                    break;
                }
                break;
            case 3:
                p40 p40Var = (p40) aob.e5.remove(r47Var);
                if (p40Var != null) {
                    p40Var.i = null;
                    break;
                }
                break;
            default:
                jn7.f(r47Var.K1).k(jn7.A1, r47Var);
                break;
        }
    }

    public /* synthetic */ bt1(r47 r47Var, byte b) {
        this.a = b;
        this.b = r47Var;
    }
}
