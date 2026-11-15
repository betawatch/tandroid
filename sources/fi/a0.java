package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ a0(c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                if (c2Var.P != null && !c2Var.V) {
                    org.telegram.messenger.g0.r(c2Var.W);
                    c2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = c2Var.P;
                    ConnectionsManager.getInstance(c2Var.O).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.e4(5, c2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                c2 c2Var2 = this.b;
                org.telegram.messenger.g0.r(c2Var2.e0);
                xb xbVar = c2Var2.a0;
                if (xbVar != null) {
                    xbVar.b();
                    c2Var2.a0 = null;
                }
                long j3 = c2Var2.S;
                if (j3 <= 0) {
                    c2Var2.j();
                    break;
                } else {
                    c2Var2.S = 0L;
                    c2Var2.T = true;
                    c2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                c2 c2Var3 = this.b;
                c2Var3.e.O(true);
                c2Var3.n.O(true);
                break;
        }
    }
}
