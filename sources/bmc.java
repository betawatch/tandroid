// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class bmc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ bmc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.destroyConverting();
                break;
            case 1:
                voIPService.lambda$updateConnectionState$79();
                break;
            case 2:
                voIPService.lambda$updateConnectionState$80();
                break;
            case 3:
                voIPService.lambda$playConnectedSound$85();
                break;
            case 4:
                voIPService.lambda$onConnectionStateChanged$114();
                break;
            default:
                voIPService.lambda$onConnectionStateChanged$115();
                break;
        }
    }
}
