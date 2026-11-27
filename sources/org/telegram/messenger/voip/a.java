package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VideoCapturerDevice.1.lambda$onStop$0();
                break;
            default:
                VideoCapturerDevice.2.lambda$onFirstFrameAvailable$0();
                break;
        }
    }
}
