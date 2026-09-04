package org.telegram.messenger.voip;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ u(VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$playConnectedSound$88();
                break;
            case 1:
                this.b.lambda$playStartRecordSound$119();
                break;
            case 2:
                this.b.lambda$playAllowTalkSound$120();
                break;
            case 3:
                this.b.lambda$getConnectionAndStartCall$106();
                break;
            case 4:
                this.b.lambda$callFailed$114();
                break;
            case 5:
                this.b.lambda$callFailed$115();
                break;
            case 6:
                this.b.lambda$callEnded$122();
                break;
            case 7:
                this.b.lambda$callEnded$123();
                break;
            case 8:
                this.b.lambda$callEnded$124();
                break;
            case 9:
                this.b.lambda$callEnded$125();
                break;
            case 10:
                this.b.lambda$onCallUpdated$16();
                break;
            case 11:
                this.b.lambda$onCallUpdated$17();
                break;
            case 12:
                this.b.lambda$onCallUpdated$18();
                break;
            case 13:
                this.b.lambda$setMicMute$0();
                break;
            case 14:
                this.b.lambda$switchToSpeaker$92();
                break;
            case 15:
                this.b.lambda$endConnectionServiceCall$126();
                break;
            case 16:
                this.b.lambda$onConnectionStateChanged$116();
                break;
            case 17:
                this.b.lambda$onConnectionStateChanged$117();
                break;
            case 18:
                this.b.lambda$convertToConferenceCall$30();
                break;
            case 19:
                this.b.lambda$initiateActualEncryptedCall$84();
                break;
            case 20:
                this.b.lambda$loadResources$108();
                break;
            case 21:
                this.b.lambda$setupCaptureDevice$14();
                break;
            case 22:
                this.b.lambda$startOutgoingCall$8();
                break;
            case 23:
                this.b.lambda$onStartCommand$2();
                break;
            case 24:
                this.b.lambda$onStartCommand$3();
                break;
            case 25:
                this.b.lambda$declineIncomingCall$104();
                break;
            case 26:
                this.b.callFailed();
                break;
            case 27:
                this.b.lambda$startGroupCheckShortpoll$65();
                break;
            case 28:
                this.b.lambda$onDestroy$99();
                break;
            default:
                this.b.lambda$startConnectingSound$89();
                break;
        }
    }
}
