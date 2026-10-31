package ag;

import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        j jVar = this.b;
        switch (i10) {
            case 0:
                jVar.a();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = jVar.a;
                disablepeerconnectedbot.peer = vp.r1(i11).i1(jVar.s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                vp.r1(i11).e7.edit().remove("dialog_botid" + jVar.s).remove("dialog_boturl" + jVar.s).remove("dialog_botflags" + jVar.s).apply();
                zs.f(i11).k(79, Long.valueOf(jVar.s));
                k.a(i11).f = false;
                break;
            default:
                gf.f.r(jVar.getContext(), jVar.y);
                break;
        }
    }
}
