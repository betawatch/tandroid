package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z10 implements Runnable {
    public final /* synthetic */ a20 a;

    public z10(a20 a20Var) {
        this.a = a20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
            a20 a20Var = this.a;
            org.telegram.messenger.g0.h3(a20Var.f, 90L);
            try {
                a20Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            a20Var.c = true;
        }
    }
}
