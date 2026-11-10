package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.GroupCallParticipant c;

    public /* synthetic */ c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.a = i7;
        this.b = voIPService;
        this.c = groupCallParticipant;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$37(this.c);
                break;
            default:
                this.b.lambda$startGroupCall$26(this.c);
                break;
        }
    }
}
