package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ b0(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b;
                if (m2Var.O != null && !m2Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.V);
                    m2Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = m2Var.O;
                    ConnectionsManager.getInstance(m2Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new bi.m5(4, m2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                m2 m2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(m2Var2.d0);
                qc qcVar = m2Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    m2Var2.W = null;
                }
                long j10 = m2Var2.R;
                if (j10 <= 0) {
                    m2Var2.j();
                    break;
                } else {
                    m2Var2.R = 0L;
                    m2Var2.S = true;
                    m2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                m2 m2Var3 = this.b;
                m2Var3.e.O(true);
                m2Var3.n.O(true);
                break;
        }
    }
}
