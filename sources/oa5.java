// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oa5 implements Runnable {
    public final /* synthetic */ pa5 a;

    public oa5(pa5 pa5Var) {
        this.a = pa5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, sharedInstance.getChat())) {
            pa5 pa5Var = this.a;
            hl.d3(pa5Var.f, 90L);
            try {
                pa5Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            pa5Var.c = true;
        }
    }
}
