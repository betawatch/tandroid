package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p10 implements Runnable {
    public final /* synthetic */ q10 a;

    public p10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
            q10 q10Var = this.a;
            org.telegram.messenger.g0.i3(q10Var.f, 90L);
            try {
                q10Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            q10Var.c = true;
        }
    }
}
