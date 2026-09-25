package org.telegram.messenger.voip;

import android.media.AudioManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$configureDeviceForCall$111(this.c);
                break;
            default:
                this.b.lambda$configureDeviceForCall$110(this.c);
                break;
        }
    }
}
