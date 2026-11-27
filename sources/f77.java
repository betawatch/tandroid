// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class f77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ f77(uc7 uc7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.f3(user, uc7Var.k1, true, null);
                break;
            case 1:
                uc7Var.h1.remove(Long.valueOf(user.id));
                break;
            default:
                uc7Var.getContactsController().a(user);
                break;
        }
    }
}
