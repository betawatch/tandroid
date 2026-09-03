package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.GroupCallParticipant c;

    public /* synthetic */ e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.a = i10;
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
