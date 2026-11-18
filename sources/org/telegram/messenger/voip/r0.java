package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioManager b;

    public /* synthetic */ r0(AudioManager audioManager, int i7) {
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
