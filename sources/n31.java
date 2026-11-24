// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ n31(o31 o31Var, byte b) {
        this.a = b;
        this.b = o31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o31 o31Var = this.b;
        switch (b) {
            case 0:
                o31Var.a();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = o31Var.a;
                disablepeerconnectedbot.peer = na7.q1(i).h1(o31Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                na7.q1(i).W3.edit().remove("dialog_botid" + o31Var.s).remove("dialog_boturl" + o31Var.s).remove("dialog_botflags" + o31Var.s).apply();
                kk7.f(i).k(79, Long.valueOf(o31Var.s));
                p31.a(i).f = false;
                break;
            default:
                d01.t(o31Var.getContext(), o31Var.y);
                break;
        }
    }
}
