package kg;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                disablepeerconnectedbot.peer = mp.u1(i10).l1(eVar.s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                mp.u1(i10).g7.edit().remove("dialog_botid" + eVar.s).remove("dialog_boturl" + eVar.s).remove("dialog_botflags" + eVar.s).apply();
                ks.f(i10).k(79, Long.valueOf(eVar.s));
                f.a(i10).f = false;
                break;
            default:
                vf.c.t(eVar.getContext(), eVar.y);
                break;
        }
    }
}
