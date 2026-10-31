package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d20 implements Runnable {
    public final /* synthetic */ e20 a;

    public d20(e20 e20Var) {
        this.a = e20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
            e20 e20Var = this.a;
            org.telegram.messenger.i0.h3(e20Var.f, 90L);
            try {
                e20Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            e20Var.c = true;
        }
    }
}
