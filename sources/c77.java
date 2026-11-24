// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class c77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ c77(oc7 oc7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.b3(user, oc7Var.k1, true, null);
                break;
            case 1:
                oc7Var.h1.remove(Long.valueOf(user.id));
                break;
            default:
                oc7Var.getContactsController().a(user);
                break;
        }
    }
}
