package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
