// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
