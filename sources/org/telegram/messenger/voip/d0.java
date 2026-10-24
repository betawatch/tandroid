package org.telegram.messenger.voip;

import android.media.AudioManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ d0(VoIPService voIPService, AudioManager audioManager, int i10) {
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
                this.b.lambda$configureDeviceForCall$112(this.c);
                break;
        }
    }
}
