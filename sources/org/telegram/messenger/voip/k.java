package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VideoCapturerDevice.1.lambda$onStop$0();
                break;
            case 1:
                VideoCapturerDevice.2.lambda$onFirstFrameAvailable$0();
                break;
            case 2:
                VoIPPreNotificationService.lambda$dismiss$5();
                break;
            case 3:
                VoIPService.lambda$startConferenceGroupCall$35();
                break;
            case 4:
                VoIPService.lambda$startOutgoingCall$6();
                break;
            case 5:
                VoIPService.lambda$startGroupCall$24();
                break;
            case 6:
                VoIPService.lambda$onDestroy$97();
                break;
            case 7:
                VoIPService.lambda$configureDeviceForCall$109();
                break;
            default:
                VoIPService.lambda$acceptIncomingCall$100();
                break;
        }
    }
}
