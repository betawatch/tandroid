// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ejc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.GroupCallParticipant c;

    public /* synthetic */ ejc(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = groupCallParticipant;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.GroupCallParticipant groupCallParticipant = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCall$29(groupCallParticipant);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$40(groupCallParticipant);
                break;
        }
    }
}
