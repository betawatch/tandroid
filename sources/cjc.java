// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cjc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ cjc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$playStartRecordSound$116();
                break;
            case 1:
                voIPService.lambda$playAllowTalkSound$117();
                break;
            case 2:
                voIPService.lambda$getConnectionAndStartCall$102();
                break;
            case 3:
                voIPService.lambda$callFailed$111();
                break;
            case 4:
                voIPService.lambda$callFailed$112();
                break;
            case 5:
                voIPService.lambda$callEnded$119();
                break;
            case 6:
                voIPService.lambda$callEnded$120();
                break;
            case 7:
                voIPService.lambda$callEnded$121();
                break;
            case 8:
                voIPService.lambda$callEnded$122();
                break;
            case 9:
                voIPService.lambda$onCallUpdated$19();
                break;
            case 10:
                voIPService.lambda$onCallUpdated$20();
                break;
            case 11:
                voIPService.lambda$onCallUpdated$21();
                break;
            case 12:
                voIPService.lambda$setMicMute$0();
                break;
            case 13:
                voIPService.lambda$switchToSpeaker$88();
                break;
            case 14:
                voIPService.lambda$convertToConferenceCall$33();
                break;
            case 15:
                voIPService.updateBroadcastVideoRequests();
                break;
            case 16:
                voIPService.lambda$loadResources$105();
                break;
            case 17:
                voIPService.lambda$setupCaptureDevice$14();
                break;
            case 18:
                voIPService.lambda$startOutgoingCall$8();
                break;
            case 19:
                voIPService.lambda$onStartCommand$2();
                break;
            case 20:
                voIPService.lambda$onStartCommand$3();
                break;
            case 21:
                voIPService.lambda$endConnectionServiceCall$123();
                break;
            case 22:
                voIPService.lambda$initiateActualEncryptedCall$80();
                break;
            case 23:
                voIPService.lambda$declineIncomingCall$100();
                break;
            case 24:
                voIPService.callFailed();
                break;
            case 25:
                voIPService.lambda$startGroupCheckShortpoll$68();
                break;
            case 26:
                voIPService.lambda$onDestroy$95();
                break;
            case 27:
                voIPService.lambda$startConnectingSound$85();
                break;
            case 28:
                voIPService.lambda$onGroupCallUpdated$16();
                break;
            default:
                voIPService.destroyConverting();
                break;
        }
    }
}
