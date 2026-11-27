// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class glc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ glc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$endConnectionServiceCall$124();
                break;
            case 1:
                voIPService.lambda$playStartRecordSound$117();
                break;
            case 2:
                voIPService.lambda$playAllowTalkSound$118();
                break;
            case 3:
                voIPService.lambda$getConnectionAndStartCall$103();
                break;
            case 4:
                voIPService.lambda$callFailed$112();
                break;
            case 5:
                voIPService.lambda$callFailed$113();
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
                voIPService.lambda$callEnded$123();
                break;
            case 10:
                voIPService.lambda$onCallUpdated$19();
                break;
            case 11:
                voIPService.lambda$onCallUpdated$20();
                break;
            case 12:
                voIPService.lambda$setMicMute$0();
                break;
            case 13:
                voIPService.lambda$onCallUpdated$21();
                break;
            case 14:
                voIPService.lambda$switchToSpeaker$89();
                break;
            case 15:
                voIPService.lambda$convertToConferenceCall$33();
                break;
            case 16:
                voIPService.updateBroadcastVideoRequests();
                break;
            case 17:
                voIPService.lambda$initiateActualEncryptedCall$81();
                break;
            case 18:
                voIPService.lambda$loadResources$106();
                break;
            case 19:
                voIPService.lambda$setupCaptureDevice$14();
                break;
            case 20:
                voIPService.lambda$startOutgoingCall$8();
                break;
            case 21:
                voIPService.lambda$onStartCommand$2();
                break;
            case 22:
                voIPService.lambda$onStartCommand$3();
                break;
            case 23:
                voIPService.lambda$createFirstGroupInstance$69();
                break;
            case 24:
                voIPService.lambda$declineIncomingCall$101();
                break;
            case 25:
                voIPService.callFailed();
                break;
            case 26:
                voIPService.lambda$startGroupCheckShortpoll$68();
                break;
            case 27:
                voIPService.lambda$onDestroy$96();
                break;
            case 28:
                voIPService.lambda$startConnectingSound$86();
                break;
            default:
                voIPService.lambda$onGroupCallUpdated$16();
                break;
        }
    }
}
