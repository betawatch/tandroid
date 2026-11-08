package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ a0(g2 g2Var, int i7) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                if (g2Var.O != null && !g2Var.U) {
                    org.telegram.messenger.g0.r(g2Var.V);
                    g2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = g2Var.O;
                    ConnectionsManager.getInstance(g2Var.N).sendRequestTyped(getgroupcallstars, new d3.b(1), new bi.p5(4, g2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                g2 g2Var2 = this.b;
                org.telegram.messenger.g0.r(g2Var2.d0);
                cc ccVar = g2Var2.W;
                if (ccVar != null) {
                    ccVar.b();
                    g2Var2.W = null;
                }
                long j3 = g2Var2.R;
                if (j3 <= 0) {
                    g2Var2.j();
                    break;
                } else {
                    g2Var2.R = 0L;
                    g2Var2.S = true;
                    g2Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                g2 g2Var3 = this.b;
                g2Var3.e.O(true);
                g2Var3.n.O(true);
                break;
        }
    }
}
