// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class do1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ do1(yv1 yv1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.presentFragment(yv1.ga(user.id));
                break;
            default:
                yv1Var.Ca(user);
                break;
        }
    }
}
