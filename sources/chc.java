// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class chc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ chc(VoIPService voIPService, int i, byte b) {
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
