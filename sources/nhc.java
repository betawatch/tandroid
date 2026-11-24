// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class nhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ long d;

    public /* synthetic */ nhc(VoIPService voIPService, TLRPC.Updates updates, long j, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = updates;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.Updates updates = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$49(updates, j);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$41(updates, j);
                break;
        }
    }
}
