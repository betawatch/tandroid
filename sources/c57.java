// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ c57(na7 na7Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.Y2(user, na7Var.k1, true, null);
                break;
            case 1:
                na7Var.h1.remove(Long.valueOf(user.id));
                break;
            default:
                na7Var.getContactsController().a(user);
                break;
        }
    }
}
