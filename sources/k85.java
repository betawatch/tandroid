// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k85 implements fn7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ k5 c;

    public k85(long j, LaunchActivity launchActivity, k5 k5Var) {
        this.a = j;
        this.b = launchActivity;
        this.c = k5Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        if (VoIPService.getSharedInstance() != null) {
            jn7.e().n(this, jn7.v2);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || (vc2Var = sharedInstance.groupCall) == null || (groupCall = vc2Var.b) == null || groupCall.id != this.a || this.b.isFinishing()) {
                return;
            }
            j95.T0(this.b, this.c, null, null, false, null);
        }
    }
}
