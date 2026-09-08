package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
