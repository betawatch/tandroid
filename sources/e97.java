// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class e97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ e97(oc7 oc7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.B(j, tL_error.text);
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                break;
            default:
                oc7Var.B(j, tL_error.text);
                oc7Var.l1.remove(Long.valueOf(j));
                break;
        }
    }
}
