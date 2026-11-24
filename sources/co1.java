// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class co1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ co1(mu1 mu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = mu1Var;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.e;
        TLRPC.TL_error tL_error = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.a9(tL_attachMenuBot, tL_error, user);
                break;
            default:
                mu1Var.Y8(tL_attachMenuBot, tL_error, user);
                break;
        }
    }

    public /* synthetic */ co1(mu1 mu1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = mu1Var;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
