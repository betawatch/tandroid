package ei;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ac;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ c0(k2 k2Var, int i3) {
        this.a = i3;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                if (k2Var.P != null && !k2Var.V) {
                    org.telegram.messenger.g0.r(k2Var.W);
                    k2Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = k2Var.P;
                    ConnectionsManager.getInstance(k2Var.O).sendRequestTyped(getgroupcallstars, new c3.b(1), new ai.q4(5, k2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                k2 k2Var2 = this.b;
                org.telegram.messenger.g0.r(k2Var2.e0);
                ac acVar = k2Var2.a0;
                if (acVar != null) {
                    acVar.b();
                    k2Var2.a0 = null;
                }
                long j10 = k2Var2.S;
                if (j10 <= 0) {
                    k2Var2.j();
                    break;
                } else {
                    k2Var2.S = 0L;
                    k2Var2.T = true;
                    k2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                k2 k2Var3 = this.b;
                k2Var3.e.O(true);
                k2Var3.n.O(true);
                break;
        }
    }
}
