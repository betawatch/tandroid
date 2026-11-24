// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class djc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ djc(VoIPService voIPService, int i, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCall$28(i);
                break;
            case 1:
                voIPService.lambda$onSignalBarCountChanged$118(i);
                break;
            case 2:
                voIPService.lambda$onConnectionStateChanged$115(i);
                break;
            case 3:
                voIPService.lambda$startConferenceGroupCall$39(i);
                break;
            case 4:
                voIPService.lambda$startScreenCapture$60(i);
                break;
            default:
                voIPService.lambda$updateConnectionState$77(i);
                break;
        }
    }
}
