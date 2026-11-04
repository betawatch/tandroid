package lg;

import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i3) {
        this.a = i3;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        e eVar = this.b;
        switch (i3) {
            case 0:
                eVar.a();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.a;
                disablepeerconnectedbot.peer = hp.s1(i10).j1(eVar.s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                hp.s1(i10).d7.edit().remove("dialog_botid" + eVar.s).remove("dialog_boturl" + eVar.s).remove("dialog_botflags" + eVar.s).apply();
                hs.f(i10).k(79, Long.valueOf(eVar.s));
                f.a(i10).f = false;
                break;
            default:
                sf.c.t(eVar.getContext(), eVar.y);
                break;
        }
    }
}
