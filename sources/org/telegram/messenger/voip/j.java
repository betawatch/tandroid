package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
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
                VoIPService.lambda$acceptIncomingCall$100();
                break;
            case 4:
                VoIPService.lambda$configureDeviceForCall$110();
                break;
            case 5:
                VoIPService.lambda$startConferenceGroupCall$35();
                break;
            case 6:
                VoIPService.lambda$startOutgoingCall$6();
                break;
            case 7:
                VoIPService.lambda$startGroupCall$24();
                break;
            default:
                VoIPService.lambda$onDestroy$97();
                break;
        }
    }
}
