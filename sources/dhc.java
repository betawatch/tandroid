// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class dhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.GroupCallParticipant c;

    public /* synthetic */ dhc(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, byte b) {
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
