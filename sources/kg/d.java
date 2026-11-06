package kg;

import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                disablepeerconnectedbot.peer = qp.s1(i10).j1(eVar.s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                qp.s1(i10).d7.edit().remove("dialog_botid" + eVar.s).remove("dialog_boturl" + eVar.s).remove("dialog_botflags" + eVar.s).apply();
                qs.f(i10).k(79, Long.valueOf(eVar.s));
                f.a(i10).f = false;
                break;
            default:
                vf.c.t(eVar.getContext(), eVar.y);
                break;
        }
    }
}
