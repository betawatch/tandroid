package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w10 implements Runnable {
    public final /* synthetic */ x10 a;

    public w10(x10 x10Var) {
        this.a = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
            x10 x10Var = this.a;
            org.telegram.messenger.g0.h3(x10Var.f, 90L);
            try {
                x10Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            x10Var.c = true;
        }
    }
}
