package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
