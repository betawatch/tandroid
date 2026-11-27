// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ilc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ ilc(VoIPService voIPService, int i, byte b) {
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
                voIPService.lambda$onSignalBarCountChanged$119(i);
                break;
            case 2:
                voIPService.lambda$onConnectionStateChanged$116(i);
                break;
            case 3:
                voIPService.lambda$startConferenceGroupCall$39(i);
                break;
            case 4:
                voIPService.lambda$startScreenCapture$60(i);
                break;
            default:
                voIPService.lambda$updateConnectionState$78(i);
                break;
        }
    }
}
