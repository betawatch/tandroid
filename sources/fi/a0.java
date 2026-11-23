package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ a0(a2 a2Var, int i7) {
        this.a = i7;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a2 a2Var = this.b;
                if (a2Var.P != null && !a2Var.V) {
                    org.telegram.messenger.g0.r(a2Var.W);
                    a2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = a2Var.P;
                    ConnectionsManager.getInstance(a2Var.O).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.r6(7, a2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                a2 a2Var2 = this.b;
                org.telegram.messenger.g0.r(a2Var2.e0);
                fc fcVar = a2Var2.a0;
                if (fcVar != null) {
                    fcVar.b();
                    a2Var2.a0 = null;
                }
                long j3 = a2Var2.S;
                if (j3 <= 0) {
                    a2Var2.j();
                    break;
                } else {
                    a2Var2.S = 0L;
                    a2Var2.T = true;
                    a2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                a2 a2Var3 = this.b;
                a2Var3.e.O(true);
                a2Var3.n.O(true);
                break;
        }
    }
}
