// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l85 implements Runnable {
    public final /* synthetic */ m85 a;

    public l85(m85 m85Var) {
        this.a = m85Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || hc2.w(14, sharedInstance.getChat())) {
            m85 m85Var = this.a;
            gl.e3(m85Var.f, 90L);
            try {
                m85Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            m85Var.c = true;
        }
    }
}
