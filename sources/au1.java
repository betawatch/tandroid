// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class au1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k47 b;

    public /* synthetic */ au1(a6a a6aVar, k47 k47Var) {
        this.a = (byte) 2;
        this.b = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        k47 k47Var = this.b;
        switch (b) {
            case 0:
                k47Var.q = false;
                break;
            case 1:
                if (v0c.k(k47Var)) {
                    v0c.z(k47Var, false, null);
                    break;
                }
                break;
            case 2:
                if (k47Var != null && (message = k47Var.k) != null) {
                    message.reqId = 0;
                    break;
                }
                break;
            case 3:
                n50 n50Var = (n50) cmb.d5.remove(k47Var);
                if (n50Var != null) {
                    n50Var.i = null;
                    break;
                }
                break;
            default:
                nm7.f(k47Var.K1).k(nm7.A1, k47Var);
                break;
        }
    }

    public /* synthetic */ au1(k47 k47Var, byte b) {
        this.a = b;
        this.b = k47Var;
    }
}
