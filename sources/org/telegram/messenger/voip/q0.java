package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ q0(AudioManager audioManager, int i7) {
        this.a = i7;
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
                VoipAudioManager.lambda$stopBluetooth$2(this.b);
                break;
        }
    }
}
