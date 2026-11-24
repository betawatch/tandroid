// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class la5 implements Runnable {
    public final /* synthetic */ ma5 a;

    public la5(ma5 ma5Var) {
        this.a = ma5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || sd2.w(14, sharedInstance.getChat())) {
            ma5 ma5Var = this.a;
            gm.d3(ma5Var.f, 90L);
            try {
                ma5Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ma5Var.c = true;
        }
    }
}
