// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
