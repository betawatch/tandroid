// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g85 implements jm7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ j5 c;

    public g85(long j, LaunchActivity launchActivity, j5 j5Var) {
        this.a = j;
        this.b = launchActivity;
        this.c = j5Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        qd2 qd2Var;
        TLRPC.GroupCall groupCall;
        if (VoIPService.getSharedInstance() != null) {
            nm7.e().n(this, nm7.v2);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || (qd2Var = sharedInstance.groupCall) == null || (groupCall = qd2Var.b) == null || groupCall.id != this.a || this.b.isFinishing()) {
                return;
            }
            g95.S0(this.b, this.c, null, null, false, null);
        }
    }
}
