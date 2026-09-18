package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ o0(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r3 r3Var = this.b;
                if (r3Var.O != null && !r3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(r3Var.V);
                    r3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = r3Var.O;
                    ConnectionsManager.getInstance(r3Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new m0(0, r3Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                r3 r3Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(r3Var2.d0);
                org.telegram.ui.Components.qc qcVar = r3Var2.W;
                if (qcVar != null) {
                    qcVar.b();
                    r3Var2.W = null;
                }
                long j3 = r3Var2.R;
                if (j3 <= 0) {
                    r3Var2.j();
                    break;
                } else {
                    r3Var2.R = 0L;
                    r3Var2.S = true;
                    r3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                r3 r3Var3 = this.b;
                r3Var3.e.N(true);
                r3Var3.n.N(true);
                break;
        }
    }
}
