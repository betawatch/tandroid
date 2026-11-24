// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fa7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ac7 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ fa7(ac7 ac7Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = ac7Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        ac7 ac7Var = this.b;
        switch (b) {
            case 0:
                ac7Var.b(tL_error);
                break;
            default:
                ac7Var.b(tL_error);
                break;
        }
    }
}
