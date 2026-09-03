package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ t0(AudioManager audioManager, int i10) {
        this.a = i10;
        this.b = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPService.1.lambda$run$1(this.b);
                break;
            case 1:
                VoIPService.lambda$onDestroy$98(this.b);
                break;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.b);
                break;
        }
    }
}
