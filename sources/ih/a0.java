package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ a0(h2 h2Var, int i9) {
        this.a = i9;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h2 h2Var = this.b;
                if (h2Var.K != null && !h2Var.Q) {
                    AndroidUtilities.cancelRunOnUIThread(h2Var.R);
                    h2Var.Q = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = h2Var.K;
                    ConnectionsManager.getInstance(h2Var.J).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new bg.y0(6, h2Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                h2 h2Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(h2Var2.W);
                gc gcVar = h2Var2.S;
                if (gcVar != null) {
                    gcVar.b();
                    h2Var2.S = null;
                }
                long j10 = h2Var2.N;
                if (j10 <= 0) {
                    h2Var2.j();
                    break;
                } else {
                    h2Var2.N = 0L;
                    h2Var2.O = true;
                    h2Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                h2 h2Var3 = this.b;
                h2Var3.e.N(true);
                h2Var3.n.N(true);
                break;
        }
    }
}
