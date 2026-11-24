// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class np1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ np1(yv1 yv1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = yv1Var;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.e;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.d;
        TLRPC.TL_error tL_error = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.i9(tL_attachMenuBot, tL_error, user);
                break;
            default:
                yv1Var.k9(tL_attachMenuBot, tL_error, user);
                break;
        }
    }

    public /* synthetic */ np1(yv1 yv1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = yv1Var;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
