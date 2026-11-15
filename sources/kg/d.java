package kg;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e eVar = this.b;
        switch (i7) {
            case 0:
                eVar.a();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.a;
                disablepeerconnectedbot.peer = np.s1(i10).j1(eVar.s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                np.s1(i10).e7.edit().remove("dialog_botid" + eVar.s).remove("dialog_boturl" + eVar.s).remove("dialog_botflags" + eVar.s).apply();
                ns.f(i10).k(79, Long.valueOf(eVar.s));
                f.a(i10).f = false;
                break;
            default:
                vf.c.t(eVar.getContext(), eVar.y);
                break;
        }
    }
}
