package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ s0(AudioManager audioManager, int i10) {
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
