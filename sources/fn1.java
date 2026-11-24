// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ fn1(mu1 mu1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.presentFragment(mu1.U9(user.id));
                break;
            default:
                mu1Var.qa(user);
                break;
        }
    }
}
