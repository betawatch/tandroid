// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class jlc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.GroupCallParticipant c;

    public /* synthetic */ jlc(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, byte b) {
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
