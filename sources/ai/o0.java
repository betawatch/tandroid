package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ o0(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                if (s3Var.O != null && !s3Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(s3Var.V);
                    s3Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = s3Var.O;
                    ConnectionsManager.getInstance(s3Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new m0(0, s3Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(s3Var2.d0);
                org.telegram.ui.Components.tc tcVar = s3Var2.W;
                if (tcVar != null) {
                    tcVar.b();
                    s3Var2.W = null;
                }
                long j3 = s3Var2.R;
                if (j3 <= 0) {
                    s3Var2.j();
                    break;
                } else {
                    s3Var2.R = 0L;
                    s3Var2.S = true;
                    s3Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                s3 s3Var3 = this.b;
                s3Var3.e.N(true);
                s3Var3.n.N(true);
                break;
        }
    }
}
